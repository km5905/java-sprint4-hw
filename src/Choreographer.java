public class Choreographer extends Person {
    private int numberOfDanceProductions;

    public Choreographer(String name, String surname, Gender gender, int numberOfCompositions) {
        super(name, surname, gender, 0);
        this.numberOfDanceProductions = numberOfCompositions;
    }
}
