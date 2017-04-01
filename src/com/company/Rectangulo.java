package com.company;

/**
 * Created by carlosjoseanguiano on 31/03/17.
 */
public class Rectangulo {

    private int ladoVertical;
    private int ladoHorizontal;

    public Rectangulo(int lV, int lH) {
        this.ladoHorizontal = lH;
        this.ladoVertical = lV;
    }

    public int getLadoVertical() {
        return ladoVertical;
    }

    public void setLadoVertical(int ladoVertical) {
        this.ladoVertical = ladoVertical;
    }

    public int getLadoHorizontal() {
        return ladoHorizontal;
    }

    public void setLadoHorizontal(int ladoHorizontal) {
        this.ladoHorizontal = ladoHorizontal;
    }

    @Override
    public String toString() {

        return "Rectangulo{" + "ladoVertical=" + ladoVertical + ", ladoHorizontal=" + ladoHorizontal + '}';
    }
}
