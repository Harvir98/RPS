package com.nology;

public class Players {

    private String name;
    private int wins = 0;
    private int score = 0;

    public Players(String name) {
        this.name = name;
    }

    public Players(String name, int wins, int score) {
        this.name = name;
        this.wins = wins;
        this.score = score;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
