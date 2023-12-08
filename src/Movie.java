public class Movie {
    String name;
    int releaseYear;
    boolean includedInThePlan;
    double ratings;
    int totalRatings;
    int minutesLength;

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
