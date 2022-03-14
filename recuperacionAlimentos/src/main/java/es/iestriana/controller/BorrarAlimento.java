package es.iestriana.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.iestriana.bean.Conexion;
import es.iestriana.dao.AlimentoDAO;
import es.iestriana.dao.AlimentoDAOBD;

/**
 * Servlet implementation class BorrarVideojuego
 */
@MultipartConfig
public class BorrarAlimento extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BorrarAlimento() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idAlimento = Integer.parseInt(request.getParameter("idAlimento"));
		
		ServletContext sc = getServletContext();
		String usu = sc.getInitParameter("usuario");
		String pass = sc.getInitParameter("password");
		String bd = sc.getInitParameter("database");
		String driver = sc.getInitParameter("driver");
		
		Conexion con = new Conexion(usu, pass, bd, driver);
		
		AlimentoDAO al = new AlimentoDAOBD();
		
		int cuantos = al.borrarAlimento(con, idAlimento);
		
		if (cuantos == 1) {
			response.sendRedirect("index.jsp");
		} else {
			response.sendRedirect("index.jsp?error=Error al borrar el libro");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
