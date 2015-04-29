public class StudentWerknemer extends PartTimeWerknemer
{
    public StudentWerknemer (String voornaam, String achternaam, int wNum, float sal, int urengw)
    {
        super(voornaam, achternaam, wNum, sal, urengw); //verplicht aan te roepen op 1e regel
        setRSZ(5);
    }
}