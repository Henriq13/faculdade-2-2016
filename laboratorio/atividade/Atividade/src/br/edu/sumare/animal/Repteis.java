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

public class Repteis extends Animal implements Alimentacao, Reproducao {
    private boolean corpo_escamas;
    private boolean carapaca_com_placas;
    private String alimentacao;    

    public boolean isCorpo_escamas() {
        return corpo_escamas;
    }

    public void setCorpo_escamas(boolean corpo_escamas) {
        this.corpo_escamas = corpo_escamas;
    }

    public boolean isCarapaca_com_placas() {
        return carapaca_com_placas;
    }

    public void setCarapaca_com_placas(boolean carapaca_com_placas) {
        this.carapaca_com_placas = carapaca_com_placas;
    }
    
    public void setAtimentacao(String alimentacao) {
        this.alimentacao =  alimentacao.equals("Herbívoro") || alimentacao.equals("Carnívoro")  ? alimentacao : "";
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
