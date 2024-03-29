define(["dojo/_base/array", "dojo/_base/lang", "dojo/dom-construct", "dojo/_base/json"], 
		function(array, lang, domConstruct, json){
	
	var divContenido;
	var correos;
	var clienteDefault = {
			nombre: "Carlos Urbina",
			email: "curbina@gmail.com"
		};
	var clientes = [clienteDefault,{
		nombre: "Edgar Arenas",
		email: "earenas@gmail.com"
	},{
		nombre: "Usain Bolt",
		email: "ubolt@gmail.com"
	}];
	
	function ejemploForEach(){		
		domConstruct.place("<p>---Nombres de clientes: </p>", divContenido);
		var listaClientes = "<ul>";
		array.forEach(clientes, function(c){
			listaClientes += "<li>"+c.nombre+"</li>";
		});
		listaClientes += "</ul>";
		domConstruct.place(listaClientes, divContenido);		
	}
	
	function ejemploMap(){
		domConstruct.place("<p>---Array de correos: </p>", divContenido);
		correos = array.map(clientes, function(c){
			return c.email;
		});
		domConstruct.place("<span>"+json.toJson(correos)+"</span>", divContenido);
	}
	
	function ejemploIndexOf(){
		domConstruct.place("<p>---Usando indexOf: </p>", divContenido);
		domConstruct.place("<span>Indice de ubolt@gmail.com en arreglo: "+array.indexOf(correos, "ubolt@gmail.com")+"</span><br/>", divContenido);
		domConstruct.place("<span>Indice de paco@gmail.com en arreglo: "+array.indexOf(correos, "paco@gmail.com")+"</span><br/>", divContenido);
	}
	
	function ejemploObjetoArreglo(){
		var funcionVacia = function(){};
		domConstruct.place("<p>---Usando isObject/isFunction: </p>", divContenido);
		domConstruct.place("<span>¿La variable clientes es un objeto?: "+lang.isObject(clientes)+"</span><br/>", divContenido);
		domConstruct.place("<span>¿La variable funcionVacia es un función?: "+lang.isFunction(funcionVacia)+"</span><br/>", divContenido);
	}
	
	function ejemploMixin(){
		domConstruct.place("<p>---Usando mixin: </p>", divContenido);
		lang.mixin(clienteDefault, {
			nombre: "Pancho López",
			edad: 25,
			sexo: "A veces"
		});
		domConstruct.place("<span>"+json.toJson(clientes)+"</span>", divContenido);
	}
	
	function init(divEjemplos){
		divContenido = divEjemplos;
		ejemploForEach();
		ejemploMap();
		ejemploIndexOf();
		ejemploObjetoArreglo();
		ejemploMixin();
		domConstruct.place('<p>---Elegir una función de: <a href="https://dojotoolkit.org/reference-guide/1.7/dojo/index.html">Referencia DOJO</a> e implementar un ejemplo usándola.</p>', divContenido);
	}
	
	return {
		init: init
	};	
});