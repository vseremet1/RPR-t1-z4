package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {

    @Test
    void main() {
        etf.unsa.ba.Predmet p=new etf.unsa.ba.Predmet(20, "lag", 1);
        etf.unsa.ba.Student s=new etf.unsa.ba.Student("mujo", "mujic", 2000);
        etf.unsa.ba.Student s2=new etf.unsa.ba.Student("haso", "hasic", 2002);

     //  assertEquals("haso", (p.ispisi(s2)).toString());
    }
}