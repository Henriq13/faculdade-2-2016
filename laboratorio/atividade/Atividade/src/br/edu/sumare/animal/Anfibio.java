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

public class Anfibio extends Animal implements Alimentacao, Reproducao{
    private boolean pele_nua;
    private String alimentacao;
    private String reproducao;

    public boolean isPele_nua() {
        return pele_nua;
    }

    public void setPele_nua(boolean pele_nua) {
        this.pele_nua = pele_nua;
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
