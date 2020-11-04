package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] korpa = new Artikl[50];
    public boolean dodajArtikl(Artikl artikl) {
        for (int i = 0; i < 50; i++) {
            if (korpa[i] == null) {
                korpa[i] = artikl;
                return true;
            }
        }
        return false;
    }
    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl pomocniartikl=null;
        for (int i = 0; i < 50; i++) {
            if (korpa[i].getKod().equals(kod)) {
               pomocniartikl=korpa[i];
               korpa[i]=null;
               break;
            }
        }
        return pomocniartikl;
    }
    public Artikl[] getArtikli() {
        return korpa;
    }
    public void ispisArtikala(Artikl[] artikli) {
        for (int i = 0; i < 50; i++) {
            if (artikli[i] != null) {
                artikli[i].ispisiArtikal();
            }
        }
    }
    public int dajUkupnuCijenuArtikala() {
        int cijena = 0;
        for (int i = 0; i < 50; i++)
        {
            if(korpa[i] != null)
                cijena+=korpa[i].getCijena();
        }
        return cijena;
    }
}
