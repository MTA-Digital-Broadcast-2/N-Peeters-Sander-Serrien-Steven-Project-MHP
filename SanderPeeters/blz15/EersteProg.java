import java.lang.*;

/**
 * De klasse EersteProg is een Java applicatie
 *
 * @author Sander Peeters
 * @version 1.0
 */

public class EersteProg {
    /**
     *  Dit is een main-functie, hier start het programma
     *  @param args Dit is een array van strings waarmee parameters
     kunnen meegegeven worden vanaf de commandline.
     */

    public static void main(String args[] )
    {
        /*for (i=55;i>34;i--)
        {
            System.out.println(i);
        }
        */
        int i=55;
        while(i>34) {
            System.out.println(i);
            i--;
        }
    }
}
