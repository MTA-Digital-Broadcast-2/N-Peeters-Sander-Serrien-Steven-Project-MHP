import java.lang.*;

public class Oef6 
{

    	public static void main(String[] args)
    	{
        priemGetallen();
    	}

    	public static void priemGetallen()
		{

		int a[] = {12,34,56,78,123,234,99,88};
		int getal1 = 0;

		for(int i=0;i<=7;i++){
		if (a[i]>getal1){
			getal1 = a[i];
		}

		}
		System.out.println(getal1 + " Is het grootste getal in de array");

		
            
        		

        
    	}
	
}