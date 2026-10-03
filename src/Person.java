public class Person {
    private String name;
    private String surname;
    private Gender gender;
    private int height;

    public Person(String name, String surname, Gender gender, int height) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public Gender getGender() {
        return gender;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }
}
