 <%@page import="es.iestriana.bean.Conexion"%>
 <%@page import="java.io.OutputStream"%>
 <%@page import="es.iestriana.dao.VideojuegoDAOBD"%>
 <%@page import="es.iestriana.dao.VideojuegoDAO"%>
 <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 
 <%try{
	ServletContext sc = getServletContext();
	String usu = sc.getInitParameter("usuario");
	String pass = sc.getInitParameter("password");
	String bd = sc.getInitParameter("database");
	String driver = sc.getInitParameter("driver");	
	
	Conexion con = new Conexion(usu, pass, bd, driver);
	
	int idVideogame = Integer.parseInt(request.getParameter("idVideogame"));
	
	VideojuegoDAO vjDAO = new VideojuegoDAOBD();
	
	byte[] photo = vjDAO.obtenerPortada(idVideogame, con);
	
	try {
		if (photo != null) {
			response.setContentType("image/jpeg");
			response.setHeader("Content-Disposition", "attachment");
			OutputStream o = response.getOutputStream();
			o.write(photo);
			o.flush();
			o.close();
			return;
		}
	} catch (IllegalStateException e) {}
} catch (Exception e) {}%>