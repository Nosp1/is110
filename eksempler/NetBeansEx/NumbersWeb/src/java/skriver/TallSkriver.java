/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skriver;

import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author hallgeir
 */
public class TallSkriver {

public void skrivTall(int antall, String valg, ArrayList<Integer> sortedList, PrintWriter out) {

//       skrivHtmlHeader(out,  "En modul");
       
        /*  HN: We arrive here, in a POJO, from a servlet. 
            From the calling Servlet, ApprovalDetail, we used session to 
            store firstname, lastname, email 
        */
        out.println("<h1> Totalt antall: " +antall +" </h1>");
        out.println("<h1> Nå ser vi på alle " +valg +" tallene </h1>");        
        int loper=0;
        for (int i : sortedList)
        {
            if (loper%2 ==0)
                out.println("<font color=\"red\">");
            else 
                out.println("<font color=\"blue\">");
            
            loper++; 
            out.println(+i +",    " );
            if (loper > 4)
            
            {out.println("<br>");
             loper=0;   
             out.println("</font>");
            }
        }   
}    

 
   public void skrivHtmlHeader(PrintWriter out,  String tittel)
 {
      out.println("<!DOCTYPE html>");
       out.println("<html>");
       out.println("<head>");
       out.println("<title>" +tittel +"</title>");  
       out.println("<meta charset=\"UTF-8\">");    
       out.println("<link rel='stylesheet' href='../../../web/css.css'>");
       out.println("</head>");
 }


    
}
