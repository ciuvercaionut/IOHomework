package com.siit.homework.io;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AthleteTest {

    @Test
    public void getCountry() {
        Athlete ionut = new Athlete(10, "Ionut", "RO", "30:00", "OOOOO", "XOXXO", "XXXOX");
        assertEquals(ionut.getCountry(), "RO");
    }

    @Test
    public void validateSkiingTime() {
        Athlete ionut = new Athlete(10, "Ionut", "RO", "10:00", "OOOOO", "XOXXO", "XXXOX");
        assertEquals(ionut.checkSkiTime(), true);
    }

    @Test

    public void getTotalTime() {
        Athlete ionut = new Athlete(10, "Ionut", "RO", "2:00", "OOOOO", "XOXXO", "XXXOX");
        assertEquals(ionut.getTotalTime(), 200);
    }

    @Test
    public void getFirstRoundShooting() {
        Athlete ionut = new Athlete(10, "Ionut", "RO", "30:00", "OOOOO", "XOXXO", "XXXOX");
        assertEquals(ionut.getFirstRoundShooting(), "OOOOO");
    }

}
