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
 * Servlet implementation class ValidarUsuario
 */
public class ValidarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidarUsuario() {
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
		String pwd = request.getParameter("pwd");
		
		ServletContext sc = getServletContext();
		String usu = sc.getInitParameter("usuario");
		String pass = sc.getInitParameter("password");
		String bd = sc.getInitParameter("database");
		String driver = sc.getInitParameter("driver");
		
		Conexion con = new Conexion(usu, pass, bd, driver);
		
		UsuarioDAO uDAO = new UsuarioDAOBD();
		
		Usuario usuWeb = uDAO.comprobarUsuario(email, pwd, con);
		
		// Comprobar la validez del usuario
		if (usuWeb != null) {
			// Poner al usuario en Sesión
			// HttpSession sesion = request.getSession();
			// sesion.setAttribute("usuarioWeb", usuWeb);
			response.sendRedirect("jsp/principal.jsp");
		} else {
			response.sendRedirect("index.jsp?mensaje=Email y/o Password Incorrecto");
		}
	}

}
