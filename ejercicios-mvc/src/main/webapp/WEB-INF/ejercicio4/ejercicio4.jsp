<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">
<head>
  	<title>Ejercicio 4.</title>
  	<link rel="stylesheet" href="/ejercicios-mvc/css/style.css" media="screen">
</head>
<body>
<pre>
Crear un controlador más (Ejercicio4Controller) que permita:

1) Mostrar esta vista.
2) Registrar un libro, pero usando un mecanismo diferente. El método del controlador que haga el registro
	usará ModelAttribute en uno de sus parámetros, algo como:
	
		public String registrar(@ModelAttribute LibroVO libro){ ...

Los valores de los atributos "name" en los campos del formulario deben coincidir con los nombres de los campos de la clase
LibroVO.

</pre>

<form>
<!-- Crear aqui el nuevo formulario de registro, procure colocar los nombres de los campos igual que las propiedades de la clase LibroVO-->
</form>
</body>
</html>
