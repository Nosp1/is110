/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbers190218;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hallgeir
 */
public class Numbers190218 {

    private static ArrayList<Integer> tallRekke;
    private static ArrayList<Integer> uttrekk;
    private static Scanner leser;
    
    
    public static void main(String[] args) {
        int antall;
        String svar;
        tallRekke = new ArrayList<>();
        uttrekk = new ArrayList<>();
        leser = new Scanner(System.in);
        
        // Les antall, og opprett grunnlagstall
        System.out.println("Oppgi antall tall: >");
        antall = leser.nextInt();
        fyllListe(antall);
        
        System.out.println("A alle P partll O X primtall Q quit >" );
        svar = leser.next().toLowerCase();
        
        while (!svar.contains("q"))
        {
            if (svar.contains("a"))
                 skrivAlle(tallRekke);
            else if (svar.contains("p"))
            {
                parTall();
                skrivAlle(uttrekk);
            }
            else if (svar.contains("o"))
            {
                oddeTall();
                skrivAlle(uttrekk);
            }
            
            System.out.println("A alle P partll O X primtall Q quit >" );
            svar = leser.next().toLowerCase();
        }
       
        
    }
    
    private static void  fyllListe(int antall)
    {
        for (int teller=0; teller < antall;teller++)
            tallRekke.add(teller);
    }
    
    private static void skrivAlle(ArrayList<Integer> liste)
    {
        System.out.println("Alle tallene");
        for (int i : liste)
            System.out.println(i);
        
    }
    
    private static void parTall()
    {
        uttrekk.clear();
        for (int i : tallRekke)
            if ((i%2)==0 )
                uttrekk.add(i);
    }
    
    private static void oddeTall()
    {
        uttrekk.clear();
        for (int i : tallRekke)
            if (((i%2)==1 ))
                uttrekk.add(i);
    }
    
    private static void primTall()
    {
        uttrekk.clear();
        boolean prim; 
        
        int i = 2;
        int ant = tallRekke.size();
        
        while (i < ant)
        {
            prim=true;
            for (int loper =2; loper < (i-1); loper++)
            { if (i%loper ==0)
                prim=false;
              }
            if (prim)
                uttrekk.add(i);
            i++;
        }
    }
}
