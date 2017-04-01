package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        StringBuffer f = new StringBuffer();
        Rectangulo rectangulo = new Rectangulo(10, 20);

        System.out.println(rectangulo.getLadoHorizontal());

        System.out.println(rectangulo.getLadoVertical());

        System.out.println(rectangulo.toString());

        rectangulo.setLadoVertical(50);
        rectangulo.setLadoHorizontal(60);

        System.out.println(rectangulo.toString());
        System.out.println(rectangulo.getLadoHorizontal());

        System.out.println(rectangulo.getLadoVertical());

    }
}
