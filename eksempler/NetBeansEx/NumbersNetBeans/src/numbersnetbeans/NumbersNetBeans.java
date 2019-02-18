
/***
 * In this project you will find two ArrayLists, along
 * with some sample methods.
 * 
 * Read the task-description on Canvas, and 
 * implement the methods you feel would work well.
 * 
 * The list you should retrieve the numbers from is called
 * 'numberList', which should be filled up with some data. 
 * 
 * The list you should put the numbers into is called
 * 'sortedList'. 
 * 
 * Good luck (:
 * 
 * @author Edvin
 */
package numbersnetbeans;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hallgeir
 */
public class NumbersNetBeans {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Integer> numberList = new ArrayList<>();
    static ArrayList<Integer> sortedList = new ArrayList<>();
    static int antall;
    static Scanner reader;

    public static void main(String[] args) {
        String antallStr;
        
        reader =    new Scanner(System.in);     
        System.out.println("Velkommen til Lek med tall");
     
        
        System.out.print("Antall tall : > ");
        antallStr = reader.next();
        antall =  Integer.parseInt(antallStr);   
        run();
    }
    
    public static void run() {
        fillList(antall);
        
        String svar ="";
        System.out.println("A alle P partall O odde X prim Q avslutt : >");
        svar= reader.nextLine();
        while (!svar.contains("Q"))
        {
            //System.out.println("A alle P partall O odde X prim Q avslutt : >");
            //svar= reader.nextLine();
            
             switch(svar) 
            { 
                case "A": 
                      printNumberList();
                      break;
                case "P": 
                      getAllPar();
                      printSortedList();
                      break; 
                case "O": 
                      getAllOdde();
                      printSortedList();
                      break;
                case "X": 
                      getAllPrim();
                      printSortedList();
                      break;
                default: 
                    //System.out.println("A alle P partall O odde X prim Q avslutt : >");
                    //svar= reader.nextLine();
                    break;
        }   //end switch
            System.out.println("A alle P partall O odde X prim Q avslutt : >");
            svar= reader.nextLine();
      }     //end while
    }       //end run          

     
 
    /**
     * Fills the first list with some data (numbers). 
     * Change this to whatever you want, if you'd like.
     */
    public static void fillList(int ant) {
        
        for (int i = 0; i <= ant; i++) {
            numberList.add(i);
        }
    }
    
    /**
     * Simply prints a list of numbers from
     * the numberList. 
     */
    public static void printNumberList() {
        
        for (Integer i : numberList) {
            
            System.out.println(i);
        }
    }
    
        /**
     * Simply prints a list of numbers from
     * the sortedList. 
     */
    public static void printSortedList() {
        
        for (Integer i : sortedList) {
            
            System.out.println(i);
        }
    }

    /**
     * This method will retrieve all odde numbers from an arraylist, 
     * and return these odde numbers in a new ArrayList
     */
    public static void  getAllOdde()
    {
        sortedList.clear();
        for (Integer i : numberList)
        {if ((i%2) !=0)
            sortedList.add(i);
        }     
    }

    public static void  getAllPar()
    {
        sortedList.clear();
        for (Integer i : numberList)
        {if ((i%2) ==0)
            sortedList.add(i);
        }     
    }

    
   public static void getAllPrim()
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
}           // end class
    
    
  