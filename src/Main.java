import br.com.alura.screenmatch.math.TimeCalculator;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Series;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("Guardians of the Galaxy");
        myMovie.setReleaseYear(2013);
        myMovie.setMinutesLength(180);
        System.out.println("Movie Length: " + myMovie.getMinutesLength());

        myMovie.showDetails();
        myMovie.rate(8);
        myMovie.rate(5);
        myMovie.rate(10);
        System.out.println("Total ratings: " + myMovie.getTotalRatings());
        System.out.println(myMovie.getAverageRating());

        Series lost = new Series();
        lost.setName("Lost");
        lost.setReleaseYear(2000);
        lost.showDetails();
        lost.setSeasons(10);
        lost.setEpisodesPerSeason(10);
        lost.setMinutesPerEpisode(50);
        System.out.println("Series Length: " + lost.getMinutesLength());

        TimeCalculator calculator = new TimeCalculator();

        Movie otherMovie = new Movie();
        otherMovie.setName("Alice in Wonderland");
        otherMovie.setReleaseYear(2011);
        otherMovie.setMinutesLength(176);

        calculator.include(myMovie);
        calculator.include(otherMovie);
        calculator.include(lost);

        System.out.println("Total Length: " + calculator.getTotalTime());
    }
}
