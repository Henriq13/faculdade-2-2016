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


public class Aves extends Animal implements Alimentacao, Reproducao{
    
    private boolean corpo_coberto_penas;
    private boolean voa;
    private String alimentacao;    

    public boolean isCorpo_coberto_penas() {
        return corpo_coberto_penas;
    }

    public void setCorpo_coberto_penas(boolean corpo_coberto_penas) {
        this.corpo_coberto_penas = corpo_coberto_penas;
    }

    public boolean isVoa() {
        return voa;
    }

    public void setVoa(boolean voa) {
        this.voa = voa;
    }
    
    public void setAtimentacao(String alimentacao) {
        this.alimentacao =  alimentacao.equals("Herbívoro") || alimentacao.equals("Carnívoro") ? alimentacao : "";
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
