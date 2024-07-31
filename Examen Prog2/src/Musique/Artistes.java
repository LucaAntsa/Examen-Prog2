package Musique;

public class Artistes extends GroupeArtistes {
    protected String Chanson;
    protected String GenreDeMusique;
    protected String Album;

    public Artistes(int id, String scène, int annéeDebut, String nationalité, String chanson, String genreDeMusique, String album) {
        super(id, scène, annéeDebut, nationalité);
        Chanson = chanson;
        GenreDeMusique = genreDeMusique;
        Album = album;
    }

    public Artistes(int id, String scène, int annéeDebut, String nationalité) {
        super(id, scène, annéeDebut, nationalité);
    }
}
