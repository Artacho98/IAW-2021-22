<!doctype html>
<%@page import="es.iestriana.bean.Alimento"%>
<%@page import="java.util.List"%>
<%@page import="es.iestriana.dao.AlimentoDAOBD"%>
<%@page import="es.iestriana.dao.AlimentoDAO"%>
<%@page import="es.iestriana.bean.Conexion"%>
<html lang="es">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <title>WEB ALIMENTOS</title>
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
			
			AlimentoDAO al = new AlimentoDAOBD();
			List<Alimento> alimentos = al.listarAlimentos(con);			
		%>	
	<h1>Lista de alimentos</h1>
	<hr>
		<div class="row mt-2">
			<% 
			for(Alimento aux: alimentos) {
			%>
				<div class="col">
					<div class="card" style="margin: 10px">
						
						<div class="card-body">
							<h5 class="card-title"><%=aux.getNombre() %></h5>
							<p class="card-text"><%=aux.getCategoría() %></p>
							<p class="card-text"><%=aux.getDiaCaducidad() %></p>
							<p class="card-text"><%=aux.getMesCaducidad() %></p>
							<p class="card-text"><%=aux.getAnyoCaducidad() %></p>
							<p class="card-text"><%=aux.getPrecio() %></p>
							<p class="card-text"><%=aux.getProveedor() %></p>
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
