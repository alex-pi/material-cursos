<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">
<head>
  	<title>Listado de ejemplos de Spring MVC 3.</title>
  	<script>
  		var miModulo = (function(){
  			
  			var var1,
  				var2;
  			
  			function estaEsPrivada(){
  				
  			}
  			
  			// Esta función inicializa mi módulo  		
  			function inicializar(){
  				alert("inicializar");
  			}
  			
  			function destruir(){
  				alert("destruir");
  			}
  			
  			return {
  				init: inicializar,
  				destroy: destruir
  			};
  		})();
  		
  		miModulo.init();
  	</script>
</head>
<body>
<h2>Listado de ejemplos.</h2>
<ul>
	<li><a href="mvc/ejemplos/usorm">Uso de RequestMapping</a></li>
	<li><a href="mvc/ejemplos/usoparams">Uso de RequestParam</a></li>
	<li><a href="mvc/ejemplos/usopathv">Uso de PathVariable</a></li>
	<li><a href="mvc/vista/implicita">Uso de ModelAttribute</a></li>
	<li><a href="mvc/ejemplos/usoreqbody">Uso de RequestBody</a></li>
	<li><a href="mvc/ejemplos/usoresbody">Uso de ResponseBody</a></li>
</ul>
</body>
</html>
