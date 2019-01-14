import java.util.Random;
/**
 *
 * @author hallgeir
 */
public class Terningen {
    
private Random generator; 
private int[] mangeKast;
private int antallKast;

public Terningen(int max) {
    generator = new Random();
    mangeKast = new int[7];
    antallKast = max;       
}


/**
 *  trillTerning utfører mange kast med terningen, for hvert kast oppdateres tabellen. 
 *  Tabellen mangeKast har indeksene 1 til og med 6, der antallet kast på hver av dem lagres. 
 */
public void trillTerning()
{  int ettKast;
   int loper = 0;
   while (loper < antallKast)
   {
       ettKast = generator.nextInt(6);  // verdi fom 0 til 5
       
       ettKast++;                       //Vil ha 1 til 6
      
       mangeKast[ettKast]++;
       loper++;
    }
}

/**
 *  sktivTerningene skriver ut resultatet av kastene, både i antall og prosent. 
 */
public void skrivTerningene()
{
    int loper;
    for (loper =1; loper <=6; loper++)
    {
        double antDenne = mangeKast[loper];
        double prosentDenne = antDenne*100 /antallKast;
        System.out.println("Antall " + loper +" er " +antDenne);
        System.out.println("Prosent med " +loper +" er " +prosentDenne);
        System.out.println("================================================");
    }

}


}
