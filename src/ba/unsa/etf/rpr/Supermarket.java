package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] artiklisupermarketa=new Artikl[1000];

    public boolean dodajArtikl(Artikl artikl)
    {
        for(int i=0; i<50; i++)
        {
            if(artiklisupermarketa[i]==null)
            {
                artiklisupermarketa[i]=artikl;
                return true;
            }
        }
            return false;
    }

}



