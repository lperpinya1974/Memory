package com.exemple.profedam.memory.model;

import com.exemple.profedam.memory.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by ALUMNEDAM on 29/01/2016.
 */
public class Partida {

    int totalCartes[] = {
            R.drawable.c0, R.drawable.c1,
            R.drawable.c2, R.drawable.c3,
            R.drawable.c4, R.drawable.c5,
            R.drawable.c6, R.drawable.c7,
            R.drawable.c8, R.drawable.c9,
            R.drawable.c10, R.drawable.c11
    };
    ArrayList<Carta> llistaCartes;
    int numeroCartes;


    public Partida(ArrayList<Carta> llistaCartes, int numeroCartes) {
        this.llistaCartes = llistaCartes;
        this.numeroCartes = numeroCartes;
    }

    public Partida(int numeroCartes) {
        this.numeroCartes = numeroCartes;

        for (int cont = 0; cont<=2; cont++) {
        for (int cont1= 0; cont1<=numeroCartes/2; cont1++)
        {
            llistaCartes.add(new Carta(totalCartes[cont1]));

        }

        //TODO rellenar llistaCartes

        }


    public ArrayList getLlistaCartes()     {
            return llistaCartes;
        }

    public int getNumeroCartes() {
        return numeroCartes;
    }
}
