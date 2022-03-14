<!doctype html>
<html lang="es">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <title>WEB ALIMENTOS - AÑADIR</title>
  </head>
  <body>
	<div class="container">
		<div class="row">
			<div class="col">
				<h2>Añadir Alimentos</h2>
				<form method="post" action="AnadirAlimento" enctype="multipart/form-data">
				  <div class="mb-3">
				    <label for="nombre" class="form-label">Nombre</label>
				    <input type="text" class="form-control" id="nombre" name="nombre" aria-describedby="tituloHelp" autofocus="autofocus">				    
				  </div>
				  <div class="mb-3">
				    <label for="categoría" class="form-label">Categoría</label>
				    <input type="text" class="form-control" id="categoría" name="categoría">
				  </div>
				  <div class="mb-3">
				    <label for="diaCaducidad" class="form-label">Día caducidad</label>
				    <input type="text" class="form-control" id="diaCaducidad" name="diaCaducidad">
				  </div>
				    <div class="mb-3">
				    <label for="mesCaducidad" class="form-label">Mes caducidad</label>
				    <input type="text" class="form-control" id="mesCaducidad" name="mesCaducidad">
				  </div>
				    <div class="mb-3">
				    <label for="anyoCaducidad" class="form-label">Año caducidad</label>
				    <input type="text" class="form-control" id="anyoCaducidad" name="anyoCaducidad">
				  </div>
				  </div>
				    <div class="mb-3">
				    <label for="precio" class="form-label">Precio</label>
				    <input type="text" class="form-control" id="precio" name="precio" step="0.01">
				  </div>
				  </div>
				    <div class="mb-3">
				    <label for="proveedor" class="form-label">Proveedor</label>
				    <input type="text" class="form-control" id="proveedor" name="proveedor">
				  </div>
				  <button type="submit" class="btn btn-primary">Añadir</button>
				</form>
				
				<%
				String mensaje = request.getParameter("mensaje");
				if (mensaje != null) {
				%>
				<div class="alert alert-warning alert-dismissible fade show" role="alert">
				   <%=mensaje %> 
				  <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
				</div>
				<%
				}
				%>
			</div>
		
	
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>    
  </body>
</html>