public class Movie {
    String name;
    int releaseYear;
    boolean includedInThePlan;
    private double ratings;
    private int totalRatings;
    int minutesLength;

    int getTotalRatings() {
        return totalRatings;
    }

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Release Year: " + releaseYear);
    }

    void rate(double score) {
        ratings += score;
        totalRatings++;
    }

    double getAverageRating() {
        return ratings/totalRatings;
    }
}
