<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">
<head>
  	<title>Uso simple de RequestMapping.</title>
  	<link rel="stylesheet" href="/ejemplos-mvc/css/style.css" media="screen">
</head>
<body>
<pre>
El ejemplo muestra lo simple que es usar RequestMapping para mapear url's a métodos del controller.

Los archivos relacionados al ejemplo son:
- /WEB-INF/usorm/*
- UsoRequestMapping.java

Prueba hacer los siguientes cambios al ejemplo:

1) En @RequestMapping(value="/registro/* ... agregua un '*' más, así: @RequestMapping(value="/registro/**
2) Cambia method=RequestMethod.GET por method=RequestMethod.POST
   Nota que también puedes colocar: method={RequestMethod.GET, RequestMethod.POST}
</pre>
<h2>Listado de links.</h2>
<ul>
	<li><a href="/ejemplos-mvc/mvc/ejemplos/usorm/registro/cliente">/ejemplos-mvc/mvc/ejemplos/usorm/registro/cliente</a></li>
	<li><a href="usorm/registro/producto">usorm/registro/producto</a></li>
	<li><a href="/ejemplos-mvc/mvc/ejemplos/usorm/registro/xxx">/ejemplos-mvcmvc/ejemplos/usorm/registro/xxx</a></li>
	<li><a href="/ejemplos-mvc/mvc/ejemplos/usorm/registro/xxx/yyy">/ejemplos-mvcmvc/ejemplos/usorm/registro/xxx/yyy</a></li>
</ul>
</body>
</html>
