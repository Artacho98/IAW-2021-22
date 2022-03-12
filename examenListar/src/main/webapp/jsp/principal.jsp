<%@page import="es.iestriana.dao.UsuarioDAOBD"%>
<%@page import="es.iestriana.bean.Usuario"%>
<%@page import="java.util.List"%>
<%@page import="es.iestriana.dao.UsuarioDAO"%>
<%@page import="es.iestriana.bean.Conexion"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ExamenListar</title>
</head>
<body>
	<h1>Usuarios de la BD</h1>
	<%
		ServletContext sc = getServletContext();
		String usu = sc.getInitParameter("usuario");
		String pass = sc.getInitParameter("password");
		String bd = sc.getInitParameter("database");
		String driver = sc.getInitParameter("driver");
		
		Conexion con = new Conexion(usu, pass, bd, driver);
		
		UsuarioDAO uDAO = new UsuarioDAOBD();
		List<Usuario> usuarios = uDAO.listarUsuarios(con);
	%>
		
		<div class="row mt-2">
			<% 
			for(Usuario aux: usuarios) {
			%>
				<div class="col">
					<div class="card" style="margin: 10px">
						<div class="card-body">
							<h5 class="card-title"><%=aux.getIdUsuario() %></h5>
							<p class="card-text"><%=aux.getEmail() %></p>
							<p class="card-text"><%=aux.getPwd() %></p>
							<p class="card-text"><%=aux.getNombre() %></p>
							<p class="card-text"><%=aux.getApellidos() %></p>
							<p class="card-text"><%=aux.getEdad() %></p>
						</div>
					</div>
				</div>
			<%
			}
			%>
			</div>
</body>
</html>