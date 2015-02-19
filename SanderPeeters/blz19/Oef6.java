import java.lang.*;

public class Oef6 {
    
    public static void main(String[] args)
    {
        BepaalDeGrootste();
    }
    
    public static void BepaalDeGrootste()
    {
        int[] a = {12,34,56,78,123,234,99,88};
        int grootste = a[0];
        
        for(int i=1;i<a.length ;i++)
        {
            if(a[i]>grootste)
            {
                grootste = a[i];
            }
        }
        System.out.println("Het grootste getal uit de array is: " + grootste);
    }
}