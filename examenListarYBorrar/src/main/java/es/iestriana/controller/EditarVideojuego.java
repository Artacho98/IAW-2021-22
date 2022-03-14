package es.iestriana.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import es.iestriana.bean.Conexion;
import es.iestriana.bean.Videojuego;
import es.iestriana.dao.VideojuegoDAO;
import es.iestriana.dao.VideojuegoDAOBD;

/**
 * Servlet implementation class EditarVideojuego
 */
public class EditarVideojuego extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarVideojuego() {
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
		String name= request.getParameter("name");
		int anyo = Integer.parseInt(request.getParameter("anyo"));
		String company = request.getParameter("company");
		String type = request.getParameter("type");
		

		// Portada
		Part fichero = request.getPart("photo");
		InputStream inputS = null;
		ByteArrayOutputStream bos = null;
		byte[] res = null;
		
		Videojuego vj = null;
		
		if (!getFileName(fichero).equals("")) {
			inputS = fichero.getInputStream();
			
			// Escalar Imagen
			/*BufferedImage imageBuffer = ImageIO.read(inputS);
			Image tmp = imageBuffer.getScaledInstance(640, 640, BufferedImage.SCALE_FAST);
			BufferedImage buffered = new BufferedImage(640, 640, BufferedImage.TYPE_INT_RGB);
			buffered.getGraphics().drawImage(tmp, 0, 0, null);
					
			bos = new ByteArrayOutputStream();
			ImageIO.write(buffered, "jpg", bos);
			res = bos.toByteArray();*/
			
			
			bos = new ByteArrayOutputStream();
			byte[] buffer = new byte[1024];
			while (true) {
			    int r = inputS.read(buffer);
			    if (r == -1) break;
			    bos.write(buffer, 0, r);
			}
			res = bos.toByteArray();
			
			vj = new Videojuego(name, anyo, company, type, res);
		} else {
			vj = new Videojuego(name, anyo, company, type, res);
		}
		
		
		
		VideojuegoDAO vjDAO = new VideojuegoDAOBD();
		
		ServletContext sc = getServletContext();
		String usu = sc.getInitParameter("usuario");
		String pass = sc.getInitParameter("password");
		String bd = sc.getInitParameter("database");
		String driver = sc.getInitParameter("driver");
		
		Conexion con = new Conexion(usu, pass, bd, driver);
		
		vjDAO.actualizarVideojuego(con, vj);
		
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
