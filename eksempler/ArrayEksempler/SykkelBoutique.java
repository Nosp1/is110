

/**
 *
 * @author evenal
 */
public class SykkelBoutique
{
    Sykkel[] sykler;

    public SykkelBoutique(int plass) {
        sykler = new Sykkel[plass];
    }

    /**
     * for each løkke brukt på Array
     */
    public void skrivSykler() {
        System.out.println("Alle syklene, For-Each løkke. ");
        for (Sykkel s : sykler) {
            if (s != null)
                s.skrivUt();
        }
    }

    /**
     * for løkke brukt på Array
     */
    public void skrivSyklerFor() {
        System.out.println("Alle syklene, For løkke. ");
        int teller;
        int i;
        Sykkel enSykkel;
        for (teller=0; teller < sykler.length; teller++) {
            enSykkel = sykler[teller];
            if (enSykkel != null)
                enSykkel.skrivUt();
        }
    }
   
    public void skrivSyklerWhile() {
        System.out.println("Alle syklene, While løkke. ");
        int teller = 0;
        Sykkel enSykkel;
        while (teller < sykler.length) 
        {
            enSykkel = sykler[teller];
            if (enSykkel != null)
                enSykkel.skrivUt();
            teller++;    
        }
    }
    
    /**
     * while løkke brukt på Array. Går gjennom array, skriver ut. 
     * PS! Sjekker ikke om null
     * Dersom noe er fjernet, kan vi få nullPointer Exception
     */
    public void skrivSyklerUtenNullTest() {
        System.out.println("Alle syklene, uten NULL test");
        int teller = 0;
        Sykkel enSykkel;
        while (teller < sykler.length) 
        {
            enSykkel = sykler[teller];
            enSykkel.skrivUt();
            teller++;    
        }
    }
    
    
    public void selgSykkel(Sykkel s) {
        for (int i = 0; i < sykler.length; i++) {
            if (s.equals(sykler[i])) {
                sykler[i] = null;
                return;
            }
        }
    }

    /**
     * Fjern sykkel på angitt indeks. 
     */
    public void fjernSykkel(int i) {
        if (i < sykler.length)
            sykler[i] = null; 
    }
    
    
    public void nySykkel(Sykkel s) {
        for (int i = 0; i < sykler.length; i++) {
            if (sykler[i] == null) {
                sykler[i] = s;
                return;
            }
        }
    }
    
    /**
     * For test, generer nye sykler
     */
    public void genererSykler(int ant)
    {
        int loper =0;
        while (loper < ant && loper < sykler.length)
        {
            String type = "Terreng Modell: " + loper;
            String farge = "GulGrønn no : " + loper;
            int pris = 1000 + loper;
            
            Sykkel ny = new Sykkel(type, farge,pris);
            sykler[loper] = ny;
            loper++;
        }
    }
}
