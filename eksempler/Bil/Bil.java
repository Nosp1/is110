
/**
 * Write a description of class Bil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bil implements BilIf
{
   private boolean igang; 
   private int retning;

    /**
     * Constructor for objects of class Bil
     */
    public Bil()
    {
       igang=false; 
       retning = 0;     // - er venstre, + er høyre
    }

    public void start()
    {
        igang=true;
    }
   
    public boolean igang()
    {
        return igang;
    }
    
    public void sving(int endreRetning) // endreRetning kan være + eller -
    {
        retning = retning +endreRetning;
    }
}
