<!doctype html>
<%@page import="es.iestriana.bean.Videojuego"%>
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

    <title>WEB LIBROS - EDITAR</title>
  </head>
  <body>
	<div class="container">
	<%
			ServletContext sc = getServletContext();
			String usu = sc.getInitParameter("usuario");
			String pass = sc.getInitParameter("password");
			String bd = sc.getInitParameter("database");
			String driver = sc.getInitParameter("driver");
			
			Conexion con = new Conexion(usu, pass, bd, driver);
			
			VideojuegoDAO vjDAO = new VideojuegoDAOBD();
			
			Videojuego aux = vjDAO.obtenerVideojuegos(con, request.getParameter("name"));
	%>
		<div class="row">
			<div class="col">
				<h2>Editar Videojuego</h2><!doctype html>
				<form method="post" action="../EditarVideojuego" enctype="multipart/form-data">
					<input type="hidden" name="idVideogame" id="idVideogame" value="<%=aux.getIdVideogame()%>">
				  <div class="mb-3">
				    <label for="name" class="form-label">Nombre</label>
				    <input type="text" class="form-control" id="name" name="name" 
				    		aria-describedby="nameHelp" autofocus="autofocus" value="<%=aux.getName()%>">				    
				  </div>
				  <div class="mb-3">
				    <label for="anyo" class="form-label">Anyo</label>
				    <input type="text" class="form-control" id="anyo" name="anyo" value="<%=aux.getAnyo()%>">
				  </div>
				  <div class="mb-3">
				    <label for="company" class="form-label">Company</label>
				    <input type="text" class="form-control" id="company" name="company" value="<%=aux.getCompany()%>">
				  </div>
				  <div class="mb-3">
				  	<img alt="Photo" src="image.jsp?idIdVideogame=<%=aux.getIdVideogame()%>" style="width: 40px;height: 60px">
				    <label for="photo" class="form-label">Portada</label>
				    <input type="file" class="form-control" id="photo" name="photo">
				  </div>
				  <button type="submit" class="btn btn-primary">Actualizar</button>
				</form>
			</div>
		</div>
	</div>
	
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>    
  </body>
</html>