import java.util.ArrayList;

public class CD extends CollectibleItem  {
    private ArrayList<Musician> bandMembers;
    private String band;


    public CD(String title,String band,ArrayList<Musician> bandMembers, int rating)   {
        super(title,rating);
        this.bandMembers = bandMembers;
        this.band = band;
    }

    void getRating() {
        System.out.println(title + " by " + band + " received " + rating + " Thumbs up!");

    }

    void listBandMembers() {
        System.out.println("--------------------");
        System.out.println("Members of " + band);
        System.out.println("--------------------");
        for (Musician bandMembers : bandMembers) {
            System.out.println("Name: " + bandMembers.name + ", Instrument(s): " + bandMembers.instrument);
        }
        System.out.println("");
    }

}
