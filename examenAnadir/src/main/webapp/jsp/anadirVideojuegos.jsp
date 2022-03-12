<!doctype html>
<%@page import="es.iestriana.bean.Videojuego"%>
<html lang="es">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <title>WEB LIBROS - AÑADIR</title>
  </head>
  <body>
	<div class="container">
		<div class="row mt-2">
		
		<div class="row">
			<div class="col">
				<h2>Añadir Videojuego</h2>
				<form method="post" action="../AnadirVideojuego" enctype="multipart/form-data">
				  <div class="mb-3">
				    <label for="name" class="form-label">Nombre</label>
				    <input type="text" class="form-control" id="name" name="name" aria-describedby="nameHelp" autofocus="autofocus">				    
				  </div>
				  <div class="mb-3">
				    <label for="anyo" class="form-label">Año</label>
				    <input type="number" class="form-control" id="anyo" name="anyo">
				  </div>
				  <div class="mb-3">
				    <label for="company" class="form-label">Company</label>
				    <input type="text" class="form-control" id="company" name="company">
				  </div>
				  <div class="mb-3">
				    <label for="type" class="form-label">Tipo</label>
				    <input type="text" class="form-control" id="type" name="type">
				  </div>
				  <div class="mb-3">
				    <label for="photo" class="form-label">Imagen</label>
				    <input type="file" class="form-control" id="photo" name="photo">
				  </div>
				  <button type="submit" class="btn btn-primary">Añadir</button>
				</form>
				
				<%
				String mensaje = request.getParameter("mensaje");
				if (mensaje != null) {
				%>
				<div class="alert alert-warning alert-dismissible fade show" role="alert">
				  <strong>Error!!!</strong> <% out.print(mensaje); %> <%=mensaje %> 
				  <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
				</div>
				<%
				}
				%>
			</div>
		</div>

	</div>
	
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>    
  </body>
</html>