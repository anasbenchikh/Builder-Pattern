package com.company;

public abstract class Composant {


    protected String nom;
    protected int level;

    public Composant(String nom) {
        this.nom = nom;

    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }


    public abstract void afficher();

    public String indentation(){
        String str = "";
        for (int i = 0; i < level ; i++) {
            str += "\t";
        }
        return str;
    }




}
