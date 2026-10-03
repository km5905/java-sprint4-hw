import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        Director directorFokin = new Director("Михаил", "Фокин", Gender.MALE, 70);
        Director directorPokrovsky = new Director("Борис", "Покровский", Gender.MALE, 180);

        Actor actorPavlova = new Actor("Анна", "Павлова", Gender.FEMALE, 157);
        Actor actorShalyapin = new Actor("Федор", "Шаляпин", Gender.MALE, 195);
        Actor actorBezrukov = new Actor("Сергей", "Безруков", Gender.MALE, 173);

        MusicAuthor composerChaykovskiy = new MusicAuthor("Петр", "Чайковский", Gender.MALE, 220);
        Choreographer choreographerPetipa = new Choreographer("Мариус", "Петипа", Gender.MALE, 80);

        String librettoTextBallet = """
        Краткое содержание по актам:
        • Действие I (Праздник в парке)
        • Действие II (Волшебное озеро)
        • Действие III (Бал во дворце)
        • Действие IV (Финал у озера)""";

        String librettoTextOpera = """
        Структура оперы:
        • Пролог: Народное бедствие и призыв к защите Родины.
        • Часть первая («Мир», картины 1–7)
        • Часть вторая («Война», картины 8–13)""";

        Show show = new Show("Есенин", 90, directorFokin, new ArrayList<>());
        Opera opera = new Opera("Война и мир", 120, directorPokrovsky, new ArrayList<>(), composerChaykovskiy, librettoTextOpera, 30);
        Ballet ballet = new Ballet("Лебединое озеро", 120, directorFokin, new ArrayList<>(), composerChaykovskiy, librettoTextBallet, choreographerPetipa);

        show.addNewActor(actorPavlova);
        opera.addNewActor(actorShalyapin);
        ballet.addNewActor(actorPavlova);
        ballet.addNewActor(actorBezrukov);

        show.infoActors();
        opera.infoActors();
        ballet.infoActors();

        show.changeOfCast(actorBezrukov, actorPavlova.getSurname());
        show.infoActors();

        opera.changeOfCast(actorBezrukov, "Паваротти");

        opera.printLibrettoText();
        ballet.printLibrettoText();
    }
}

