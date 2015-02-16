import java.lang.*;

public class EersteProg {

/* Dit is de main-functie, hier start het programma.
*/
	public static void main(String args[])
	{
	
		Berekening();
	}

	public static void Berekening()
	{
		System.out.println(~10);
		/* 10 = 0001010
		 *~10 = 1110101 (-11)
		 *	     +1
		 *11 = 0001011 (11)
		*/
	}
}