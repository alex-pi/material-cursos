//
define(["dojo/text!static/html/primerEjercicio.html"], 
		function(primerEjercicio){
		
	function init(divEjemplos){
		divEjemplos.innerHTML = primerEjercicio;
	}
	
	return {
		init: init
	};
});