import java.util.Objects;

public class Actor extends Person {

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender, height);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Actor otherActor = (Actor) o;
        return Objects.equals(getName(), otherActor.getName()) &&
                Objects.equals(getSurname(), otherActor.getSurname()) &&
                Objects.equals(getGender(), otherActor.getGender()) &&
                (getHeight() == otherActor.getHeight());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getHeight());
    }


    @Override
    public String toString() {
        return getName() + " " + getSurname() + " (" + getHeight() + " см.)";
    }
}
