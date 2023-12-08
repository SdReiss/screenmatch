public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.name = "Guardians of the Galaxy";
        myMovie.releaseYear = 2013;
        myMovie.minutesLength = 180;

        myMovie.showDetails();
        myMovie.rate(8);
        myMovie.rate(5);
        myMovie.rate(10);
        System.out.println(myMovie.ratings);
        System.out.println(myMovie.totalRatings);
        System.out.println(myMovie.getAverageRating());
    }
}
