import java.util.ArrayList;
import java.util.Random;


public class Movie extends CollectibleItem  {
    private ArrayList<Actor> cast;


    public Movie(String title,ArrayList<Actor> cast, int rating)   {
        super(title,rating);
        this.cast = cast;
    }

    void getRating() {
        System.out.println(title + " received a rating of " + rating + " STARS!\n");
    }

    void randomQuote()   {
        Random r = new Random();
        int randomIndex = (int) r.nextInt(cast.size());
        Actor randomActor = cast.get(randomIndex);
        System.out.println(randomActor.name + " Quote: \n" + "'" + randomActor.getQuote(randomActor.quotableLine) + "'\n");
    }

    void listCast() {
        System.out.println("--------------------");
        System.out.println("Cast of " + title);
        System.out.println("--------------------");
        for (Actor cast : cast) {
            System.out.println(cast.name);
        }
        System.out.println("");
    }
}
