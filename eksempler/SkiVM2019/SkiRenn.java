import java.util.ArrayList; 
import java.util.Random; 

/**
 * Skal representere ett skirenn
 *
 * @author Hallgeir
 * @version 2019
 */
public class SkiRenn
{
    private String dato;  
    private String distanse; 
    private char kjonn;
    private ArrayList<Deltaker> deltakere;
    private Random generator;

    /**
     * Constructor for objects of class SkiRenn
     */
    public SkiRenn(String dato,String distanse, char kjonn)
    {
        this.dato = dato;
        this.distanse = distanse;
        this.kjonn = kjonn; 
        deltakere = new ArrayList<>();
        generator = new Random(); 
    }

    public void nyDeltaker(Deltaker ny)
    {
        deltakere.add(ny);
    }
    
    public void nyDeltaker(String forNavn,String etterNavn)
    {
        Person ny = new Person(forNavn,etterNavn);
        Deltaker nyDeltaker = new Deltaker(ny);
        deltakere.add(nyDeltaker);
    }
    
    private ArrayList sortList(ArrayList<Deltaker> usortert)
    {
        ArrayList<Deltaker> sortert = new ArrayList<>();
        int minst, ytre, indre; 
        for (ytre = 0; ytre < usortert.size(); ytre++)
        {
            minst = ytre; 
            for (indre = ytre+1; indre < usortert.size(); indre++)
            {
                if (usortert.get(indre).findTime() < usortert.get(minst).findTime())
                    minst = indre; 
            }
            // her vet vi at i indexen minst er laveste tid. Setter denne inn i ny sortert,
            // og fjerner fra usortert tabellen
            
            Deltaker temp; 
            temp = usortert.get(minst);
            sortert.add(temp);
            usortert.remove(temp);
             
        }
        return sortert; 
    }
    
    public void resultatListe()
    {
        deltakere = sortList(deltakere);
    }
    
    
    public void skrivAlle()
    {
        for (Deltaker enD : deltakere)
        {
            enD.skriv();
        }
    }
    
    
    public void testData(int ant)
    {
        Person nyP;
        Deltaker nyDeltaker;
        int genSlutt; 
        int loper =0;
        while (loper < ant)
        {
            String forNavn; 
            String etterNavn;
            forNavn = "Oddvar "+loper;
            etterNavn = "Braa " +loper+1;
            nyP = new Person(forNavn, etterNavn);
            nyDeltaker = new Deltaker(nyP);
            nyDeltaker.setStart(0);
            genSlutt = generator.nextInt(60) +60; 
            nyDeltaker.setSlutt(genSlutt);
            deltakere.add(nyDeltaker);
            loper++;
        }
        
    }
    
    
    
 }
