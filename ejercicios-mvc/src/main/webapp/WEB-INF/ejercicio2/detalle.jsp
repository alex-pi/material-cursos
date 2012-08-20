<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h2>Detalle de libro: ${libro.titulo}</h2>
${libro.isbn}
${libro.autor}
${libro.anio}

<br/>

<a href="/ejercicios-mvc/mvc/ej2">Opciones</a>
