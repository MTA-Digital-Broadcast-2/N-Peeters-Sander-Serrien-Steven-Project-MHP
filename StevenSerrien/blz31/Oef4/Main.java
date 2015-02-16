import java.lang.*;

public class Main
{

	public static void main(String args[])
    	{
        Werknemer bertje = new Werknemer("Bertje", "Vermeulen", 1, 1000.0f);
	Werknemer herman = new Werknemer("Herman", "Alokes", 2, 1000.0f);
	Werknemer steven = new Werknemer("Steven", "Serrien", 3, 1000.0f);
	Werknemer fien = new Werknemer("Fien", "Foor", 4, 1000.0f);
	PartTimeWerknemer jantje = new PartTimeWerknemer("Jantje", "Jeetje", 5, 1020.0f, 50);
	PartTimeWerknemer mike = new PartTimeWerknemer("Mike", "DeCleir", 6, 1060.0f, 75);

	jantje.salarisVerhogen(10);
	mike.salarisVerhogen(10);
	

	
	System.out.println(mike.getSalaris());
	System.out.println(jantje.getSalaris());
	
    	}
	
    	public void verhoogSalaris()
	{
	
	}
	
    	
	
}

