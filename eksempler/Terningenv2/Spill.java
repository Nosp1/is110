/**
 * * @author hallgeir
 * * Skal trille terning. Antar at forventet fordeling er 100/6, dvs ideell fordling. 
 * * Når vi spiller angi vi akseptert avvik fra dette. Kan angi 1% avvik, eller 0.1
 * * PS Ved 0.001% avvik måtte det kastes 3.297.682.893, altså > 3.2 milliarder kast
 */
public class Spill {

    /**
     * @param args the command line arguments
     */
    Terningen enTerning;            // simulerer en terning
    private long[] mangeKast;       // tabell som teller opp hvor mange av hver, 1 til 6
    private long antallKast;        // antall ganger vi har kastet
    double forventet = (100/6.0);   // ideelt forventer vi 1/6 av hver, eller i prosent, 100/6
    
    
    public Spill()
    {
        mangeKast = new long[7];
        antallKast=0;
        enTerning = new Terningen();
    }    
    
    /**
     * Her spiller vi inntil avviket mellom ideell fordeling og vår fordeling 
     * max er som oppgitt. 
     * Sjekker alle 6 tall. 
     * @param diff angir differansen mellom idealet og faktisk fordeling pr nå
     */   
    public void spill(double diff) 
    {
        boolean lik = false;
        
        while (lik == false)
        {
            int valgt = enTerning.trillTerning();
            mangeKast[valgt]++;
            antallKast++;
            
                lik=likFordeling(diff);
        }

        skrivTerningene();
    }
    

    /**
     * Sjekker hver enkelt tall, om avviket i forhold til "idealet", 
     * (dvs helt lik fordeling), er større eller mindre enn grensen vi oppgav
     * private fordi denne kun skal brukes internt i klassen Spill
     */

    private boolean likFordeling(double diff)
    {  
        boolean lik = true;
        for (int i =1; i <=6; i++)
        {
            double antK = antallKast/1.0;
            //System.out.println("antK er  "  +antK);

            double pros = ((mangeKast[i]*100)/antK)/1.0;
            
            double avvik = Math.abs(pros - forventet);
            //System.out.println("pros er nå "  +pros);
            //System.out.println("forventet  er nå "  +forventet);
            //System.out.println("avvik er nå "  +avvik);
            //System.out.println("===========================");
            
            if (avvik >=diff) 
            {
                lik = false;
                break; 
            }
        }    
         
    return lik;
}



/**
 *  skrivTerningene skriver ut resultatet av kastene, både i antall og prosent. 
 */
public void skrivTerningene()
{
    int loper;
    System.out.println("TOTALT Antall  er " +antallKast);
    
    for (loper =1; loper <=6; loper++)
    {
        
        double antDenne = mangeKast[loper];
        double prosentDenne = antDenne*100 /antallKast;
        System.out.println("Antall " + loper +" er " +antDenne);
        System.out.println("Prosent med " +loper +" er " +prosentDenne);
        System.out.println("================================================");
    }

}

}