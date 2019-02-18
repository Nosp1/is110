import java.util.Random;
/**
 * Class LottoRekke:  
 * 
 * @author Hallgeir
 * @version 190204
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
        generator = new Random();   // generator, PS, no seed
        //generator.setSeed(100);
        tilNaa = 0;
    }

    /**
     * @return Random objektet returnerer ett tall
     * verdier 0 til max-1
     * max er høyeste lovlige lotto tall. 
     */
    private int selectNumber()
    { int newNumber = generator.nextInt(max) +1;
      return newNumber;    
    }
    
    /**
     * @return true hvis det er et nytt, dvs unikt tall vi har trukket
     * @param oneNumber er det nye tallet som er trukket
     * Logikken er: Anta nytt tall er unikt. Sjekk likhet mot alle tall trukket,
     * og hvis likt med ett, blir valid = false, dvs IKKE et nytt unikt tall. 
     */
    private boolean isValid(int oneNumber)
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
     * Logikken er: 
     *      - trekk ett tall
     *      - gå i løkke inntil vi har trukket ett nytt unikt tall, og lagt dette til
     */    
    private void pickOneNumber()
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
    private void generateOneRow()
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
     * Logikken er: 
     */
    private void sortRow()
    {   int ytre = 0;       // posisjonen som skal få "riktig" verdi
        int indre = 0;      // alltid minst 1 mer enn ytre
        
        while (ytre < 6)   // PS ytre løkke sørger for riktig tall i pos = ytre
        {   int tmp;
            indre = ytre +1;
            while (indre <=6)
                {   if (rekke[ytre] > rekke[indre] )
                    {   tmp = rekke[indre];
                        rekke[indre] = rekke[ytre];
                        rekke[ytre] = tmp;
                    }
                    indre++;
                }  // slutt indre while, finner riktig tall for en posisjon
            ytre++;
        }       // slutt ytre løkke
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



