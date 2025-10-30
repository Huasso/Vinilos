public class Vinilos {

    private String artista;
    private String album;
    private int año;

    public Vinilos(String artista, String album, int año){
        this.artista = artista;
        this.album = album;
        this.año = año;
    }
    //Getters
    public String getartista() {
        return artista;
    }
    public String getalbum() {
        return album;
    }
    public int getaño() {
        return año;
    }
    @Override
    public String toString() {
        return "Vinilo{" + "artista='" + artista + '\'' + ", album='" + album + '\'' + ", año=" + año + '}';
    }

}
