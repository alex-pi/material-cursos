<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">
<head>
  	<title>Uso simple de RequestParam.</title>
  	<link rel="stylesheet" href="/ejemplos-mvc/css/style.css" media="screen">
</head>
<body>
<pre>
El ejemplo muestra:

- El uso de @RequestParam para leer parámetros de la petición. p.e. :
	@RequestParam("nombreCompleto") String nombre
- Cómo agregar información del modelo a nuestras vistas (jsp's en este caso)
	return new ModelAndView("params/params", "fecha", new Date());
	
Los archivos que participan en el ejemplo:
	WEB-INF/params/*
	ClienteVO.java
	ServiciosClienteImpl.java
	UsoRequestParam.java
-----
En el método 'registrar' del controller comenta las líneas:

	List<ClienteVO> clientes = ServiciosClienteImpl.listar();		
	return new ModelAndView("params/listado", "listaClientes", clientes);

Descomenta: 
	return "redirect:listar";
	
Corrige lo necesario para que la clase compile y verifica el resultado.
</pre>
<h5>Fecha: ${fecha} </h5>
<h4>Opciones.</h4>
<ul>
	<li><a href="/ejemplos-mvc/mvc/ejemplos/usoparams/registro">Registrar</a></li>
	<li><a href="/ejemplos-mvc/mvc/ejemplos/usoparams/listar">Listar</a></li>
</ul>
</body>
</html>
