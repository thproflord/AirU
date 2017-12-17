

import java.io.IOException;
import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import postgresql.Conection;

/**
 * Servlet implementation class ClienteController
 */
@WebServlet("/cliente")
public class ClienteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClienteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		javax.servlet.RequestDispatcher dispatcher = request.getRequestDispatcher("clientes.jsp");
		ArrayList clientes = new  ArrayList<>();
		clientes=buscaClientes();
		int j =0;
		for( int i=0; i< clientes.size(); i=i+4) {
			request.setAttribute("nacionalidad"+j, clientes.get(i).toString());
			request.setAttribute("fecha"+j, clientes.get(i+1).toString());
			request.setAttribute("nombre"+j, clientes.get(i+2).toString());
			request.setAttribute("apellido"+j, clientes.get(i+3).toString());
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
	
	public ArrayList buscaClientes(){
		ArrayList clientes = new ArrayList<>();
			Conection postgres = new Conection();
			clientes = postgres.clientes();
		return clientes;
	}

}
