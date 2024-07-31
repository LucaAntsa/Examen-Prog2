package Musique;

import java.util.ArrayList;

public class User extends Chansons {
    ArrayList<String>  playlist = new ArrayList<>();

    public User(int id, String titre, int durée, String genre) {
        super(id, titre, durée, genre);
    }
}
