<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">
<head>
  	<title>Ejercicio 5.</title>
  	<link rel="stylesheet" href="/ejercicios-mvc/css/style.css" media="screen">
  	<script src="/ejemplos-mvc/js/jquery-1.7.2.js"></script>
  	<script src="/ejemplos-mvc/js/jquery.json-2.3.js"></script>  	
  	<script>
  	$(document).ready(function() {
  		//Escriba aqui el javascript necesario.
  	});
  	</script>
</head>
<body>
<pre>
Crear un controlador nuevo (Ejercicio5Controller) que permita:

1) Registrar un nuevo libro enviando la información en formato json y usando una petición ajax.
2) El controlador devolverá un listado en formato json. La información de este listado será mostrada dentro del div
	con id "listado".
	
		@ResponseBody
		public List<LibroVO> registrar(@RequestBody ClienteVO cliente){ ...
			
3) Por cada elemento del listado se mostrará un botón que permita eliminar ese elemento enviando su id en
	una petición ajax. Aqui también se deberá actualizar el listado de libros.
	

Nota: para recorrer el objeto javascript con el listado devuelto puede hacerlo con un simple "for" o usando "$.each()".

</pre>

<form>
<!-- Crear aqui el nuevo formulario de registro-->
</form>

<div id="listado">
<!-- Aqui actualice el listado cuando registre o elimine algún libro -->
</div>
</body>
</html>
