package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Folder f = new Folder ("root");
        Folder fo = new Folder ("structure");
        Folder fol = new Folder ("comportement");
        Folder fold = new Folder ("creation");
        File fi = new File ("decorator");
        File v = new File("apprendre java ");

        f.ajouterElement (fo);
        f.ajouterElement (fol);
        f.ajouterElement (fold);
        fo.ajouterElement (fi);
        fo.ajouterElement (v);
        fold.ajouterElement (new File ("notes.pdf"));
        f.afficher ();



    }
}
