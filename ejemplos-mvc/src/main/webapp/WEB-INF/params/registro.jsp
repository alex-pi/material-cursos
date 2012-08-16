<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h2>Registro de cliente.</h2>

<form method="POST" action="registrar">
	<label for="nombreCompleto">Nombre: </label> <input id="nombreCompleto" name="nombreCompleto" type="text" /><br/>
	<label for="email">email: </label><input id="email" name="email" type="text" /><br/>
	<label for="edad">Edad: </label><input id="edad" name="edad" type="text" /><br/>
	
	<button type="submit">Registrar</button>
</form>

