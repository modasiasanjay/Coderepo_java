package p1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Save
 */
@WebServlet("/Save")
public class Save extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Save() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String S1=request.getParameter("fn");
		String S2=request.getParameter("ln");
		String S3=request.getParameter("un");
		String S4=request.getParameter("pass");
		
			System.out.println(S1);
			System.out.println(S2);
			System.out.println(S3);
			System.out.println(S4);
			
		HttpSession session = request.getSession();
		session.setAttribute("fn",S1);
		session.setAttribute("ln",S2);	
		session.setAttribute("un",S3);
		session.setAttribute("pass",S4);
		
		response.sendRedirect("login.jsp");

		
	}

}
