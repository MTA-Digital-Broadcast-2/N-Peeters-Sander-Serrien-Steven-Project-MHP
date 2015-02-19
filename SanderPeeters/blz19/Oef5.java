import java.lang.*;

public class Oef5
{
    
    public static void main(String[] args)
    {
        for (int getal = 1; getal <=100; getal++)
        {
            boolean isPriem = true;
            
            for (int i=2;i<=getal-1;i++)
            {
                if(getal % i == 0)
                {
                    isPriem = false;
                }
            }
            if (isPriem)
            {
                System.out.println(getal + " is een priemgetal.");
            }
        }
    }
    
}