package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.swing.internal.plaf.basic.resources.basic;

import dao.PersonDAO;
import dao.impl.PersonDAOImpl;
import domain.Person;

/**
 * Servlet implementation class PersonServlet
 */
@WebServlet("/personServlet")
public class PersonServlet extends HttpServlet {
	private PersonDAO personDAO = new PersonDAOImpl();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonServlet() {
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
	
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		String birth = request.getParameter("birth");
		String education = request.getParameter("education");
		String location = request.getParameter("location");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String tel = request.getParameter("tel");
		String tip = request.getParameter("tip");
		
		Person person = new Person(id,name,password,birth,education,location
				,email,address,tel,tip);
		
		
		personDAO.save(person);
		request.getRequestDispatcher("/success.jsp").forward(request, response);
		
	}

}
