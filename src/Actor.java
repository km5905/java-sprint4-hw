import java.util.Objects;

public class Actor extends Person {
    private int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Actor otherActor = (Actor) o;
        return Objects.equals(getName(), otherActor.getName()) &&
                Objects.equals(getSurname(), otherActor.getSurname()) &&
                Objects.equals(getGender(), otherActor.getGender()) &&
                (height == otherActor.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), height);
    }


    @Override
    public String toString() {
        return getName() + " " + getSurname() + " (" + height + " см.)";
    }
}
