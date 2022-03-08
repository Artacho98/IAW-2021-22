package es.iestriana.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.iestriana.bean.Conexion;
import es.iestriana.bean.Usuario;
import es.iestriana.dao.UsuarioDAO;
import es.iestriana.dao.UsuarioDAOBD;

/**
 * Servlet implementation class RegistrarUsuario
 */
public class RegistrarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrarUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String pwd= request.getParameter("pwd");
		String nombre = request.getParameter("nombre");
		String apellidos= request.getParameter("apellidos");
		int edad = Integer.parseInt(request.getParameter("edad"));
		
		ServletContext sc = getServletContext();
		String usu = sc.getInitParameter("usuario");
		String pass = sc.getInitParameter("password");
		String bd = sc.getInitParameter("database");
		String driver = sc.getInitParameter("driver");
		
		Conexion con = new Conexion(usu, pass, bd, driver);
		
		Usuario usuario = new Usuario(email, pwd, nombre, apellidos, edad);
		
		UsuarioDAO uDAO = new UsuarioDAOBD();
		
		if (!uDAO.buscarUsuario(con, email)) {
			int filas = uDAO.insertarUsuario(usuario, con);
			if (filas == 1) {
				response.sendRedirect("jsp/registrar.jsp?mensaje=Usuario registrado correctamente");				
			} else {
				response.sendRedirect("jsp/registrar.jsp?mensaje=Error al registrar al usuario");
			}
		} else {
			response.sendRedirect("jsp/registrar.jsp?mensaje=Login registrado en la BD");
		}
		
		
	}

}
