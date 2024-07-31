package Musique;

public class Chansons {
    protected int id;
    protected String titre;
    protected  int Durée;
    protected String genre;

    public Chansons(int id, String titre, int durée, String genre) {
        this.id = id;
        this.titre = titre;
        Durée = durée;
        this.genre = genre;
    }
}
