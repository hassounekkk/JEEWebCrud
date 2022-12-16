import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import dao.ClientDao;
 import ma.fstt.presistence.Client; 

/**
 * Servlet implementation class SaveUpdate
 */
@WebServlet("/SaveUpdate")
public class SaveUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String Client = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ClientDao dao = new ClientDao();
		int id= Integer.parseInt( request.getParameter("id") );
		Client client = dao.get(id); 
		dao.update(client, request.getParameter("name"), request.getParameter("prenom"), request.getParameter("adresse"), request.getParameter("phone"));
		request.getRequestDispatcher("/ListClientServlet").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
