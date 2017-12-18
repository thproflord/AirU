

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import postgresql.Conection;

/**
 * Servlet implementation class ProveedorController
 */
@WebServlet("/proveedores")
public class ProveedorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProveedorController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		javax.servlet.RequestDispatcher dispatcher = request.getRequestDispatcher("proveedores.jsp");
		ArrayList proveedores = new ArrayList<>();
		proveedores = buscarProveedor();
		int j = 0;
		for( int i=0; i< proveedores.size(); i=i+4) {
			request.setAttribute("documento"+j, proveedores.get(i).toString());
			request.setAttribute("nombre"+j, proveedores.get(i+1).toString());
			request.setAttribute("apellido"+j, proveedores.get(i+2).toString());
			request.setAttribute("nacionalidad"+j, proveedores.get(i+3).toString());
			j++;
		}
		request.getSession().setAttribute("indice", new Integer(j));	
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("prueba");
		javax.servlet.RequestDispatcher dispatcher = request.getRequestDispatcher("proveedores.jsp");
		dispatcher.forward(request, response);
	}
	
	private ArrayList buscarProveedor() {
	
		Conection postgres = new Conection();
		return postgres.proveedores();

							
	}

}
