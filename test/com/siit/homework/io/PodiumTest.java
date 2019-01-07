package com.siit.homework.io;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PodiumTest {

    Podium podium = new Podium();

    @Before
    public void setPodium() {
        podium.readAthletes();
    }

    @Test
    public void getAthleteTest() {
        assertEquals(podium.getAthletes().toString().contains("Bjoerdalen"), true);
    }

}
