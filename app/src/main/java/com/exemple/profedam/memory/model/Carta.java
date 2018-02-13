package com.exemple.profedam.memory.model;

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

        //TODO cal tornar la frontImage o la BackImage de la carta segons pertoqui
        return 0;
    }
}
