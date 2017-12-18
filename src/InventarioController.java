

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import postgresql.Conection;

/**
 * Servlet implementation class InventarioController
 */
@WebServlet("/inventario")
public class InventarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InventarioController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		javax.servlet.RequestDispatcher dispatcher = request.getRequestDispatcher("inventario.jsp");
		ArrayList inventario = new ArrayList<>();
		inventario = buscarInventario();
		int j = 0;
		for( int i=0; i< inventario.size(); i=i+4) {
			request.setAttribute("id"+j, inventario.get(i).toString());
			request.setAttribute("cantidad"+j, inventario.get(i+1).toString());
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
		doGet(request, response);
	}
	
	private ArrayList buscarInventario() {
		Conection postgres = new Conection();
		return postgres.inventario();							
	}

}
