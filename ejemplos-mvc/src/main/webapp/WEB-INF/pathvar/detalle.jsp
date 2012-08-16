<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h2>Detalle de cliente.</h2>

<c:if test="${ not empty cliente }">
<label>Nombre: </label> ${cliente.nombreCompleto} <br/> 
<label>email: </label> ${cliente.email} <br/>
<label>Edad: </label> ${cliente.edad} <br/>
</c:if>

<a href="..">Buscar otro</a>


