package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] artiklisupermarketa=new Artikl[1000];

    public boolean dodajArtikl(Artikl artikl)
    {
        for(int i=0; i<10000; i++)
        {
            if(artiklisupermarketa[i]==null)
            {
                artiklisupermarketa[i]=artikl;
                return true;
            }
        }
            return false;
    }
    public Artikl[] getArtikli()
    {
        return artiklisupermarketa;
    }
    public void  ispisArtikala() {
        for (int i = 0; i < 1000; i++)
        {
            if(artiklisupermarketa[i]!=null) {
                artiklisupermarketa[i].ispisiArtikal();
            }
        }
    }
    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl pomocniartikl;
        for (int i = 0; i < 50; i++) {
            if (artiklisupermarketa[i].getKod() == kod) {
                while (artiklisupermarketa[i] != null) {
                    artiklisupermarketa[i] = artiklisupermarketa[i + 1];
                    i++;
                }
            }
        }
        return artiklisupermarketa[0];
    }

}



