package com.company;

import etf.unsa.ba.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getIme() {
        etf.unsa.ba.Student s = new Student("ABC", "DEF", 1234);
        assertEquals("ABC", s.getIme());
    }

    @Test
    void getPrezime() {
        etf.unsa.ba.Student s = new Student("ABC", "DEF", 1234);
        assertEquals("DEF", s.getPrezime());
    }

    @Test
    void getIndeks() {
        etf.unsa.ba.Student s = new Student("ABC", "DEF", 1234);
        assertEquals(1234, s.getIndeks());
    }

}