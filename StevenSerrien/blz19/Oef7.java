import java.lang.*;

public class Oef7
{

    	public static void main(String[] args)
    	{
        arrays();
    	}

    	public static void arrays()
		{

		int a[] = {12,34,56,78,123,234,99,88};
		int b[] = {0,0,0,0,0,0,0,0};
		int getal1 = 0;

		for(int i=0;i<=7;i++){
		if (a[i]>getal1){
			getal1 = a[i];
			
		}
		b[i] = getal1;
			a[i] = 0;
		}
		

		
            
        		

        for (int i = 0; i <= 7; i++) {
   			System.out.print(b[i] + ", ");
		}
    	}
	
}