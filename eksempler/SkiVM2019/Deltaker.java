
/**
 * Skal representere en deltaker i ett renn
 *
 * @author Hallgeir
 * @version 2019
 */
public class Deltaker
{
    private Person person;
    private int start; 
    private int slutt; 
    
    /**
     * Constructor for objects of class Deltaker
     */
    public Deltaker(Person person)
    {
        this.person = person; 
    }

    public void setStart(int start)
    {
        this.start = start;
    }
    
    public void setSlutt(int slutt)
    {
        this.slutt = slutt;
    }
    
    public int getStart()
    {
        return start;
    }
    
    public int getSlutt()
    {
        return slutt;
    }
    
    public int findTime()
    {
        int timeUsed = 1 + slutt - start ; 
        return timeUsed;
    }
    
    public void skriv()
    {
        person.skriv();
        System.out.println("Start : " +start + "Sluttid : " +slutt + "Tid : " +findTime());
    }
    
    
}
