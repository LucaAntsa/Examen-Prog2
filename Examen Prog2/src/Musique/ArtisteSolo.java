package Musique;

public class ArtisteSolo extends Artistes {
    protected String nom;
    protected String prenom;
    protected int DateDeNaissance;

    public ArtisteSolo(int id, String scène, int annéeDebut, String nationalité, String chanson, String genreDeMusique, String album, String nom, String prenom, int dateDeNaissance) {
        super(id, scène, annéeDebut, nationalité, chanson, genreDeMusique, album);
        this.nom = nom;
        this.prenom = prenom;
        DateDeNaissance = dateDeNaissance;
    }

    public ArtisteSolo(int id, String scène, int annéeDebut, String nationalité, String nom, String prenom, int dateDeNaissance) {
        super(id, scène, annéeDebut, nationalité);
        this.nom = nom;
        this.prenom = prenom;
        DateDeNaissance = dateDeNaissance;
    }

    public ArtisteSolo(int id, String scène, int annéeDebut, String nationalité, String chanson, String genreDeMusique, String album) {
        super(id, scène, annéeDebut, nationalité, chanson, genreDeMusique, album);
    }

    public ArtisteSolo(int id, String scène, int annéeDebut, String nationalité) {
        super(id, scène, annéeDebut, nationalité);
    }
}
