
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
    static int antall;
    static Scanner reader;
    static Calculator calculator; 

    public static void main(String[] args) {
        String antallStr;
        calculator = new Calculator(); 
        reader =    new Scanner(System.in);     
        System.out.println("Velkommen til Lek med tall");
             
        System.out.print("Antall tall : > ");
        antallStr = reader.next();
        antall =  Integer.parseInt(antallStr);   
        run();
    }
    
    public static void run() {
        calculator.fillList(antall);
        
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
                      calculator.printNumberList();
                      break;
                case "P": 
                      calculator.getAllPar();
                      calculator.printSortedList();
                      break; 
                case "O": 
                      calculator.getAllOdde();
                      calculator.printSortedList();
                      break;
                case "X": 
                      calculator.getAllPrim();
                      calculator.printSortedList();
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
   
}           // end class
    
    
  