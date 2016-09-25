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

import br.edu.sumare.helper.Helper;

public class Mamiferos extends Animal implements Alimentacao, Reproducao {

    private int coberto_de_pelo;
    private String locomocao;
    private String alimentacao;    

    private Helper helper;

    public Mamiferos() {
        helper = new Helper();
    }

    public int getCoberto_de_pelo() {
        return coberto_de_pelo;
    }

    public void setCoberto_de_pelo(int coberto_de_pelo) {
        int ret = 0;
        if (helper.isNumero(String.valueOf(coberto_de_pelo) ) ) {
            if( coberto_de_pelo < 0 ){
                ret = 0;
            }else if( coberto_de_pelo > 100){
                ret =100;
            }else{
                ret = coberto_de_pelo;
            }
            
        }        
        this.coberto_de_pelo = ret;
    }

    public String getLocomocao() {
        return locomocao;
    }

    public void setLocomocao(String locomocao) {        
        this.locomocao =  !locomocao.equals("voa") || !locomocao.equals("nadam") ? "andam" : locomocao;        
    }
    
    public void setAtimentacao(String alimentacao) {
        this.alimentacao =  alimentacao.equals("Herbívoro") || alimentacao.equals("Carnívoro") || alimentacao.equals("Omnívoros") ? alimentacao : "";
    }
    
    @Override
    public String alimentacao() {
        return this.alimentacao;
    }    
    
    @Override
    public String reproducao() {
        return "útero_da_mãe";
    }

}
