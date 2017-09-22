package Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.DaoFile;
import Vo.VoFile;

/**
 * Servlet implementation class ControllerFile
 */
@WebServlet("/ControllerFile")
public class ControllerFile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerFile() {
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
String flag =  request.getParameter("flag");
		
		if(flag.equals("state"))
		{
			InsertState(request,response);}
		else if(flag.equals("countrysearch"))
		{
			Insertcountrysearch(request,response);
		}
		else if (flag.equals("country")) 
		{
			InsertCountry(request,response);
		}
	}

	
	private void InsertCountry(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		
		String S1=request.getParameter("CountryName");
		String S2=request.getParameter("CountryDescription");
		
		VoFile vo=new VoFile();
	/*	vo.setCountryName(S1);
		vo.setCountryDescription(S2);*/
	
		DaoFile dao=new DaoFile();
		dao.InsertCountry(vo);
		response.sendRedirect("homepage.jsp");
	}
	
	private void Insertcountrysearch(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		
		List ls=new ArrayList();
		 
		DaoFile dao=new DaoFile();
		ls=dao.searchcountry();
		
		HttpSession session=request.getSession();
		session.setAttribute("data", ls);
		response.sendRedirect("State.jsp");
		
	}

	private void InsertState(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		
		int c_id =Integer.parseInt(request.getParameter("CountryId"));
		String S3=request.getParameter("StateName");
		String S4=request.getParameter("StateDescription");
		
		VoFile cvo=new VoFile();
	/*	cvo.setCid(c_id);*/
	
		VoFile vo=new VoFile();
	/*	vo.setCvo(cvo);
		vo.setStateName(S3);
		vo.setStateDescription(S4);*/
		
		
		DaoFile dao=new DaoFile();
		dao.InsertState(vo);
		response.sendRedirect("homepage.jsp");		
	}
}

