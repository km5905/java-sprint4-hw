public class Director extends Person {
    private int numberOfShows;

    public Director(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender, 0);
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname();
    }
}
