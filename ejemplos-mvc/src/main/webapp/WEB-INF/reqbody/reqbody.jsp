<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">
<head>
  	<title>Uso de RequestBody.</title>
  	<link rel="stylesheet" href="/ejemplos-mvc/css/style.css" media="screen">
  	<script src="/ejemplos-mvc/js/jquery-1.7.2.js"></script>
  	<script src="/ejemplos-mvc/js/jquery.json-2.3.js"></script>
  	<script>
  		$(document).ready(function() {
  			var btnRegistrar = $("#btnRegistrar");
  			var divListado = $("#divListado");
  			btnRegistrar.click(function(){
  				var cliente = {
					nombreCompleto: $("#nombreCompleto").val(),
					email: $("#email").val(),
					edad: $("#edad").val()
  				};
  				
				$.ajax({
					  url: "/ejemplos-mvc/mvc/ejemplos/usoreqbody/registrar",
					  type: 'post',
					  data: $.toJSON(cliente),
					  success: function (data){
						  divListado.html(data);
					  },
					  dataType: 'html',
					  contentType: "application/json; charset=utf-8"
					});  				
 			});
  		});  	
  	</script>
</head>
<body>
<pre>
El ejemplo muestra los siguiente:

- Por medio de RequestBody y un MessageConverter registrado (servlet-context.xml) se puede recibir
  una petición en formato json y convertirla automáticamente a un objeto java.
- Por medio de ajax se puede obtener la respuesta del controlador y procesarla dentro de la misma página.

En este caso el html del listado obtenido se inserta dentro del documento. Más exactamente dentro del div con id "divListado".

Los archivos que participan:
	- UsoRequestBody.java
	- WEB-INF/reqbody/*			
</pre>
<h2>Registro de cliente.</h2>
<form>
	<label for="nombreCompleto">Nombre: </label> <input id="nombreCompleto" name="nombreCompleto" type="text" /><br/>
	<label for="email">email: </label><input id="email" name="email" type="text" /><br/>
	<label for="edad">Edad: </label><input id="edad" name="edad" type="text" /><br/>
	
	<button id="btnRegistrar" type="button">Registrar</button>
</form>
<div id="divListado"></div>
</body>
</html>
