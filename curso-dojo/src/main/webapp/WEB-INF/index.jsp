<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="utf-8">
  	<title>Curso de Dojo.</title>
	<link rel="stylesheet" href="static/css/style.css" media="screen">
  	<link rel="stylesheet" href="static/js/libs/dijit/themes/soria/soria.css" media="screen">
  	
  	<script>
  		dojoConfig= {
			has: {
	            "dojo-firebug": true,
	            "dojo-debug-messages": true
	        },  				
  	        app: {
  	        	urlBase: '<c:url value="/mvc/"/>',
  	        	urlStatic: '<c:url value="/static/"/>'
  	        	},
  	        packages:[{
  	        	name: 'app',
  	        	location: '<c:url value="/static/"/>js/app'
  	        },{
  	        	name: 'content',
  	        	location: '<c:url value="/mvc"/>'
  	        },{
  	        	name: 'static',
  	        	location: '<c:url value="/static"/>'
  	        }],
  	      	parseOnLoad: false,
  	        async: true,
  	      	debugAtAllCosts: true,
  	      	ioPublish: true,
  	      	cacheBust: true
  	    };  		
  	</script>
  	<script src="static/js/libs/dojo/dojo.js"></script>
	<script>
		require(["dojo/_base/xhr", "dojo/_base/array", "dojo/string", 
		         "dojo/dom", "dojo/dom-prop", "dojo/query", "dojo/dom-construct", "dojo/domReady!"],
		        function(xhr, arrayUtil, string, dom, props, query, domConstruct){
					var divEjemplos = dom.byId("divEjemplos");
					query(".opMenu").on("click", function(event){
						domConstruct.empty("divEjemplos");
						var mod = props.get(event.target, "id");
						
						require(["app/"+mod], function(modulo){
							modulo.init(divEjemplos);
						});
					});
        });
	</script>               
</head>
	<body class="soria">
		<h4>Menu de ejemplos:</h4>
		<div id="menu">
			<a id="saludoAMD" class="opMenu" href="#">Saludo AMD</a><br/>
			<a id="utilsDojo" class="opMenu" href="#">Util dojo</a><br/>
			<a id="ajax" class="opMenu" href="#">Ajax</a><br/>
			<a id="dijitSelect" class="opMenu" href="#">Dijit Select</a><br/>
			<a id="dijitSelectConStore" class="opMenu" href="#">Dijit Select con Store</a><br/>
			<a id="dijitTextBoxes" class="opMenu" href="#">Dijit text boxes</a><br/>
		</div>
		<h4>Mostrando ejemplo/ejercicio: </h4>
        <div id="divEjemplos">
			
        </div>
    </body>
</html>
