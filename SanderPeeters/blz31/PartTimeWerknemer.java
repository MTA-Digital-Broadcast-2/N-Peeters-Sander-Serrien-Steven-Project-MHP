public class PartTimeWerknemer extends Werknemer
{
    int urenGewerkt;
    
    public static void PartTimeWerknemer(String voornaam, String achternaam, int wNum, float sal, int urenGw)
    {
        super(voornaam, achternaam, wNum, sal); //constructor van Werknemer
        this.urenGewerkt = urenGw;
    }

    public void salarisVerhogen(int percentage)
    {
        if (percentage > 5)
        {
            System.out.println("FOUT: PartTimeWerknemers kunnen slechts 5% opslag krijgen!");
        } else
        {
            super.salarisVerhogen(percentage);
        }
    }
}