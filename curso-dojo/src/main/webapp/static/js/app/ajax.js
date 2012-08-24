define(["dojo/_base/xhr", "dojo/dom-construct", 
        "dojo/_base/json", "dojo/DeferredList"], 
		function(xhr, domConstruct, json, DeferredList){
	var divContenido;
	
	function init(divEjemplos){
		divContenido = divEjemplos;
		
		var def1 = xhr.get({
			handleAs: "json",
			url: dojo.config.app.urlBase + "clientes/1",
			load: function(data){
				domConstruct.place("<p>---Volvió petición para cliente 1: </p>", divContenido);
				domConstruct.place("<span>"+json.toJson(data)+"</span>", divContenido);
			}
		});
		
		var def2 = xhr.get({
			handleAs: "json",
			url: dojo.config.app.urlBase + "clientes/2",
			load: function(data){
				domConstruct.place("<p>---Volvió petición para cliente 2: </p>", divContenido);
				domConstruct.place("<span>"+json.toJson(data)+"</span>", divContenido);				
			}
		});		
		
		var dl = new DeferredList([def1, def2]);
		
		dl.then(function(){
			domConstruct.place("<p>---¿Cómo podría mostrar este mensaje justo cuando ambas peticiones hayan vuelto?: </p>", divContenido);
		});
	}
	
	return {
		init: init
	};
});