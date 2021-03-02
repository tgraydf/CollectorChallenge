import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CollectionCreator tristansCollection = new CollectionCreator();
        ArrayList<CD> tristansCDs = tristansCollection.getCDs();
        ArrayList<Movie> tristansMovies = tristansCollection.getMovies();

        for (CD cd : tristansCDs)   {
            cd.getRating();
            cd.listBandMembers();
        }

        for (Movie movie : tristansMovies)  {
            movie.getRating();
            movie.listCast();
            movie.randomQuote();
        }
    }
}
