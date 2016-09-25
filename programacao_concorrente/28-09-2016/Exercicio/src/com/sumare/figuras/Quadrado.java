
package com.sumare.figuras;


public class Quadrado extends Figura{
    
    
    public static void main(String[] args) {
        Quadrado q = new Quadrado();
        System.out.println("Area: " + q.getArea(10, 10));
        System.out.println("Perimetro: " + q.getPerimetro(10, 10));
        System.out.println("Nome: " + q.getNome("Quadrado"));
        
        int t =0;
        
        t = 1 > 0 ? ( 1 < 2 ? 1: 2) : 0;
        
        if( 1 > 0 ){
            t = 1;
        }else{
            t = 0;
        }

    }
    
}
