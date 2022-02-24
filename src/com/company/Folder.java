package com.company;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Composant{

    public List<Composant> items = new ArrayList<> ();

    public Folder(String nom) {
        super (nom);
    }



    public Composant ajouterElement(Composant c){
        c.level = this.level + 1;
        items.add(c);
        return c;
    }
    @Override
    public void afficher() {
        String tab = indentation ();
        System.out.println (tab +"Folder: "+nom);

        for (Composant c:items)
        {
            c.afficher ();


        }

    }
}
