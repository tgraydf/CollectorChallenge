public class Actor extends Person  {
    String quotableLine;


    public Actor(String name, int age, String quotableLine) {
        super(name,age);
        this.quotableLine = quotableLine;
    }

    public String getQuote(String quotableLine)  {
        return this.quotableLine;
    }
}