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

public class Peixes extends Animal implements Reproducao{
    
    private boolean corpo_escamas;
    
     public boolean isCorpo_escamas() {
        return corpo_escamas;
    }

    public void setCorpo_escamas(boolean corpo_escamas) {
        this.corpo_escamas = corpo_escamas;
    }

    @Override
    public String reproducao() {
        return "OVO";
    }
}
