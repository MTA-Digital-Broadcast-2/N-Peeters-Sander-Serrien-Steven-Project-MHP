import java.lang.*;

public class Oef5 
{

    	public static void main(String[] args)
    	{
        priemGetallen();
    	}

    	public static void priemGetallen()
	{

	
	for(int i=3;i<=99;i++)
	{
	boolean isPriem = true;

		for(int b=2;b<=i-1;b++)
		{
		
			if(i % b == 0)
			{
			isPriem = false;
			} else {
			
			}
		}
	//output
	if(isPriem)
		{
			System.out.println(i + " Is een Priemgetal.");
		}
	
	}
	
            
        		

        
    	}
	
}