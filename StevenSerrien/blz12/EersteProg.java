import java.lang.*;

public class EersteProg {

/* Dit is de main-functie, hier start het programma.
*/
	public static void main(String args[])
	{
	/** 
	* Dit is de eerste methode.
	*@param args Dit is een array van strings waarmee parameters kunnen meegegeven worden via de commandline.
	*/
		drukaf(100);	
	}

	private static void drukaf(int m)
	{

	/**
	* Dit is de tweede methode.
	*/
		int a;
		for (a=0;a<m;a++){
			System.out.println(a);
		}
	}
}