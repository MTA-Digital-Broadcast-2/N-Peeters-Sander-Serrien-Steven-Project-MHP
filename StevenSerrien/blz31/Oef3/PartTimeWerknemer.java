public class PartTimeWerknemer extends Werknemer {

	int urenGewerkt;
	
	public PartTimeWerknemer(String voornaam, String achternaam, int wNum, float sal, int urenGw)
	{
	super(voornaam, achternaam, wNum, sal); //Constructor van werknemer
	this.urenGewerkt = wNum;
	}


}