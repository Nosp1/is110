

/**
 *
 * @author evenal
 */
public class Sykkel
{
    private String modell;
    private String farge;
    private int pris;

    public Sykkel(String modell, String farge, int pris) {
        this.modell = modell;
        this.farge = farge;
        this.pris = pris;
    }

    public String getModell() {
        return modell;
    }

    public String getFarge() {
        return farge;
    }

    public int getPris() {
        return pris;
    }

    public void skrivUt() {
        System.out.println(modell+" "+pris);
    }

}
