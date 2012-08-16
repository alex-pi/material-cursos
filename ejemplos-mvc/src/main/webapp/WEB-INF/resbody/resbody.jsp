<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">
<head>
  	<title>Uso de ResponseBody.</title>
  	<link rel="stylesheet" href="/ejemplos-mvc/css/style.css" media="screen">
  	<script src="/ejemplos-mvc/js/jquery-1.7.2.js"></script>
  	<script src="/ejemplos-mvc/js/jquery.json-2.3.js"></script>
  	<script>
  		$(document).ready(function() {
  			var btnBuscar = $("#btnBuscar");
  			var detalle = $("#detalle");
  			btnBuscar.click(function(){
  				if($("#nombreCompleto").val() === ''){
  					return;
  				}
  				
				$.ajax({
					  url: "/ejemplos-mvc/mvc/ejemplos/usoresbody/buscar",
					  type: 'post',
					  data: $("#nombreCompleto").val(),
					  success: function (cliente){
						  detalle.html('');
						  if(!cliente){
							  detalle.html('No encontrado');
							  return;
						  }
						  detalle.append("<span>Nombre: " + cliente.nombreCompleto + "</span><br/>");
						  detalle.append("<span>email: " + cliente.email + "</span><br/>");
						  detalle.append("<span>Edad: " + cliente.edad + "</span><br/>");
					  },
					  dataType: 'json',
					  contentType: "application/json; charset=utf-8"
					});  				
 			});
  		});  	
  	</script>
</head>
<body>
<pre>
Este ejemplo hace uso de ResponseBody y un MessageConverter para devolver la información
de un cliente en formato json.

Los archivos que participan:
	- UsoResponseBody.java
</pre>
<h2>Buscar.</h2>

<label for="nombreCompleto">Nombre a buscar: </label> <input id="nombre" type="text" /><br/>
	
<button id="btnBuscar">Buscar</button><br/>

<div id="detalle" style="margin: 20px;"></div>
</body>
</html>
