import java.util.Random;
/**
 * Class LottoRekke: Will give one out of 31 (or another limit
 * 
 * @author Hallgeir
 * @version 150217
 */
public class LottoRekke
{
    private int spinValue;      // tallet som nå "trekkes", genereres
    private int[] rekke;        // skal inneholde rekka av tall, max 7
    private static final int max = 31;  //antall mulige tall
    private int tilNaa ;        // keep track of how many numbers selected
    private Random generator;   // selve "trekkeren"
     

    /**
     * Constructor for objects of class LottoRekke
     */
    public LottoRekke()
    {
        rekke = new int[7];         // NB Plass til 7 tall, i indeks 0 til og med 6
        generator = new Random();
        //generator.setSeed(100);
        tilNaa = 0;
    }

    /**
     * @return returnerer ett tall
     */
    public int selectNumber()
    { int newNumber = generator.nextInt(max);
      return newNumber;    
    }
    
    /**
     * @return true hvis det er et nytt, dvs unikt tall vi har trukket
     * @param oneNumber er det nye tallet som er trukket
     */
    public boolean isValid(int oneNumber)
    {
        boolean valid = true; 
        for(int tallet : rekke) {
            if (oneNumber == tallet)
                valid = false; 
            }        
        return valid;
    }

    /**
     * Will add one figure to the arraylist
     * Trekker tall, til vi har fått et nytt tall, legger dette inn i lista. 
     */    
    public void pickOneNumber()
    {
        int number = selectNumber();
        boolean valid = true; 
        boolean numberAdded = false;
        while (numberAdded == false)
            {   if (isValid(number))
                    {   rekke[tilNaa] = number;
                        tilNaa++;
                        numberAdded = true;
                    }
                else
                    number = selectNumber();    
            } // end while
    }            
    
    
    /**
     * Genererer en rad, dvs en lottorad, med 7 unike tall. 
     * 
     */
    public void generateOneRow()
    {
        while (tilNaa <= 6)
        {   pickOneNumber();
        }    
    }    

    /**
     *  Skriver ut en lottoRad
     */
    public void printOneRow()
    {   int teller = 0;
        System.out.println();
        while (teller <=6)
        { System.out.print(rekke[teller] + " ");
          teller++;
        }
    }
    

    /**
     * @return returnerer ett tall fra lottorekka
     * @param i angir hvilket tall
     */
    public int getOneNumber(int i)
    {
        int oneNumber;
        oneNumber = rekke[i];
        return oneNumber;
    }
    

    /**
     * Sorterer rekka. Bruker dobbel løkke for å få til dette.  
     */
    public void sortRow()
    {   int loper = 0;          // alltid minst 1 mer enn current
        int current = 0;        // posisjonen som skal få "riktig" verdi
        
        while (current < 6)       // PS Den indre løkka går en ekstra opp
        {   int tmp;
            loper = current +1;
            while (loper <=6)
                {   if (rekke[current] > rekke[loper] )
                    {   tmp = rekke[loper];
                        rekke[loper] = rekke[current];
                        rekke[current] = tmp;
                    }
                    loper++;
                }  // slutt loper while, finner riktig tall for en posisjon
            current++;
        }       // slutt current
    }
    
    /**
     * 1: generer en rekke
     * 2: Sorter rekka
     */
    public void generateAndSortRow()
    {
        generateOneRow();
        sortRow();
    }
    
}



