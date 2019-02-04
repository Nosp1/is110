

/**
 * Versjon null, pre modul 4
 *
 * @author evenal
 */
public class SykkelButikk
{
    private Sykkel s1;
    private Sykkel s2;
    private Sykkel s3;
    private Sykkel s4;
    private Sykkel s5;

    public void nySykkel(Sykkel s) {
        if (s1 == null)
            s1 = s;
        else if (s2 == null)
            s2 = s;
        else if (s3 == null)
            s3 = s;
        else if (s4 == null)
            s4 = s;
        else if (s5 == null)
            s5 = s;
        else {
            // fullt
        }
    }

    public void selgSykkel(Sykkel s) {
        if (s1.equals(s))
            s1 = null;
        if (s2.equals(s))
            s2 = null;
        if (s3.equals(s))
            s3 = null;
        if (s4.equals(s))
            s4 = null;
        if (s5.equals(s))
            s5 = null;
    }

    public void skrivSykler() {
        if (s1 != null)
            s1.skrivUt();
        if (s2 != null)
            s2.skrivUt();
        if (s3 != null)
            s3.skrivUt();
        if (s4 != null)
            s4.skrivUt();
        if (s5 != null)
            s5.skrivUt();
    }

}
