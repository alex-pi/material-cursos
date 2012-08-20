<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h2>Registro de LIBRO.</h2>

<form method="POST" action="/ejercicios-mvc/mvc/ej2/registrar">
	<label for="titulo">Titulo: </label> <input id="titulo" name="titulo" type="text" /><br/>
	<label for="autor">Autor: </label><input id="autor" name="autor" type="text" /><br/>
	<label for="isbn">ISBN: </label><input id="isbn" name="isbn" type="text" /><br/>
	<label for="anio">Año: </label><input id="anio" name="anio" type="text" /><br/>
	
	<button type="submit">Registrar</button>
</form>

