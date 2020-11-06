package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void dodajArtikl() {
        Artikl artikl1=new Artikl("auto",10000, "1");
        Supermarket market=new Supermarket();
        assertTrue(market.dodajArtikl(artikl1));
    }
    @Test
    void getArtikli() {
        Supermarket market=new Supermarket();
        Artikl artikl1=new Artikl("auto",10000, "1");
        Artikl artikl2=new Artikl("Laptop", 3000, "2");
        market.dodajArtikl(artikl1);
        market.dodajArtikl(artikl2);
        Artikl[] pomocniMarket=new Artikl[1000];
        pomocniMarket[0]=artikl1;
        pomocniMarket[1]=artikl2;
        assertArrayEquals(pomocniMarket, market.getArtikli());
    }

    @Test
    void izbaciArtiklSaKodom() {
        Artikl artikl1=new Artikl("auto",10000, "1");
        Artikl artikl2=new Artikl("Laptop", 3000, "2");
        Supermarket market=new Supermarket();
        market.dodajArtikl(artikl1);
        market.dodajArtikl(artikl2);
        Artikl artiklZaProvjeru= market.izbaciArtiklSaKodom("2");
        assertTrue(artiklZaProvjeru.equals(artikl2));
    }
}