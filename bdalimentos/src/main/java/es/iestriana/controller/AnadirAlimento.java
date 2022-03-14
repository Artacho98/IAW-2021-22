package es.iestriana.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.iestriana.bean.Alimento;
import es.iestriana.bean.Conexion;
import es.iestriana.dao.AlimentoDAO;
import es.iestriana.dao.AlimentoDAOBD;


/**
 * Servlet implementation class AnadirAlimento
 */
@MultipartConfig
public class AnadirAlimento extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnadirAlimento() {
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
		String nombre = request.getParameter("nombre");
		String categoría = request.getParameter("categoría");
		int diaCaducidad = Integer.parseInt(request.getParameter("diaCaducidad"));
		int mesCaducidad = Integer.parseInt(request.getParameter("mesCaducidad"));
		int anyoCaducidad = Integer.parseInt(request.getParameter("anyoCaducidad"));
		float precio =  Float.valueOf(request.getParameter("precio"));
		String proovedor = request.getParameter("proveedor");
		
		ServletContext sc = getServletContext();
		String usu = sc.getInitParameter("usuario");
		String pass = sc.getInitParameter("password");
		String bd = sc.getInitParameter("database");
		String driver = sc.getInitParameter("driver");
		
		Conexion con = new Conexion(usu, pass, bd, driver);
		
		Alimento alimentos = new Alimento(nombre, categoría, diaCaducidad, mesCaducidad, anyoCaducidad, precio, proovedor);
		
		AlimentoDAO uDAO = new AlimentoDAOBD();
		
		
			int filas = uDAO.insertarAlimento(alimentos, con);
			if (filas == 1) {
					// Poner al usuario en Sesión
					
					response.sendRedirect("jsp/principal.jsp");	
			} else {
				response.sendRedirect("jsp/index.jsp?mensaje=Error al registrar el alimento");
			}
		
	}

}
