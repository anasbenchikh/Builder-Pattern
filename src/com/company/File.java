package com.company;

import java.util.ArrayList;
import java.util.List;

public class File extends Composant {






    public File(String nom) {
        super (nom);
    }

    @Override
    public void afficher() {

        String tab = indentation ();
        System.out.println (tab+"File :"+ nom );

    }


    //Ajout d'un element


}
