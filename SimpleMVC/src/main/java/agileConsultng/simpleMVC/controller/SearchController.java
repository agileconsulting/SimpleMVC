package agileConsultng.simpleMVC.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import agileConsulting.simpleMVC.model.Emp;
import agileConsulting.simpleMVC.model.SearchService;

/**
 * Servlet implementation class SearchController
 */
public class SearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	try {
		SearchService search= new SearchService();
		String deptno =request.getParameter("deptno");
		List<Emp>listaImpiegati=search.findEmpl(Integer.parseInt(deptno));	
		
		request.setAttribute("lista",listaImpiegati );
	    request.getRequestDispatcher("result.jsp").forward(request,response);
	
	} catch (Exception e) {
		 e.printStackTrace();
		 request.setAttribute("errore",e.getMessage()); 
	     request.getRequestDispatcher("index.jsp").forward(request,response);
	}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
