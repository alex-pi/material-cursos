define(["dijit/form/Select", "dojo/_base/xhr", "dojo/_base/array", "dojo/dom-construct", 
        "dojo/store/JsonRest", "dojo/data/ObjectStore", "dojo/text!static/html/selectSimple.html"], 
		function(Select, xhr, array, domConstruct, JsonRest, ObjectStore, selectSimple){
	var divContenido,
		sltClientes,
		store,
		objStore;
	
	function init(divEjemplos){
		divContenido = divEjemplos;
		domConstruct.place(selectSimple, divContenido);

		store = new JsonRest({
			target: dojo.config.app.urlBase + "clientes"
		});
		objStore = new ObjectStore({ 
			objectStore: store,			
			idProperty: "id",
			getLabel: function(object){
				return object.nombreCompleto;
			}
		});
		
		sltClientes = new Select({
			store: objStore,
	        onChange: function(){
	        	domConstruct.place("<p>---Seleccionado: " +sltClientes.get("value")+ "</p>", divContenido);
	        }
		}, 'sltClientes');				
		sltClientes.startup();
		
		// Modificar para usar un query del store.
	}
	
	return {
		init: init
	};
});