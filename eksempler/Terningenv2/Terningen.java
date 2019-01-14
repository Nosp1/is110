import java.util.Random;
/**
 *
 * @author hallgeir
 */
public class Terningen {
    
private Random generator; 

public Terningen() {
    generator = new Random();
}


/**
 *  trillTerning utfører mange kast med terningen, for hvert kast oppdateres tabellen. 
 *  Tabellen mangeKast har indeksene 1 til og med 6, der antallet kast på hver av dem lagres. 
 */
public int trillTerning()
{  int ettKast;
   ettKast = generator.nextInt(6);  // verdi fom 0 til 5
   ettKast++;
   return ettKast;
}


}
