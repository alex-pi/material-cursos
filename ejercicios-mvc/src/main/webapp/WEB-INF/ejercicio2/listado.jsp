<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h2>Listado de libros.</h2>

<table>
  <c:forEach var="l" items="${listaLibros}">
    <tr>
      <td>${l.id}</td>
      <td>${l.titulo}</td>
      <td><a href="/ejercicios-mvc/mvc/ej2/libro/${l.id}">Detalle</a></td>
      <td><a href="/ejercicios-mvc/mvc/ej2/libro/eliminar/${l.id}">Eliminar</a></td>
    </tr>
  </c:forEach>
</table>
<br/>

<a href="/ejercicios-mvc/mvc/ej2">Opciones</a>