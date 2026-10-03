import java.util.ArrayList;
import java.util.Objects;

public class Show {
    public String title;
    public int duration;
    public Director director;
    public ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void infoDirector() {
        System.out.println("Режиссёре спектакля - " + director.toString());
    }

    public void infoActors() {
        System.out.println("Актеры спектакля " + title + ":");
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
    }

    public void addNewActor(Actor newActor) {
        if(listOfActors.contains(newActor)) {
            System.out.println("Актер " + newActor.toString() +
                    " уже участвует в спектакле " + title);
        } else {
            listOfActors.add(newActor);
            System.out.println("Актер " + newActor.toString() +
                    " успешно добавлен в спектакль " + title);
        }
    }

    public void changeOfCast(Actor newActor, String surnameOldActor) {
        for (Actor actor : listOfActors) {
            if (Objects.equals(actor.getSurname(), surnameOldActor)) {
                listOfActors.remove(actor);
                listOfActors.add(newActor);

                System.out.println("Актер " + surnameOldActor  + " успешно заменен на актера " + newActor.getSurname() + " в спектакле " + title);
            } else {
                System.out.println("Актер " + surnameOldActor  + " отсутствует в спектакле " + title + ". Замена актеров невозможна.");
            }
        }
    }
}
