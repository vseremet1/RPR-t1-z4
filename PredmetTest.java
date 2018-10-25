package etf.unsa.ba;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredmetTest {

    @Test
    void getNaziv() {
        etf.unsa.ba.Predmet p = new etf.unsa.ba.Predmet(150, "RPR", 123);
        assertEquals("RPR", p.getNaziv());
     }

    @Test
    void getSifra() {
        etf.unsa.ba.Predmet p = new etf.unsa.ba.Predmet(150, "RPR", 123);
        assertEquals(123, p.getSifra());
    }


    @Test
    void getKapacitet() {
        etf.unsa.ba.Predmet p = new etf.unsa.ba.Predmet(150, "RPR", 123);
        assertEquals(150, p.getKapacitet());
    }



}