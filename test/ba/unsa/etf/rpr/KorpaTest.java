package ba.unsa.etf.rpr;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class KorpaTest {

    @Test
    void dodajArtikl() {
        Artikl artikl1=new Artikl("auto",10000, "1");
        Korpa korpa=new Korpa();
        assertTrue(korpa.dodajArtikl(artikl1));
    }
    @Test
    void izbaciArtiklSaKodom() {
        Artikl artkl1=new Artikl("auto", 10000, "1");
        Artikl artikl2=new Artikl("biciklo", 1000, "2");
        Korpa korpa=new Korpa();
        korpa.dodajArtikl(artkl1);
        korpa.dodajArtikl(artikl2);
        Artikl artiklZaProvjeru= korpa.izbaciArtiklSaKodom("2");
        assertTrue(artiklZaProvjeru.equals(artikl2));
    }
    @Test
    void dajUkupnuCijenuArtikala() {
        Artikl artkl1=new Artikl("auto", 10000, "1");
        Artikl artikl2=new Artikl("biciklo", 1000, "2");
        Korpa korpa=new Korpa();
        korpa.dodajArtikl(artkl1);
        korpa.dodajArtikl(artikl2);
        int ukupnaCijena=korpa.dajUkupnuCijenuArtikala();
        assertEquals(11000,ukupnaCijena);

    }
}