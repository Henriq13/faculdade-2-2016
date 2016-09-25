
package edu.com.sumare.interfaces;


public class Operacao implements Interface{

    @Override
    public double soma(int x, int y) {
        return (x +y); 
    }

    @Override
    public double mutiplicacao(int x, int y) {
        return (x * y); 
    }
    
    public static void main(String[] args) {
        Operacao op = new Operacao();
        
       
        System.out.println( "Soma: "+String.valueOf(  op.soma(5, 5)  ) );
        System.out.println( "Multiplicacao: "+String.valueOf(  op.mutiplicacao(5, 5)  ) );
        
    }
    
}
