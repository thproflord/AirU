

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import postgresql.Conection;

/**
 * Servlet implementation class PruebaController
 */
@WebServlet("/prueba")
public class PruebaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PruebaController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		javax.servlet.RequestDispatcher dispatcher = request.getRequestDispatcher("prueba.jsp");
		ArrayList prueba = new  ArrayList<>();
		prueba=buscarPrueba();
		int j =0;
		for( int i=0; i< prueba.size(); i=i+4) {
			request.setAttribute("codigo"+j, prueba.get(i).toString());
			request.setAttribute("tipo"+j, prueba.get(i+1).toString());
			request.setAttribute("descripcion"+j, prueba.get(i+2).toString());
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
		
	}
	
	private ArrayList buscarPrueba() {
		Conection postgres = new Conection();
		return postgres.clientes();							
	}

}
