package Musique;

public class GroupeArtistes {
    protected int id;
    protected  String Scène;
    protected int annéeDebut;
    protected String Nationalité;

    public GroupeArtistes(int id, String scène, int annéeDebut, String nationalité) {
        this.id = id;
        Scène = scène;
        this.annéeDebut = annéeDebut;
        Nationalité = nationalité;
    }
}
