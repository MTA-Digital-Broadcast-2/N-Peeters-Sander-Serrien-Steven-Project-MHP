public class Main
{
    public static void main(String args[])
    {
        Werknemer herman = new Werknemer("Herman", "Hermans", 1, 1000.0f);
        Werknemer jan = new Werknemer("Jan", "Janssens", 2, 1000.0f);
        Werknemer peter = new Werknemer("Peter", "Peeters", 3, 1000.0f);
        Werknemer sander = new Werknemer("Sander", "Peeters", 4, 1000.0f);
        
        //oef2
        herman.salarisVerhogen(10);
        peter.salarisVerhogen(10);
        
        System.out.println(herman.voornaam + " verdient " + herman.getSalaris());
        System.out.println(jan.voornaam + " verdient " + jan.getSalaris());
        System.out.println(peter.voornaam + " verdient " + peter.getSalaris());
        System.out.println(sander.voornaam + " verdient " + sander.getSalaris());
        
        //oef3
        PartTimeMedewerker suzy= new PartTimeMedewerker("Suzy", "Wafels", 5, 10.0f, 20);
        PartTimeMedewerker kelly = new PartTimeMedewerker("Kelly", "Luiaerts", 6, 10.0f, 20);
        
        //oef 4
        suzy.salarisVerhogen(10);
        System.Out.println(suzy.voornaam + "verdient  " + suzy.getSalaris());
        
        //oef 5 + 6
        System.Out.println(sander.voornaam + "verdient  " + sander.getRSZ() + " RSZ");
        System.Out.println(suzy.voornaam + "verdient  " + suzy.getRSZ() + "% RSZ");
        
        //oef 7
        StudentWerknemer bert = new StudentWerknemer ("Bert", "Blokker", 7, 10.0f, 20);
        System.out.println(bert.voornaam + " betaalt " + bert.getRSZ() + "% RSZ");
        
        //oef 8+9
        koen.betaal();
        suzy.betaal();
        bert.betaal();
        
        //oef 10
        Faktuur fakt1 = new Faktuur (1, 100);
        fakt1.betaal();
        
        //DEMO INTERFACES
        Betaalbaar[] objecten = new Betaalbaar[4];
        
        objecten[0]=bert;
        objecten[1]=sander;
        objecten[2]=fakt1; //faktuur!!
        objecten[3]=suzy;
        
        for (int i=0;i<=3;i++)
        {
            objecten[i].betaal(); //alle objecten zijn Betaalbaar
        }
    }
}