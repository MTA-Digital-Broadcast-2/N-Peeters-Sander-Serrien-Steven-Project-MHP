import java.lang.*;

public class Oef3 {

    public static void main(String[] args)
    {
        float som = 0;
        float noemer= 1;
        while (noemer<5000)
        {
            som += (1.0/noemer);
            noemer +=4;
        }
        
        noemer = 3;
        while (noemer<5000)
        {
            som -= (1.0/noemer);
            noemer +=4;
        }
        som = som*4;
        System.out.println(som);
    }
    
}