/*
 * @category    Animal
 * @package     Animal 
 * @developer    Elder Sergio Xavier RA 1323594 / Henrique Alexandrino Pires Paes RA: 1320855
 * @contact      contato@elderxavier.com.br / henriqalexandrino@gmail.com
 * @created      2016-25-09
 * @last update  2016-25-09
 * @Developer    Elde Xavier
 * @contact      contato@elderxavier.com.br
 */
package br.edu.sumare.animal;


public class Insectos extends Animal implements Alimentacao, Reproducao{
    private int qtd_patas;
    private boolean asas;
    private String alimentacao;
    

    public int getQtd_patas() {
        return qtd_patas;
    }

    public void setQtd_patas(int qtd_patas) {
        this.qtd_patas = qtd_patas;
    }
    public void setAsas(boolean asas) {
        this.asas = asas;
    }
    
    public boolean isAsas() {
        return asas;
    }

     public void setAtimentacao(String alimentacao) {
        this.alimentacao =  alimentacao.equals("Insetívoro") ? alimentacao : "";
    }
    
    @Override
    public String alimentacao() {
        return this.alimentacao;
    }

    @Override
    public String reproducao() {
        return "OVO";
    }

    
    
}
