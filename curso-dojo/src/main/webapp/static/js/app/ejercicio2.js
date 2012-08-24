/**
 * Crear un módulo que al iniciar pida en dos peticiones asíncronas:
 * 
 *   1) Listado de clientes.
 *   2) Listado de libros.
 *   
 * Para cada lista debe mostrar un select. Por ejemplo:
 * 
 * <select>
 * 	<option value="1">Carlos Urbina</option>
 * 	<option value="2">Usain Bolt</option>
 * </select>
 * 
 * Estos selects serán creados hasta que ambas peticiones hayan vuelto.
 * 
 */
define(["dojo/_base/xhr", "dojo/dom-construct", 
        "dojo/DeferredList", "dojo/_base/Deferred", "dojo/dom", "dojo/_base/array",
        "dojo/_base/json", "dojo/text!static/html/ejercicio2.html"], 
		function(xhr, domConstruct, DeferredList, Deferred,
				dom, array, json, template){
	
	var htmlOpsClientes = "",
		htmlOpsLibros = "";
	
	function searchAmazon(){
	  var d = new dojo.Deferred();
	  setTimeout(function(){
	    d.resolve("We found books at amazon");	    
	  }, 7000);
	  return d;
	}	
	
	function inicializar(divEjemplos){
		// Aqui hacemos los xhr.get
		
		var defL = xhr.get({
			handleAs: "json",
			url: dojo.config.app.urlBase + "clientes",
			load: function(clientes){
				array.forEach(clientes, function(c){
					htmlOpsClientes += '<option value="">'+c.nombreCompleto+'</option>';
				});
			}
		});
		
		var defC = xhr.get({
			handleAs: "json",
			url: dojo.config.app.urlBase + "clientes/libros",
			load: function(libros){
				array.forEach(libros, function(libro){
					htmlOpsLibros += '<option value="">'+libro.titulo+'</option>';
				});				
			}
		});		
		
		var otroDef = searchAmazon();
		
		var dList = new DeferredList([defC, defL, otroDef]);
		
		dList.then(function(results){
			console.log(results);
			domConstruct.place(template, divEjemplos);
			domConstruct.place(htmlOpsClientes, "sltCliente");
			domConstruct.place(htmlOpsLibros, "sltLibro");
		});
		
		console.log("Esto aparece primero.");
	}
	
	return {
		init: inicializar
	};
	
});