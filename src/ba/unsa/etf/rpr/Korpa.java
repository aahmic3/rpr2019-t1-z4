package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] korpa=new Artikl[50];
    public boolean dodajArtikl(Artikl art)
    {
        for(int i=0; i<50; i++)
        {
            if(a[i]==null)
            {
                a[i]=art;
                return true;
            }
        }
        return false;
    }
    public void izbaciArtiklSaKodom(String kod) {
        Artikl pomocniartikl;
        for (int i = 0; i < 50; i++) {
            if (korpa[i].getKod() == kod) {
                while (korpa[i] != null) {
                    korpa[i] = korpa[i + 1];
                    i++;
                }
            }
        }
    }
}
