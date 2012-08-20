//
define([], function(){
		
	function init(divEjemplos){
		divEjemplos.innerHTML = "Saludos desde el módulo AMD";
	}
	
	return {
		init: init
	};
});