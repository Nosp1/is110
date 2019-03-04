
/**
 * Deltaker representerer en deltaker i ski-VM 2019
 *
 * @author Hallgeir
 * @version 2019
 */
public class Person
{
    private String forNavn;
    private String etterNavn;
    private char kjonn;
    private int alder;
    private String nasjonalitet;
    
    

    /**
     * Constructor for objects of class Person
     */
    public Person(String forNavn,String etterNavn)
    {
        this.forNavn=forNavn; 
        this.etterNavn = etterNavn;
    }

    /**
     */
    public void setKjonn(char kjonn)
    {
        this.kjonn = kjonn;
    }
    
    public void setAlder(int alder)
    {
        this.alder = alder;
    }
    
    public void setNasjonalitet(String nasjonalitet)
    {
        this.nasjonalitet = nasjonalitet;
    }
    
    public char getKjonn()
    {
        return kjonn;
    }
    
    public int getAlder()
    {
        return alder;
    }
    
    public String getNasjonalitet()
    {
        return nasjonalitet;
    }
    
    public void skriv()
    {
        System.out.println(forNavn + " ; " + etterNavn);
    }
    
    public String getForNavn()
    {
        return forNavn;
        
        
        /* Testutskrift
         * 
         * x|
         * 
         */
        
        
        
        /* Slutt testutskrift
         * 
         */
    }
    
    public String getEtterNavn()
    {
        return etterNavn;
    }
    
        
}
