public class Musician extends Person  {
    String instrument;


    public Musician(String name, int age, String instrument) {
        super(name,age);
        this.instrument = instrument;
    }

    public String getInstrument(String instrument)  {
        return this.instrument;
    }
}