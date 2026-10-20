public class Opera extends  MusicalShow {
    private  int choirSize;

    public Opera(String title, int duration, Director director, Person musicAutor,
                 String librettoText, int choirSize) {
        super(title, duration, director, musicAutor, librettoText);
        this.choirSize = choirSize;
    }
}
