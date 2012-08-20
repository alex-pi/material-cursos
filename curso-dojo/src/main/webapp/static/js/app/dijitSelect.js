define(["dijit/form/Select", "dojo/_base/xhr", "dojo/_base/array", "dojo/dom-construct", "dojo/text!static/html/selectSimple.html"], 
		function(Select, xhr, array, domConstruct, selectSimple){
	var divContenido,
		sltClientes;
	
	function init(divEjemplos){
		divContenido = divEjemplos;
		domConstruct.place(selectSimple, divContenido);
		
		xhr.get({
			handleAs: "json",
			url: dojo.config.app.urlBase + "clientes",
			load: function(clientes){
				var opciones = array.map(clientes, function(c){
					return {value: c.id, label: c.nombreCompleto};
				});
				sltClientes = new Select({
	                options: opciones,
	                onChange: function(){
	                	domConstruct.place("<p>---Seleccionado: " +sltClientes.get("value")+ "</p>", divContenido);
	                }
				}, 'sltClientes');				
			}
		});		
	}
	
	return {
		init: init
	};
});