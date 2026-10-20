public class Ballet extends  MusicalShow {
    private Person choreographer;

    public Ballet(String title, int duration, Director director, Person musicAutor,
                  String librettoText, Person choreographer) {
        super(title, duration, director, musicAutor, librettoText);
        this.choreographer = choreographer;
    }
}
