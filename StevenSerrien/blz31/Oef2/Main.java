import java.lang.*;

public class Main
{

	public static void main(String args[])
    	{
        Werknemer bertje = new Werknemer("Bertje", "Vermeulen", 1, 1000.0f);
	Werknemer herman = new Werknemer("Herman", "Alokes", 2, 1000.0f);
	Werknemer steven = new Werknemer("Steven", "Serrien", 3, 1000.0f);
	Werknemer fien = new Werknemer("Fien", "Foor", 4, 1000.0f);

	bertje.salarisVerhogen(10);
	herman.salarisVerhogen(10);
	

	System.out.println(bertje.getSalaris());
	System.out.println(herman.getSalaris());
	System.out.println(steven.getSalaris());
	System.out.println(fien.getSalaris());
    	}
	
    	public void verhoogSalaris()
	{
	
	}
	
    	
	
}

