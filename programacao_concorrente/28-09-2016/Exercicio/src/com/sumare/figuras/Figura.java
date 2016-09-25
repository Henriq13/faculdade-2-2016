package com.sumare.figuras;

public abstract class Figura {

    private int x;
    private int y;
    private String none;

    public int getArea(int a, int b) {
        this.x = a;
        this.y = b;
        return this.x * this.y;
    }

    public int getPerimetro(int a, int b) {
        this.x = a;
        this.y = b;
        return this.x + this.y;
    }

    public String getNome(String n) {
        this.none = n;
        return this.none;
    }

}
