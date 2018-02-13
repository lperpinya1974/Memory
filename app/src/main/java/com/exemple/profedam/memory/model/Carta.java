package com.exemple.profedam.memory.model;

import android.util.Log;

import com.exemple.profedam.memory.R;

/**
 * Created by ALUMNEDAM on 29/01/2016.
 */
public class Carta {

    public enum Estat {BACK, FRONT, FIXED}

    private final int backImage = R.drawable.back;
    private int frontImage;
    private Estat estat;

    public Carta(int frontImage) {
        this.frontImage = frontImage;
        this.estat = Estat.BACK;
    }

    public int getFrontImage() {
        return frontImage;
    }

    public int getImage() {

        int image = 0;
        switch(estat) {
            case BACK:
                image = backImage;
                break;
            case FRONT:
                image = frontImage;
                break;
            case FIXED:
                image = frontImage;
                break;

        }

        return image;


    }

    public void girar()
    {
        //TODO cal fer millor
        this.estat = Estat.FRONT;
    }
}
