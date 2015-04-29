public class Faktuur implements Betaalbaar
{
    public int faktrnr;
    public int bedrag;
    
    public Faktuur (int fnr, int bedr)
    {
        faktrnr = fnr;
        bedrag = bedr;
    }
    
    public void betaal() // verplicht voor Betaalbaar interface
    {
        System.out.println("Betaal het bedrag van " + bedrag + " voor faktuur " + faktrnr);
    }
}