package com.siit.homework.io;

import com.sun.deploy.util.StringUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class Podium {

    private Set<Athlete> athletes = new TreeSet<>(new TimeComparator());

    public Set<Athlete> getAthletes() {
        return athletes;
    }

    public void readAthletes() {

        File f = new File("./resources/results.csv");
        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            String line;
            String[] tokens;

            int lineCounter = 1;
            while ((line = br.readLine()) != null) {
                tokens = StringUtils.splitString(line, ",");
                if (tokens.length != 7) {
                    System.err.println("cvs file not correct" + lineCounter);
                    break;
                }
                athletes.add(new Athlete(Integer.parseInt(tokens[0]), tokens[1], tokens[2], tokens[3], tokens[4], tokens[5], tokens[6]));
            }
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
    }

    public void showResults() {

        System.out.println("Results: ");
        int i = 1;
        for (Athlete athlete : athletes) {
            System.out.println("Standings " + i + " " + athlete);
            i++;
        }
    }
}
