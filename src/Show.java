
import java.util.ArrayList;

public class Show {
    private  String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void printDirector() {
        System.out.println(director);
    }

    public void  printActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Такой актёр уже есть!");
        } else {
            listOfActors.add(actor);
        }
    }

    public  void replaceActor(Actor newactor, String lastname) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getLastName().equals(lastname)) {
                listOfActors.set(i, newactor);
                return;
            }
            System.out.println("Такой актёр не найден!");
            return;

        }
    }



}
