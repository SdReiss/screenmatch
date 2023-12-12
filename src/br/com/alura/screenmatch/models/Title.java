package br.com.alura.screenmatch.models;

public class Title {
    private String name;
    private int releaseYear;
    private boolean includedInThePlan;
    private double ratings;
    private int totalRatings;
    private int minutesLength;

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public boolean isIncludedInThePlan() {
        return includedInThePlan;
    }

    public int getMinutesLength() {
        return minutesLength;
    }

    public int getTotalRatings() {
        return totalRatings;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setMinutesLength(int minutesLength) {
        this.minutesLength = minutesLength;
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Release Year: " + releaseYear);
    }

    public void rate(double score) {
        ratings += score;
        totalRatings++;
    }

    public double getAverageRating() {
        return ratings/totalRatings;
    }
}
