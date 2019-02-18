import java.util.ArrayList;
/**
 * class LottoSpill will 
 *      1: Generate the LOTTO row, as they do at Norsk Tiping
 *      2: Generate one Lotto Row
 *      3: Check one lotto row against the LOTTO row. 
 *      4: Repeat 2 and 3 until there is a winner, 7 equal numbers
 *      5: Show how many rows to play in order to win
 * 
 * @author Hallgeir 
 * @version 070119
 */
public class LottoSpill
{
    private LottoRekke vinnerRekka;
    private LottoRekke enRekke;

    /**
     * Constructor for objects of class LottoSpill
     * Genererer vinnerrekka. 
     */
    public LottoSpill()
    {
        vinnerRekka = new LottoRekke();
        enRekke = new LottoRekke();
        generateWinningRow();
        playGame();
    }

    /**
     *  Denne metoden er i klassen LottoRekke, trekker 7 unike tall
     *  og sorter disse. Dette er vinnerrekka.
     */
    public void generateWinningRow()
    {
         vinnerRekka.generateAndSortRow();
    }
    
    /**
     * @return returnerer true hvis 7 rette, false ellers
     * Generere EN lottorekke, og sjekker denne mot vinnerrekka. 
     * Returnerer false hvis IKKE 7 rette. 
     * private fordi dette er en hjelpemetode
     */
    private boolean newRowAndCheck()
    {
        enRekke = new LottoRekke();     //oppretter nytt objekt, inlusib
        enRekke.generateAndSortRow(); 
              
        boolean winner; 
        winner =checkTwoRows(); // true means we have a winner
        return winner;
    }
    
    /**
     * @param enRekke er den nye rekka, sjekkes mot vinnerrekka
     * @return returnerer true hvis to like rekker, false ellers
     * Sjekker to sorterte rekker.
     * returnerer false hvis ett eller flere avvik mellom de to. 
     * private fordi dette er en hjelpemetode
     */
    private boolean checkTwoRows()
    {
        //PS: Kanskje heller ha en metode i LottoRekke, nesten som en equals metode. 
        
        int teller = 0;
        boolean lik = true; 
               
        while (teller <=6  && (lik))
        {
            if (vinnerRekka.getOneNumber(teller) != enRekke.getOneNumber(teller))
               { lik = false;
                
                }
            teller++;
        }
        
        return lik;
    }

    /**
     * @return antall lottorekker for å kåre en vinner
     * Dette er hovedmetoden for ETT spill, trekker lottorekker inntil vi 
     * får 7 rette. 
     */
    public int playGame()
    {
        int noOfRows =0;
        boolean win = false;
        
        while (win == false)
        {
            win = newRowAndCheck(); 
            noOfRows++;
        }
        // Her vet vi at vi har fått ei vinnerrekke    
        printWinner(noOfRows);
        return noOfRows;
    }
 
    /**
     * @param antall rekker for å vinne 
     * Metode for utskrift, for å angi hvor mange rekker som måtte til for
     * å få en vinner.
     */
     private void printWinner(int noOfRows)
     {
         System.out.println("Congratulations  ");
         System.out.println("Number of rows: " +noOfRows);
     }
     
     /**
      *     @param noOfGames : antall spill som skal simuleres
      *     @return Gjennomsnittlig antall rekker for å vinne, basert på noOfGames spill
      *     Metode for å simulere lotto over flere uker, der vi utifra EN vinnerrekke
      *     generer inntil vi har en vinner. Dette gjentar vi noOfGames ganger.
      *     
      */
     public int manyGames(int noOfGames)
     {
         int counter =0;
         int total = 0; 
         while (counter <= noOfGames)
         {
             total = total + playGame();
             counter++;
         }
         
         //System.out.println("=====================================================================================");
         //System.out.println("Average no of rows to win: " + total/noOfGames);
         
         return total/noOfGames;
     }
        
     /**
      * @param alderNaa : nåværende alder
      * @param forventetAlder er hvor lenge personen forventer å leve
      * @param grunnlag er hvor mange spill som brukes som grunnlag for å finne 
      *     snittet for å vinne
      * Finner hvor mange rekker vi må spille for å sannsynligvis vinne.     
      */
     public void jegVilVinne(int alderNaa, int forventetAlder, int grunnlag)
     {
         int raderUke;
         int snittForVinne;
         int antalluker = (forventetAlder -alderNaa) * 52;
         
         snittForVinne = manyGames(grunnlag);
         
         raderUke = snittForVinne/antalluker;
         
         System.out.println("Du må spille " +raderUke + " rader pr uke for sannsynligvis å vinne");

        }
        
}
