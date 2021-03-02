import java.util.ArrayList;

public class CollectionCreator {
    private ArrayList<CD> cdArrayList;
    private ArrayList<CD> movieArrayList;

    public ArrayList<Movie> getMovies() {
        Actor rufusSewell = new Actor("Rufus Sewell", 53, "The reason I am unemployed for six months out of every year is because I have to turn down most of the films I'm offered. If I didn't, I'd only ever play a dark, satanic count on a horse.");
        Actor williamHurt = new Actor("William Hurt", 70, "Nothing came fast for me. I had done sixty plays before I did a movie. I took it slow - I wanted it to be deep, didn't want it to be superficial so I slowed down instead of speeding up.");
        Actor kieferSutherland = new Actor("Kiefer Sutherland", 54, "If the acting thing hadn't worked out for me, I'd be laying phone cable in northern Ontario.");
        Actor jenniferConnelly = new Actor("Jennifer Connelly", 50, "Ultimately I'm an Irish Catholic Jew. I'm riddled with guilt!");

        Actor peterSellers = new Actor("Peter Sellers", 54, "Most actors want to play \"Othello\", but all I've really wanted to play is Chance the Gardener. I feel what the character, the story is all about is not merely the triumph of a simple man, an illiterate. It's God's message again that the meek shall inherit the earth.");
        Actor shirleyMacLaine = new Actor("Shirley MacLaine", 86, "It is useless to hold a person to anything he says while he's in love, drunk, or running for office.");
        Actor melvynDouglas = new Actor("Melvyn Douglas", 80, "The Hollywood roles I did were boring; I was soon fed up with them. It's true they gave me a worldwide reputation I could trade on, but they also typed me as a one-dimensional, non-serious actor.");

        Actor jeanMarais = new Actor("Jean Marais", 84, "What does marble think when it's being sculpted? It thinks, 'I am struck, insulted, ruined, lost.' Life is sculpting me. Let it finish its work. ");
        Actor francoisPerier = new Actor("Francois Perier", 82, "I am letting you into the secret of all secrets, mirrors are gates through which death comes and goes. Moreover if you see your whole life in a mirror you will see death at work as you see bees behind the glass in a hive.");
        Actor mariaCasares = new Actor("Maria Casares", 74, "My poor love, he exists nowhere. Some say he thinks of us. Others, that we are his thoughts. Others say he sleeps and that we are his dream - his bad dream. ");

        ArrayList<Actor> darkCityCast = new ArrayList<Actor>();
        darkCityCast.add(rufusSewell);
        darkCityCast.add(kieferSutherland);
        darkCityCast.add(williamHurt);
        darkCityCast.add(jenniferConnelly);

        ArrayList<Actor> beingThereCast = new ArrayList<Actor>();
        beingThereCast.add(peterSellers);
        beingThereCast.add(shirleyMacLaine);
        beingThereCast.add(melvynDouglas);

        ArrayList<Actor> orpheusCast = new ArrayList<Actor>();
        orpheusCast.add(jeanMarais);
        orpheusCast.add(francoisPerier);
        orpheusCast.add(mariaCasares);

        Movie darkCity = new Movie("Dark City", darkCityCast, 4);
        Movie beingThere = new Movie("Being There", beingThereCast, 5);
        Movie orpheus = new Movie("Orpheus", orpheusCast, 3);

        ArrayList<Movie> movieArrayList = new ArrayList<Movie>();
        movieArrayList.add(darkCity);
        movieArrayList.add(beingThere);
        movieArrayList.add(orpheus);
        return movieArrayList;
    }

    public ArrayList<CD> getCDs() {
        Musician jasonLytle = new Musician("Jason Lytle", 51, "Guitar & Vocals");
        Musician aaronBurtch = new Musician("Aaron Burtch", 52, "Drums");
        Musician jimFairchild = new Musician("Jim Fairchild", 47, "Guitar");
        Musician kevinGarcia = new Musician("Kevin Garcia", 41, "Bass Guitar");
        Musician timDryden = new Musician("Tim Dryden", 50, "Keyboard");

        Musician ameliaMeath = new Musician("Amelia Meath", 33, "Vocals");
        Musician nickSanborn = new Musician("Nick Sanborn", 36, "Bass Guitar & Turntables");

        Musician damonAlbarn = new Musician("Damon Albarn", 52, "Keyboard & Vocals");
        Musician jeffWootton = new Musician("Jeff Wootton", 33, "Guitar");
        Musician remiKabakaJr = new Musician("Remi Kabaka Jr", 50, "Percussion & Turntables");
        Musician mickJones = new Musician("Mick Jones", 65, "Guitar");
        Musician paulSimonon = new Musician("Paul Simonon", 65, "Bass Guitar");


        ArrayList<Musician> grandaddyBandMembers = new ArrayList<Musician>();
        grandaddyBandMembers.add(jasonLytle);
        grandaddyBandMembers.add(aaronBurtch);
        grandaddyBandMembers.add(kevinGarcia);
        grandaddyBandMembers.add(timDryden);
        grandaddyBandMembers.add(jimFairchild);

        ArrayList<Musician> sylvanEssoBandMembers = new ArrayList<Musician>();
        sylvanEssoBandMembers.add(ameliaMeath);
        sylvanEssoBandMembers.add(nickSanborn);

        ArrayList<Musician> gorillazBandMembers = new ArrayList<Musician>();
        gorillazBandMembers.add(damonAlbarn);
        gorillazBandMembers.add(remiKabakaJr);
        gorillazBandMembers.add(jeffWootton);
        gorillazBandMembers.add(mickJones);
        gorillazBandMembers.add(paulSimonon);

        CD theSophtwareSlump = new CD("The Sophtware Slump", "Grandaddy", grandaddyBandMembers, 5);
        CD sylvanEsso = new CD("Sylvan Esso", "Sylvan Esso", sylvanEssoBandMembers, 4);
        CD plasticBeach = new CD("Plastic Beach", "Gorillaz", gorillazBandMembers, 5);

        ArrayList<CD> cdArrayList = new ArrayList<CD>();
        cdArrayList.add(theSophtwareSlump);
        cdArrayList.add(sylvanEsso);
        cdArrayList.add(plasticBeach);
        return cdArrayList;
    }
}
