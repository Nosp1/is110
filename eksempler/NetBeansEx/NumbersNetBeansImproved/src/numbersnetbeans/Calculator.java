/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbersnetbeans;

import java.util.ArrayList;

/**
 *
 * @author hallgeir
 */
public class Calculator {
    
    static ArrayList<Integer> numberList = new ArrayList<>();
    static ArrayList<Integer> sortedList = new ArrayList<>();

    
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
    
    
}
