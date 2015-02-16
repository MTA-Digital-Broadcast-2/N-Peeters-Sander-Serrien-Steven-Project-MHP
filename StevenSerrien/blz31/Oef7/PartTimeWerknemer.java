public class PartTimeWerknemer extends Werknemer {

	int urenGewerkt;
	
	public PartTimeWerknemer(String voornaam, String achternaam, int wNum, float sal, int urenGw)
	{
	super(voornaam, achternaam, wNum, sal); //Constructor van werknemer
	this.urenGewerkt = wNum;
	}

	public void salarisVerhogen(int percentage)
	{
		if(percentage > 5)
		{
			percentage = 0;
			System.out.println("Fout: slechts 5% opslag toegestaan");

		}
		else
		{
		super.salarisVerhogen(percentage);
		}
	}


}