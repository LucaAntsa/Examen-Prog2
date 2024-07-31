package Musique;

import java.util.Date;

public class Album extends Chansons{
    protected int id;
    protected String nom;
    protected Date DateDeSortie;

    public Album(int id, String titre, int durée, String genre, int id1, String nom, Date dateDeSortie) {
        super(id, titre, durée, genre);
        this.id = id1;
        this.nom = nom;
        DateDeSortie = dateDeSortie;
    }

    public Album(int id, String titre, int durée, String genre) {
        super(id, titre, durée, genre);
    }
}
