define(["dijit/form/NumberTextBox", "dijit/form/CurrencyTextBox", "dijit/form/TimeTextBox", 
         "dijit/form/DateTextBox", "dijit/form/Button", "dojo/dom-construct", "dojo/date", 
         "dojo/on", "dojo/text!static/html/textBoxes.html"], 
		function(NumberTextBox, CurrencyTextBox, TimeTextBox, DateTextBox, Button, domConstruct, date, on, template) {
	
	var divContenido;
	
	function init(divEjemplos) {
		divContenido = divEjemplos;
		domConstruct.place(template, divContenido);
		var txtEdad = new NumberTextBox({
			value: 30,
			required: true
		}, "txtEdad");
		txtEdad.startup();
	
		var txtPago = new CurrencyTextBox({
			value:54775.53,
			required:true,
			constraints:{fractional:true},
			currency:"MXN",
			invalidMessage:"Debe colocar centavos."
		}, "txtPago");
		txtPago.startup();
	
		var txtHoraCita = new TimeTextBox({
			constraints: {
				timePattern: "HH:mm:ss",
				clickableIncrement: "T00:15:00",
				visibleIncrement: "T00:15:00",
				visibleRange: "T01:00:00"
			},
			invalidMessage:"Horario inválido."
		},"txtHoraCita");
		txtHoraCita.startup();
	
		var txtFecha = new DateTextBox({
			value: new Date(1982, 3, 26)
		}, "txtFecha");
		txtFecha.startup();
		
		var btn = new Button({
		    type: 'button',
		    label: 'Valores'
//		    onClick: function(){
//		    	var fecha = txtFecha.get('value');
//		    	console.log(date.add(fecha, "year", -2));	  
//		    	console.log(txtPago.get('value'));
//		    }
		    	
		}, 'btnValores');	
		
		on(btn, "click", function(){
	    	var fecha = txtFecha.get('value');
	    	console.log(date.add(fecha, "year", -2));	  
	    	console.log(txtPago.get('value'));
	    });
	}
	
	return {
		init: init
	};
});