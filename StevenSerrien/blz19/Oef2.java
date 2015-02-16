import java.lang.*;

public class Oef2 {

    	public static void main(String[] args)
    	{
        	dagen();
    	}

    	public static void dagen()
	{
	
	String weekDagString = "trolo";
	int weekdag =1;
	
	for (int i=1;i<31;i++)
	{
	
	if (weekdag>7) {
	weekdag=1;
	}
	
	switch (weekdag) {
            case 1:  weekDagString = "Zondag";
                     break;
            case 2:  weekDagString = "Maandag";
                     break;
            case 3:  weekDagString = "Dinsdag";
                     break;
            case 4:  weekDagString = "Woensdag";
                     break;
            case 5:  weekDagString = "Donderdag";
                     break;
            case 6:  weekDagString = "Vrijdag";
                     break;
            case 7:  weekDagString = "Zaterdag";
                     break;
            
            default: break;
       		}
		 System.out.println("De " + i + "e dag van de maand is: " + weekDagString);
		weekdag = weekdag + 1;
		}
        
    	}
	
}