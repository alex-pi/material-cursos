<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h2>Listado de clientes.</h2>

<table>
  <c:forEach var="c" items="${listaClientes}">
    <tr>
      <td>${c.nombreCompleto}</td>
      <td>${c.email}</td>
      <td>${c.edad}</td>
    </tr>
  </c:forEach>
</table>
<br/>
