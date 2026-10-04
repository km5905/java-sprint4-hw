import java.util.ArrayList;
import java.util.Objects;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void infoDirector() {
        System.out.println("Режиссёре спектакля - " + director.toString());
    }

    public void infoActors() {
        System.out.println("Актеры спектакля " + title + ":");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
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
        Actor actorToReplace = null;
        int count = 0;

        for (Actor actor : listOfActors) {
            if (Objects.equals(actor.getSurname(), surnameOldActor)) {
                count++;
                actorToReplace = actor;
            }
        }

        if (count == 0) {
            System.out.println("Актер " + surnameOldActor + " отсутствует в спектакле " + title + ". Замена невозможна.");
        } else if (count > 1) {
            System.out.println("Найдено " + count + " актеров с фамилией " + surnameOldActor +
                    ". Замена невозможна: неясно, кого именно нужно заменить.");
        } else {
            listOfActors.remove(actorToReplace);
            listOfActors.add(newActor);
            System.out.println("Актер " + surnameOldActor + " успешно заменен на актера " + newActor.getSurname() +
                    " в спектакле " + title);
        }
    }
}
