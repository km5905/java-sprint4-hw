public class MusicAuthor extends Person {
    private int numberOfCompositions;

    public MusicAuthor(String name, String surname, Gender gender, int numberOfCompositions) {
        super(name, surname, gender, 0);
        this.numberOfCompositions = numberOfCompositions;
    }
}
