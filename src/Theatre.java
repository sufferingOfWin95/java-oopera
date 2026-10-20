public class Theatre {

    public static void main(String[] args) {

        Actor actor1 = new Actor("Иван", "Ладыгин", Gender.MALE, 187);
        Actor actor2 = new Actor("Георгий", "Бананов", Gender.MALE, 169);
        Actor actor3 = new Actor("Евгения", "Карцева", Gender.FEMALE, 174);
        Director director1 = new Director("Борис", "Весёлый", Gender.MALE, 2);
        Director director2 = new Director("Эрен", "Егер", Gender.MALE, 1);
        Person composer = new Person("Марина", "Добрая", Gender.FEMALE);
        Person choreographer = new Person("Анна", "Забывчевая", Gender.FEMALE);
        Show show = new Show("Ночное такси", 150, director1);
        Opera opera = new Opera("Тень над Тростом", 180, director2, composer,
                "Город засыпает, и на площади появляется незнакомец, "
                        + "которого никто не помнит. Хор рассказывает его историю.", 40);
        Ballet ballet = new Ballet("Дверь которую так хочется открыть", 130, director1, composer,
                "Первый снег превращает старый парк в сказочный лес, "
                        + "где оживают статуи и танцуют снежинки.", choreographer);

        show.addActor(actor1);
        show.addActor(actor2);
        opera.addActor(actor1);
        opera.addActor(actor3);
        ballet.addActor(actor2);
        ballet.addActor(actor3);

        Actor duplicate = new Actor("Иван", "Ладыгин", Gender.MALE, 187);
        show.addActor(duplicate); // проверка на добавление дубликата

        System.out.println("Актёры спектакля «Ночной визит»:");
        show.printActors();
        System.out.println("Актёры оперы «Тень над городом»:");
        opera.printActors();
        System.out.println("Актёры балета «Зимняя сказка»:");
        ballet.printActors();

        show.replaceActor(actor3, "Ладыгин");
        System.out.println("«Ночной визит» после замены:");
        show.printActors();

        show.replaceActor(actor1, "Несуществующий"); // проверка замены на несуществующего актёра

        System.out.println("Либретто оперы:");
        opera.printLibretto();
        System.out.println("Либретто балета:");
        ballet.printLibretto();

    }
}
