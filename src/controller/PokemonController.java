package controller;
import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Bulbasaur;
import model.Charizard;

@WebServlet(urlPatterns = { "/pokemon" })
public class PokemonController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PokemonController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String value1 = request.getParameter("card1"); 
		String value2 = request.getParameter("card2"); 
		String value3 = request.getParameter("card3"); 
		String value4 = request.getParameter("card4"); 
		String value5 = request.getParameter("card5"); 

		String msg = "";
		if (value1 != null) {
			     
			Bulbasaur   get= new Bulbasaur();
			 
			// Create the object for Bulbasaur class and use getters to retrieve the values	
			msg = "<center>" + //getter + "  #" + //getter;
			request.setAttribute("message1",);
			request.setAttribute("character1", get.getCharacteristics()); 
			request.setAttribute("type1",get.getType());
			request.setAttribute("evolution1", get.getEvolution());
			request.setAttribute("baseExp1", get.getBaseExp());
		}

		if (value2 != null) {
			// Create the object for Charizard class and use getters to retrieve the values	
			        Charizard   get = new Charizard();
			  
			msg = "<center>" + //getter + "  #" + //getter;
			request.setAttribute("message2",);
			request.setAttribute("character2", get.getCharacteristics());
			request.setAttribute("type2",get.getType());
			request.setAttribute("evolution2", get.getEvolution());
			request.setAttribute("baseExp2", get.getBaseExp());
		}

		if (value3 != null) {

			// Create the object for Dragonite class and use getters to retrieve the values	
                                      Dragonite get =new Dragonite();
			          
			msg = "<center>" + //getter + "  #" + //getter;
			request.setAttribute("message3",);
			request.setAttribute("character3", get.getCharacteristics);
			request.setAttribute("type3",get.getType());
			request.setAttribute("evolution3", get.getEvolution());
			request.setAttribute("baseExp3",get.getBaseExp());
		}
		if (value4 != null) {
                                  Mew get =new Mew();
			// Create the object for Mew class and use getters to retrieve the values	
			/*	  
			msg = "<center>" + //getter + "  #" + //getter;
			request.setAttribute("message4",//getter);
			request.setAttribute("character4", //getter);
			request.setAttribute("type4",//getter;
			request.setAttribute("evolution4", //getter);
			request.setAttribute("baseExp4", //getter);*/
		}

		if (value5 != null) {

			// Create the object for Pikachu class and use getters to retrieve the values	
/*getter*/
			/*	  
			msg = "<center>" + //getter + "  #" + //getter;
			request.setAttribute("message5",//getter);
			request.setAttribute("character5", //getter);
			request.setAttribute("type5",//getter;
			request.setAttribute("evolution5", //getter);
			request.setAttribute("baseExp5", //getter);*/

		}

		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/pokemon.jsp");
		rd.forward(request, response);

	}

}
