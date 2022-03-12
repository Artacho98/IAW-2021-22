package es.iestriana.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import es.iestriana.bean.Conexion;
import es.iestriana.bean.Videojuego;
import es.iestriana.dao.VideojuegoDAO;
import es.iestriana.dao.VideojuegoDAOBD;

/**
 * Servlet implementation class AnadirVideojuego
 */
@MultipartConfig
public class AnadirVideojuego extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnadirVideojuego() {
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
			String name = request.getParameter("name");
			String company = request.getParameter("company");
			int anyo = Integer.parseInt(request.getParameter("anyo"));
			String type = request.getParameter("type");
			
			// Portada
			Part fichero = request.getPart("photo");
			InputStream inputS = null;
			ByteArrayOutputStream bos = null;
			byte[] res = null;
			if (!getFileName(fichero).equals("")) {
				inputS = fichero.getInputStream();
				
				
				bos = new ByteArrayOutputStream();
				byte[] buffer = new byte[1024];
				while (true) {
				    int r = inputS.read(buffer);
				    if (r == -1) break;
				    bos.write(buffer, 0, r);
				}
				res = bos.toByteArray();			
			}
			
			Videojuego vj = new Videojuego(name, anyo, company, type, res);
			
			VideojuegoDAO vjDAO = new VideojuegoDAOBD();
			
			ServletContext sc = getServletContext();
			String usu = sc.getInitParameter("usuario");
			String pass = sc.getInitParameter("password");
			String bd = sc.getInitParameter("database");
			String driver = sc.getInitParameter("driver");
			
			Conexion con = new Conexion(usu, pass, bd, driver);
			
			vjDAO.anadirVideojuego(con, vj);
			
			response.sendRedirect("index.jsp");
		}

		private Object getFileName(Part fichero) {
			for (String c : fichero.getHeader("content-disposition").split(";")) {
				if (c.trim().startsWith("filename")) {
					return c.substring(c.indexOf("=")+1).trim().replace("\"", "");
				}
				
			}
			
			return null;
	}

}
