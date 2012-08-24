/**
 * Crear dos selects con dijit.
 * 
 * - El primero mostrará los años de publicación de los libros en catálogo.
 * - El segundo mostrará los títulos de los libros publicados en el año seleccionado en el primer select.
 * 
 * El html de tus selects deberás obtenerlo de un template (archivo html) que debes crear en el directorio static/html
 * 
 * Nota: Esta lógica podría implementarse haciendo una única consulta al servidor (todos los libros). El resto
 * 	sería usar esa colección de libros.
 * 
 */
define(["dijit/form/Select", "dojo/_base/xhr", "dojo/_base/array", 
        "dojo/dom-construct", "dojox/lang/functional", 
        "dojo/text!static/html/ejercicio3.html"], 
		function(Select, xhr, array, domConstruct, functional, template){
	var divContenido,
		catalogoPorAnio = {},
		sltAnios,
		sltTitulos;
	
	function crearSelects(libros){
		
		array.forEach(libros, function(libro){
			var arregloLibros = catalogoPorAnio[libro.anio];
			if(!arregloLibros){
				arregloLibros = [];
				catalogoPorAnio[libro.anio] = arregloLibros;
			}
			arregloLibros.push(libro);
		});
		
		var anios = [];
		for(anioLlave in catalogoPorAnio){
			console.log(catalogoPorAnio[anioLlave]);
			anios.push({value: anioLlave, label: anioLlave});
		}		
		
		obj1.prop1 = "valor";
		obj1["123"] = "valor";
		
		sltAnios = new Select({
            options: anios,
            onChange: function(anio){
            	console.log(catalogoPorAnio[anio]);
            	sltTitulos.removeOption(sltTitulos.getOptions());
            	array.forEach(catalogoPorAnio[anio], function(libro){
            		sltTitulos.addOption({value: libro.id, label: libro.titulo});
            	});
            }
		}, 'sltAnios');
		
		
		sltTitulos = new Select({
			name: "sltTitulos"
		}, 'sltTitulos');	
	}
	
	function init(divEjemplos){
		divContenido = divEjemplos;
		domConstruct.place(template, divContenido);
		
		xhr.get({
			handleAs: "json",
			url: dojo.config.app.urlBase + "clientes/libros",
			load: crearSelects
		});		
	}
	
	return {
		init: init
	};
});