package com.sumare.figuras;

public class Retangulo extends Figura {

    public static void main(String[] args) {
        Retangulo r = new Retangulo();
        System.out.println("Area: " + r.getArea(15, 10));
        System.out.println("Perimetro: " + r.getPerimetro(15, 10));
        System.out.println("Nome: " + r.getNome("Retangulo"));
    }
}
