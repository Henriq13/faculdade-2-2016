package com.sumare.operacao;

public class FazerOperacao extends Operacao {
    
    private static double resOp;
    
    public static void main(String[] args) {
        FazerOperacao op = new FazerOperacao();
        resOp = op.FazerOperacao(10, 5, "-");
        System.out.println("O resultado é" + resOp);        
    }
}
