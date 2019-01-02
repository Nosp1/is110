import java.util.ArrayList;
/**
 * class LottoSpill will 
 *      1: Generate the LOTTO row, as they do at Norsk Tiping
 *      2: Generate Lotto Rows
 *      3: Check how many rows to do in order to win
 * 
 * @author Hallgeir 
 * @version 150218
 */
public class LottoSpill
{
    private LottoRekke vinnerRekka;
    private ArrayList<LottoRekke> enRekke;

    /**
     * Constructor for objects of class LottoSpill
     */
    public LottoSpill()
    {
        vinnerRekka = new LottoRekke();
        enRekke = new ArrayList<LottoRekke>();
        generateWinningRow();
        
    }

    /**
     * 
     * 
     */
    public void generateWinningRow()
    {
         vinnerRekka.generateAndSortRow();
    }
    
    
    public boolean newRowAndCheck()
    {
        LottoRekke newRow =new LottoRekke();
        newRow.generateAndSortRow();
        // alleRekker.add(newRow);              // Stopper opp hvis for mange millioner i arraylista
        
        boolean winner; 
        winner =checkTwoRows(newRow); // true means we have a winner
        return winner;
    }
    
    public boolean checkTwoRows(LottoRekke newRow)
    {
        int teller = 0;
        boolean lik = true; 
        
        while (teller <=6)
        {
            if (vinnerRekka.getOneNumber(teller) != newRow.getOneNumber(teller))
                lik = false;
            teller++;
        }
        
        return lik;
    }
    
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
 
    
     public void printWinner(int noOfRows)
     {
         System.out.println("Congratulations  ");
         System.out.println("Number of rows: " +noOfRows);
     }
     
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
