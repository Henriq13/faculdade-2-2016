/*********************************
*Programação Concorrente
*Prof:      Paulo Sergio
*@Created   29-08-2016
*@Developer Elde Xavier
*@Contact  contato@elderxavier.com.br
**********************************/

package com.sumare.operacao;

public abstract class Operacao {
    private double n1;
    private double n2;
    private String op;
    
    public double FazerOperacao(int x, int y, String z){
        this.n1 = x;
        this.n2 = y;
        this.op = z;
        double res = 0;
        
        if( this.op.equals("+") ){
            res = this.n1 + this.n2;
        }
        
        if( this.op.equals("-") ){
            res = this.n1 - this.n2;
        }
        
        if( this.op.equals("*") ){
            res = this.n1 * this.n2;
        }
        
        if( this.op.equals("/") ){
            res = this.n1 / this.n2;
        }
        
        if( this.op.equals("%") ){
            res = this.n1 % this.n2;
        }
        return res;
    }
    
}
