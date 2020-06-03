package model;

//PROGRESSION - 1 
//Go to JAVA Resouces - src/model and create a parent class called Pokemon inside the model package - with the following arguments
//String pokemonName
//Int pokemonNumber
//
//Generate appropriate getters and setters.
//Generate a two-argument constructor in the Pokemon class

public class Pokemon
{     
	    String pokemonName;
	    int pokemonNumber;
	    Pokemon(String pokemonName,int pokemonNumber) 
	    {
	    	  this.pokemonName=pokemonName;
	    	  this.pokemonNumber=pokemonNumber;
	    }
	       public void setPokemonName(String pokemonName)
	       {
	    	   this.pokemonName=pokemonName;
	       }
	      public String getPokemonName()
	      {
	    	   return pokemonName;
	      }
	      public void setPokemonNumber(int pokemonNumber)
	      {
	    	  this.pokemonNumber=pokemonNumber;
	      }
	      public int getPokemonNumber()
	      {
	    	  return pokemonNumber;
	      }
	}
