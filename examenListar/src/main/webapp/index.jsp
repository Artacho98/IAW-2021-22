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

    <title>WEB LIBROS</title>
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
			List<Videojuego> videojuegos = vjDAO.listarVideojuegos(con);			
		%>
		
		<div class="row mt-2">
			<div class="col">
				<span></span>
				<nav aria-label="breadcrumb">
				  <ol class="breadcrumb">
				    <li class="breadcrumb-item">Hola <%=((Usuario)session.getAttribute("usuarioWeb")).getNombre() %></li>
				    <li class="breadcrumb-item active" aria-current="page">Principal</li>
				    <li class="breadcrumb-item"><a href="../CerrarSesion">Cerrar Sesi?n</a></li>
				  </ol>
				</nav>
			</div>
		</div>
		
		<div class="row mt-2">
			<div class="col-2">
				<a class="btn btn-primary btn-xs btn-block" href="anadirLibro.jsp">A?ADIR LIBRO</a>
			</div>
		</div>
		
		<div class="row mt-2">
			<% 
			for(Videojuego aux: videojuegos) {
			%>
				<div class="col">
					<div class="card" style="margin: 10px">
						<img alt="Videojuego" src="jsp/image.jsp?idVideogame=<%=aux.getIdVideogame() %>" class="card-img-top" style="width: 100%;height: 100%">
						<div class="card-body">
							<h5 class="card-title"><%=aux.getName() %></h5>
							<p class="card-text"><%=aux.getAnyo() %></p>
							<p class="card-text"><%=aux.getCompany() %></p>
							<p class="card-text"><%=aux.getType() %></p>
							<button type="button" class="btn btn-secondary" onclick="location.href='jsp/a?adirVideojuego.jsp'">A?adir videojuego</button>

						</div>
					</div>
				</div>
			<%
			}
			%>
		</div>
	</div>
	
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>    
  </body>
</html>
