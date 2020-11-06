package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ArtiklTest {

    @Test
    void getNaziv() {
        Artikl artikl=new Artikl("Sladoled", 3, "1");
        String stringZaProvjeru="Sladoled";
        assertTrue(stringZaProvjeru.equals(artikl.getNaziv()));
    }
    @Test
    void getCijena() {
        Artikl artikl=new Artikl("Sladoled", 3, "1");
        int intZaProvjeru=3;
        assertEquals(intZaProvjeru, artikl.getCijena());
    }
    @Test
    void getKod() {
        Artikl artikl=new Artikl("Sladoled", 3, "1");
        String stringZaProvjeru="1";
        assertTrue(stringZaProvjeru.equals(artikl.getKod()));
    }
}