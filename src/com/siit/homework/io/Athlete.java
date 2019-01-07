package com.siit.homework.io;

public class Athlete {

    private int id;
    private String name;
    private String country;
    private String skiingTime;
    private String firstRoundShooting;
    private String secondRoundShooting;
    private String thirdRoundShooting;
    private int totalTime;
    private int penaltyTime;

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", totalTime=" + (totalTime / 60) + ":" + (totalTime % 60) +
                ", skiingTime=" + skiingTime +
                ", penaltyTime=" + penaltyTime +
                '}';
    }

    public Athlete(int id, String name, String country, String skiingTime, String firstShootResult, String secondShootResult, String thirdShootResult) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.skiingTime = skiingTime;
        this.firstRoundShooting = firstShootResult;
        this.secondRoundShooting = secondShootResult;
        this.thirdRoundShooting = thirdShootResult;
        calculateTotalTime();
    }


    public int getTotalTime() {
        return totalTime;
    }

    public String getCountry() {
        return country;
    }

    public String getFirstRoundShooting() {
        return firstRoundShooting;
    }

    public void calculateTotalTime() {

        String[] tokens = skiingTime.split(":");
        int minutes = Integer.parseInt(tokens[0]);
        int seconds = Integer.parseInt(tokens[1]);

        String shootResults = firstRoundShooting + secondRoundShooting + thirdRoundShooting;

        for (int j = 0; j < shootResults.length(); j++) {
            if (shootResults.charAt(j) == 'O') {
                penaltyTime += 10;
            }
        }
        totalTime = minutes * 60 + seconds + penaltyTime;
    }

    public boolean checkSkiTime() {
        String[] tokens = skiingTime.split(":");
        int minutes = Integer.parseInt(tokens[0]);
        int seconds = Integer.parseInt(tokens[1]);
        int skitime = minutes * 60 + seconds;

        if (skitime <= 0) {
            return false;
        }

        return true;
    }
}
