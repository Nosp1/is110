/*
 * Kalkulator er en hjelpeklasse som får et tall, ett valg
 * og en mulighet for å skrive som utgangspunkt. 
 * Basert på valget hentes par, odde prim eller alle tall
 * fra 0 opp til antallet vi oppgav. 
 */
package beregn;

import java.io.PrintWriter;
import java.util.ArrayList;
import skriver.TallSkriver;

/**
 *
 * @author hallgeir
 */
public class Kalkulator { 
    private ArrayList<Integer> numberList;
    private ArrayList<Integer> sortedList;

    private int antall;
    private String valg;
    private PrintWriter out;
    private TallSkriver skriver;
         
   /*
        Oppretter en Kalkulator 
    */
   
    public Kalkulator(PrintWriter out, int antall, String valg)
    {
        numberList = new ArrayList<>();
        sortedList = new ArrayList<>();
        this.out = out; 
        this.antall = antall; 
        this.valg = valg;
        skriver = new TallSkriver();
        //run();
    }    
    
    /*
        Metoden run er "hovedprogrammet", gjør all logikken. 
        - Fyller lista med tall
        - basert på valg, trekk ut par, odde, prim, alle
        - skriv ut ArrayLista der resultatet er
    */
    public void run()
    {
       fillList(antall); 
       if (valg.contains("Alle"))
           sortedList = numberList; 
       else if (valg.contains("Odde"))
           getAllOdde();
       else if (valg.contains("Par"))
           getAllPar();
       else if (valg.contains("Prim"))
           getAllPrim();
       //printSortedList();
       skriver.skrivTall(antall, valg, sortedList,out);
    }
    
   /*
        Oppretter lista der alle tallene er
    */
     public void fillList(int ant) {
        
        for (int i = 0; i <= ant; i++) {
            numberList.add(i);
        }
    }
    
    /**
     * Simply prints a list of numbers from
     * the numberList. 
     */
    public void printNumberList() {
        
        for (Integer i : numberList) {            
            System.out.println(i);
        }
    }
    
        /**
     * Simply prints a list of numbers from
     * the sortedList. 
     */
    public void printSortedList() {
        for (Integer i : sortedList) {
            System.out.println(i);
        }
    }

    /**
     * This method will retrieve all odde numbers from an arraylist, 
     * and put these odd numbers in a new ArrayList
     */
    public void  getAllOdde()
    {
        sortedList.clear();
        for (Integer i : numberList)
        {if ((i%2) !=0)
            sortedList.add(i);
        }     
    }

    /**
     * This method will retrieve all par numbers from an arraylist, 
     * and put these par numbers in a new ArrayList
     */
    public void  getAllPar()
    {
        sortedList.clear();
        for (Integer i : numberList)
        {if ((i%2) ==0)
            sortedList.add(i);
        }     
    }

    /**
     * This method will retrieve all prim numbers from an arraylist, 
     * and put these prim numbers in a new ArrayList
     */
   public void getAllPrim()
    {
        sortedList.clear();
        boolean prim;
        int i = 2; 
        int ant = numberList.size();
        while (i < ant) 
          {
            prim = true; 
            for (int loper = 2; loper < (i-1); loper++)
            {
                if ((i%loper) ==0)
                    prim = false;
            }
            if (prim ==true)
                sortedList.add(i);
            i++;    
        }   //end while
    }       //end getAllPrim
    
}
