public class MusicalShow extends Show {
    private  Person musicAutor;
    private  String librettoText;

    public MusicalShow(String title, int duration, Director director,
                       Person musicAutor, String librettoText) {
        super(title, duration, director);
        this.musicAutor = musicAutor;
        this.librettoText = librettoText;
    }

    public void printLibretto() {
        System.out.println(librettoText);
    }
}
