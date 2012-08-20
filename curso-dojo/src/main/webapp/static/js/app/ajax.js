define(["dojo/_base/xhr", "dojo/dom-construct", "dojo/_base/json"], 
		function(xhr, domConstruct, json){
	var divContenido;
	
	function init(divEjemplos){
		divContenido = divEjemplos;
		
		xhr.get({
			handleAs: "json",
			url: dojo.config.app.urlBase + "clientes/1",
			load: function(data){
				domConstruct.place("<p>---Volvió petición para cliente 1: </p>", divContenido);
				domConstruct.place("<span>"+json.toJson(data)+"</span>", divContenido);
			}
		});
		
		xhr.get({
			handleAs: "json",
			url: dojo.config.app.urlBase + "clientes/2",
			load: function(data){
				domConstruct.place("<p>---Volvió petición para cliente 2: </p>", divContenido);
				domConstruct.place("<span>"+json.toJson(data)+"</span>", divContenido);				
			}
		});		

		domConstruct.place("<p>---¿Cómo podría mostrar este mensaje justo cuando ambas peticiones hayan vuelto?: </p>", divContenido);
	}
	
	return {
		init: init
	};
});