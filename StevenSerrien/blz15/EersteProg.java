import java.lang.*;

public class EersteProg {

/* Dit is de main-functie, hier start het programma.
*/
	public static void main(String args[])
	{
	
		forNaarWhile();
	}

	public static void forNaarWhile()
	{
		/* for (i=55;i>34;i--){
		* System.out.println(i);
		*}
		*/

		int i = 55;
		while (i > 34)
		{	
			System.out.println(i);
			i--;
		} 
	}
}