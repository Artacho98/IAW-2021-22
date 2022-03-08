<!doctype html>
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
    	<div class="row">
    		<div class="col">
    			<h2>Login webLibros</h2>
    			<form role="form" method="post" action="ValidarUsuario">
				  <div class="mb-3">
				    <label for="usuario" class="form-label">Usuario</label>
				    <input type="text" class="form-control" id="usuario" name="usuario" aria-describedby="usuarioHelp" autofocus="autofocus" required="required">				    
				  </div>
				  <div class="mb-3">
				    <label for="pwd" class="form-label">Password</label>
				    <input type="password" class="form-control" id="pwd" name="pwd" required="required">
				  </div>
				  <button type="submit" class="btn btn-primary">Entrar</button>
				  <button type="button" class="btn btn-secondary m-3" onclick="location.href='jsp/registrar.jsp'">Registrar</button>
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