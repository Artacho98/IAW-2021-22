<!doctype html>
<%@page import="es.iestriana.bean.Videojuego"%>
<%@page import="java.util.List"%>
<%@page import="es.iestriana.dao.VideojuegoDAOBD"%>
<%@page import="es.iestriana.dao.VideojuegoDAO"%>
<%@page import="es.iestriana.bean.Conexion"%>
<html lang="es">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <title>WEB VIDEOJUEGOS</title>
  </head>
  <body>
  <h1>Tu web de Videojuegos</h1>
	<div class="container">	
		<div class="row mt-2">
			<div class="col-2">
				<a class="btn btn-primary btn-xs btn-block" href="jsp/anadirVideojuegos.jsp">A�ADIR LIBRO</a>
			</div>
		</div>
	</div>
	
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>    
  </body>
</html>