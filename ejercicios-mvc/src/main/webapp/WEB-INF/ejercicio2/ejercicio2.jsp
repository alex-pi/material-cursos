<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">
<head>
  	<title>Ejercicio 2.</title>
  	<link rel="stylesheet" href="/ejercicios-mvc/css/style.css" media="screen">
</head>
<body>
<pre>
Dentro de un nuevo controlador (Ejercicio2Controller) debe implementar las siguientes opciones:

1) Registrar un libro. Esto se debe lograr desde un formulario que debes crear en ejercicio2/regitro.jsp.
2) Crear un jsp ejercicio2/listado.jsp que muestre un listado de libros, sólo se listará el id y el título del libro. Para cada libro listado debe agregar:
	a) Un link que nos lleve al detalle del mismo, esto creando el jsp ejercicio2/detalle. Esta vista de detalle (ejercicio2/detalle) debe contener
		un link que nos devuelva al listado de libros (ejercicio2/listado.jsp).
	b) Otro link que elimine ese libro (enviando el id como parte del url). El controller, al eliminar el libro, debe mostrar de nuevo el listado (ejercicio2/listado.jsp).
3) Por último, emulando a los ejemplos, crea una pantalla de búsqueda por el campo isbn. Este jsp debe crearlo como ejercicio2/busqueda.jsp

Para realizar todas las operaciones "CRUD" crea una clase de utilería ServiciosLibroImpl.java, toma como base el ejemplo ServiciosClienteImpl.

Nota: recuerda que en principio, para mostrar esta vista que contiene el pequeño menú de opciones, debes mapear
un método en el controlador.
</pre>
<h2>Opciones</h2>
<ul>
	<li><a href="#">Registrar</a></li>
	<li><a href="#">Listar</a></li>
	<li><a href="#">Buscar</a></li>		
</ul>
</body>
</html>
