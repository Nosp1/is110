import java.util.ArrayList;

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

public class Main {
    
    ArrayList<Integer> numberList = new ArrayList<Integer>();
    ArrayList<Integer> sortedList = new ArrayList<Integer>();

    /**
     * Fills the first list with some data (numbers). 
     * Change this to whatever you want, if you'd like.
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
     * and return these odde numbers in a new ArrayList
     */
    public void  getAllOdde()
    {
        sortedList.clear();
        for (Integer i : numberList)
        {if ((i%2) !=0)
            sortedList.add(i);
        }     
    }

    public void  getAllPar()
    {
        sortedList.clear();
        for (Integer i : numberList)
        {if ((i%2) ==0)
            sortedList.add(i);
        }     
    }

    
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
        }
    }
}
