<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">
<head>
  	<title>Uso simple de PathVariable.</title>
  	<script src="/ejemplos-mvc/js/jquery-1.7.2.js"></script>
  	<link rel="stylesheet" href="/ejemplos-mvc/css/style.css" media="screen">
  	<script>
	  	$(document).ready(function() {
	  		var btn = $('#btnBuscar');
	  		var txtNombre = $('#nombre');
	  		btn.click(function(){
	  			if(txtNombre.val() === ''){
	  				return;
	  			}
	  			window.location.href = '/ejemplos-mvc/mvc/ejemplos/usopathv/buscar/' + txtNombre.val();
	  		});
	  	});	
  	</script>
</head>
<body>
<pre>
El ejemplo muestra el uso de PathVariables, es decir, variables que son parte del url enviado:

	- Si el url se manda como : usopathv/buscar/' + txtNombre.val()
	- Se resivirá así : 
		@RequestMapping(value="/buscar/{nombre}")
		public ModelAndView buscar(@PathVariable String nombre){	...

Esto es conocido como "URI templates".

Los archivos que participan en el ejemplo:
	/WEB-INF/pathvar/*
	UsoPathVariable.java
	
</pre>
<h2>Buscar.</h2>

<label for="nombreCompleto">Nombre a buscar: </label> <input id="nombre" type="text" /><br/>
	
<button id="btnBuscar">Buscar</button>
</body>
</html>
