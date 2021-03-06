package model;

import model.Pokemon;
//PROGRESSION - 4
//Go to JAVA Resouces - src/model and create a child class called Dragonite inside the model package with the following arguments
//String characteristics 
//String type
//String evolution
//String baseExp
//
//Dragonite must extend the Pokemon class
//Generate appropriate getters and setters
//Generate a six argument constructor with the following arguments (pokemonName,pokemonNumber,characteristics,type,evolution,baseExp) and pokemonName and pokemonNumber should refer to the parent constructor in the Pokemon class. 
//
//Use the predefined values given below as constructor arguments 
//pokemonName = Dragonite
//pokemonNumber = 149
//characteristics = "Dragonite is capable of flying faster than the speed of sound. It is a kindhearted Pok�mon with human-like intelligence. It shows signs of altruism."
//type = "DRAGON"
//evolution = "DRATINI"
//baseExp = "270" 

public class Dragonite extends Pokemon
{      String characteristics, type,evolution,baseExp;
	         public void setCharacteristics(String characteristics)
	         {
	        	    this.characteristics=characteristics;
	         }
	         public String getCharacteristics()
	         {
	        	 return characteristics;
	         }
	         public void setType(String type)
	         {
	        	 this.type=type;
	         }
	         public String getType()
	         {
	        	 return type;
	         }
	         public void setEvolution(String evolution)
	         {
	        	 this.evolution=evolution;
	         }
	         public String getEvolution()
	         {
	        	 return evolution;
	         }
	         public void setBaseExp(String baseExp)
	         {
	        	 this.baseExp=baseExp;
	         }
	         public String getBaseExp()
	         {
	        	 return baseExp;
	         }
	         public  Dragonite()
	         {
	        	 super("Dragonite",149);
	     		this.characteristics="Dragonite is capable of flying faster than the speed of sound. It is a kindhearted Pokémon with human-like intelligence. It shows signs of altruism.";
	     		this.type="poison";
	     		this.evolution = "DRAGON";
	     		this.baseExp = "270" ;
	         }
	}
