/*
 * @category    Atividade Laboratorio
 * @package     Atividade 
 * @developer    Elder Sergio Xavier RA 1323594 / Henrique Alexandrino Pires Paes RA: 1320855
 * @contact      contato@elderxavier.com.br / henriqalexandrino@gmail.com
 * @created      2016-25-09
 * @last update  2016-25-09
 * @Developer    Elde Xavier
 * @contact      contato@elderxavier.com.br
 */
package atividade;

import br.edu.sumare.animal.Anfibio;
import br.edu.sumare.animal.Aves;
import br.edu.sumare.animal.Insectos;
import br.edu.sumare.animal.Mamiferos;
import br.edu.sumare.animal.Peixes;
import br.edu.sumare.animal.Repteis;


public class Atividade {    

    public static void main(String[] args) {
        
        /*Leão*/
        Mamiferos mamifero = new Mamiferos();
        mamifero.setAtimentacao("Carnívoro");
        mamifero.setCoberto_de_pelo(100);
        mamifero.setLocomocao("andam");
        mamifero.setNome_do_tipo("Leão");
        mamifero.setPatas("4");
        mamifero.setPorte("Grande");
        mamifero.setSaude("Instável");
        mamifero.setSexo("Masculino");
        mamifero.setSom("Rugido");
        mamifero.setVivo(true);
        
        System.out.println("________________________");
        System.out.println("Tipo:" + mamifero.getNome_do_tipo());
        System.out.println("Vivo:" + String.valueOf(mamifero.isVivo()));
        System.out.println("Saúde: " + mamifero.getSaude());
        System.out.println("Sexo: " + mamifero.getSexo());
        System.out.println("Porte: " + mamifero.getPorte());
        System.out.println("Locomoção: "+ mamifero.getLocomocao());
        System.out.println("Patas: " + mamifero.getPatas());
        System.out.println("Alimentação: " + mamifero.alimentacao());
        System.out.println("Coberto de pelos: " + String.valueOf(mamifero.getCoberto_de_pelo()));
        System.out.println("Som: " + mamifero.getSom());
        System.out.println("Reprodução: " + mamifero.reproducao());
        
        System.out.println("");
        
        /*Homem*/
        mamifero = new Mamiferos();
        mamifero.setAtimentacao("Omnívoros");
        mamifero.setCoberto_de_pelo(20);
        mamifero.setLocomocao("andam");
        mamifero.setNome_do_tipo("Homem");
        mamifero.setPatas("4");
        mamifero.setPorte("Grande");
        mamifero.setSaude("Instável");
        mamifero.setSexo("Masculino");
        mamifero.setSom("Fala");
        mamifero.setVivo(true);
        
        System.out.println("________________________");
        System.out.println("Tipo:" + mamifero.getNome_do_tipo());
        System.out.println("Vivo:" + String.valueOf(mamifero.isVivo()));
        System.out.println("Saúde: " + mamifero.getSaude());
        System.out.println("Sexo: " + mamifero.getSexo());
        System.out.println("Porte: " + mamifero.getPorte());
        System.out.println("Locomoção: "+ mamifero.getLocomocao());
        System.out.println("Patas: " + mamifero.getPatas());
        System.out.println("Alimentação: " + mamifero.alimentacao());
        System.out.println("Coberto de pelos: " + String.valueOf(mamifero.getCoberto_de_pelo()));
        System.out.println("Som: " + mamifero.getSom());
        System.out.println("Reprodução: " + mamifero.reproducao());
        System.out.println("");
        
        /*Serpente*/
        Repteis repteis = new Repteis();
        repteis.setAtimentacao("Carnívoro");
        repteis.setCarapaca_com_placas(false);
        repteis.setCorpo_escamas(true);
        repteis.setNome_do_tipo("Serpente");
        repteis.setPatas("0");
        repteis.setPorte("Médio");
        repteis.setSaude("Instável");
        repteis.setSexo("Feminino");
        repteis.setSom("Sibila");
        repteis.setVivo(true);
        
        System.out.println("________________________");
         System.out.println("Tipo:" + repteis.getNome_do_tipo());
        System.out.println("Vivo:" + String.valueOf(repteis.isVivo()));
        System.out.println("Saúde: " + repteis.getSaude());
        System.out.println("Sexo: " + repteis.getSexo());
        System.out.println("Porte: " + repteis.getPorte());        
        System.out.println("Patas: " + repteis.getPatas());
        System.out.println("Alimentação: " + repteis.alimentacao());        
        System.out.println("Som: " + repteis.getSom());
        System.out.println("Carapaça com placas: " + String.valueOf( repteis.isCarapaca_com_placas()));
        System.out.println("Corpo com escamas: " + String.valueOf( repteis.isCorpo_escamas()) );
        System.out.println("Reprodução: " + repteis.reproducao());
        System.out.println("");
        
        /*Crocodilo*/
        repteis = new Repteis();
        repteis.setAtimentacao("Carnívoro");
        repteis.setCarapaca_com_placas(true);
        repteis.setCorpo_escamas(false);
        repteis.setNome_do_tipo("Crocodilo");
        repteis.setPatas("4");
        repteis.setPorte("Grande");
        repteis.setSaude("Instável");
        repteis.setSexo("Masculino");
        repteis.setSom("Branido");
        repteis.setVivo(true);
        
        System.out.println("________________________");
        System.out.println("Tipo:" + repteis.getNome_do_tipo());
        System.out.println("Vivo:" + String.valueOf(repteis.isVivo()));
        System.out.println("Saúde: " + repteis.getSaude());
        System.out.println("Sexo: " + repteis.getSexo());
        System.out.println("Porte: " + repteis.getPorte());        
        System.out.println("Patas: " + repteis.getPatas());
        System.out.println("Alimentação: " + repteis.alimentacao());        
        System.out.println("Som: " + repteis.getSom());
        System.out.println("Carapaça com placas: " + String.valueOf( repteis.isCarapaca_com_placas()));
        System.out.println("Corpo com escamas: " + String.valueOf( repteis.isCorpo_escamas()) );
        System.out.println("Reprodução: " + repteis.reproducao());
        System.out.println("");        
        
        /*Salmão*/
        Peixes peixe = new Peixes();
        peixe.setCorpo_escamas(true);
        peixe.setNome_do_tipo("Salmão");
        peixe.setPatas("0");
        peixe.setPorte("Pequeno");
        peixe.setSaude("Estável");
        peixe.setSexo("Maculino");
        peixe.setSom("Não há");
        peixe.setVivo(true);
        
        System.out.println("________________________");
        System.out.println("Tipo:" + peixe.getNome_do_tipo());
        System.out.println("Vivo:" + String.valueOf(peixe.isVivo()));
        System.out.println("Saúde: " + peixe.getSaude());
        System.out.println("Sexo: " + peixe.getSexo());
        System.out.println("Porte: " + peixe.getPorte());        
        System.out.println("Patas: " + peixe.getPatas());        
        System.out.println("Som: " + peixe.getSom());        
        System.out.println("Corpo com escamas: " + String.valueOf( peixe.isCorpo_escamas()) );
        System.out.println("Reprodução: " + peixe.reproducao());
        System.out.println("");
        
        
        /*Salmão*/
        peixe = new Peixes();
        peixe.setCorpo_escamas(true);
        peixe.setNome_do_tipo("San Peter");
        peixe.setPatas("0");
        peixe.setPorte("Pequeno");
        peixe.setSaude("Estável");
        peixe.setSexo("Maculino");
        peixe.setSom("Não há");
        peixe.setVivo(true);
        
        System.out.println("________________________");
        System.out.println("Tipo:" + peixe.getNome_do_tipo());
        System.out.println("Vivo:" + String.valueOf(peixe.isVivo()));
        System.out.println("Saúde: " + peixe.getSaude());
        System.out.println("Sexo: " + peixe.getSexo());
        System.out.println("Porte: " + peixe.getPorte());        
        System.out.println("Patas: " + peixe.getPatas());        
        System.out.println("Som: " + peixe.getSom());        
        System.out.println("Corpo com escamas: " + String.valueOf( peixe.isCorpo_escamas()) );
        System.out.println("Reprodução: " + peixe.reproducao());
        System.out.println("");
        
        
        /*Pombo*/
        Aves ave = new Aves();        
        ave.setAtimentacao("Herbívoro");
        ave.setCorpo_coberto_penas(true);
        ave.setNome_do_tipo("Pombo");
        ave.setPatas("2");
        ave.setPorte("Pequeno");
        ave.setSaude("Estável");
        ave.setSexo("Masculino");
        ave.setSom("Arrulha");
        ave.setVivo(true);
        ave.setVoa(true);
        
        System.out.println("________________________");
        System.out.println("Tipo:" + ave.getNome_do_tipo());
        System.out.println("Vivo:" + String.valueOf(ave.isVivo()));
        System.out.println("Saúde: " + ave.getSaude());
        System.out.println("Sexo: " + ave.getSexo());
        System.out.println("Porte: " + ave.getPorte());        
        System.out.println("Patas: " + ave.getPatas());        
        System.out.println("Som: " + ave.getSom());
        System.out.println("Alimentação: " + ave.alimentacao());
        System.out.println("Corpo Coberto por penas: " + String.valueOf(ave.isCorpo_coberto_penas()));
        System.out.println("Voa: " + String.valueOf(ave.isVoa()));        
        System.out.println("Reprodução: " + ave.reproducao());
        System.out.println("");
        
         /*Galinha*/
        ave = new Aves();        
        ave.setAtimentacao("Herbívoro");
        ave.setCorpo_coberto_penas(true);
        ave.setNome_do_tipo("Galinha");
        ave.setPatas("2");
        ave.setPorte("Pequeno");
        ave.setSaude("Estável");
        ave.setSexo("Masculino");
        ave.setSom("Arrulha");
        ave.setVivo(true);
        ave.setVoa(false);
        
        System.out.println("________________________");
        System.out.println("Tipo:" + ave.getNome_do_tipo());
        System.out.println("Vivo:" + String.valueOf(ave.isVivo()));
        System.out.println("Saúde: " + ave.getSaude());
        System.out.println("Sexo: " + ave.getSexo());
        System.out.println("Porte: " + ave.getPorte());        
        System.out.println("Patas: " + ave.getPatas());        
        System.out.println("Som: " + ave.getSom());
        System.out.println("Alimentação: " + ave.alimentacao());
        System.out.println("Corpo Coberto por penas: " + String.valueOf(ave.isCorpo_coberto_penas()));
        System.out.println("Voa: " + String.valueOf(ave.isVoa()));        
        System.out.println("Reprodução: " + ave.reproducao());
        System.out.println("");
        
        /*Piolho*/
        Insectos insecto = new Insectos();
        insecto.setAtimentacao("Insetívoro");
        insecto.setNome_do_tipo("Piolho");
        insecto.setPatas("8");
        insecto.setPorte("Pequeno");
        insecto.setQtd_patas(8);
        insecto.setSaude("Estável");
        insecto.setSexo("Masculino");
        insecto.setSom("N/A");
        insecto.setAsas(false);
        insecto.setVivo(true);
        
         System.out.println("________________________");
        System.out.println("Tipo:" + insecto.getNome_do_tipo());
        System.out.println("Vivo:" + String.valueOf(insecto.isVivo()));
        System.out.println("Saúde: " + insecto.getSaude());
        System.out.println("Sexo: " + insecto.getSexo());
        System.out.println("Porte: " + insecto.getPorte());        
        System.out.println("Patas: " + insecto.getPatas());        
        System.out.println("Som: " + insecto.getSom());
        System.out.println("Alimentação: " + insecto.alimentacao());
        System.out.println("Quantidade de patas: " + String.valueOf(insecto.getQtd_patas()));
        System.out.println("Asas:" + String.valueOf(insecto.isAsas()));
        System.out.println("Reprodução: " + insecto.reproducao());
        System.out.println("");
        
        /*Gafanhoto*/
        insecto = new Insectos();
        insecto.setAtimentacao("Insetívoro");
        insecto.setNome_do_tipo("Gafanhoto");
        insecto.setPatas("6");
        insecto.setPorte("Pequeno");
        insecto.setQtd_patas(6);
        insecto.setSaude("Estável");
        insecto.setSexo("Masculino");
        insecto.setSom("N/A");
        insecto.setAsas(true);
        insecto.setVivo(true);
        
        System.out.println("________________________");
        System.out.println("Tipo:" + insecto.getNome_do_tipo());
        System.out.println("Vivo:" + String.valueOf(insecto.isVivo()));
        System.out.println("Saúde: " + insecto.getSaude());
        System.out.println("Sexo: " + insecto.getSexo());
        System.out.println("Porte: " + insecto.getPorte());        
        System.out.println("Patas: " + insecto.getPatas());        
        System.out.println("Som: " + insecto.getSom());
        System.out.println("Alimentação: " + insecto.alimentacao());
        System.out.println("Quantidade de patas: " + String.valueOf(insecto.getQtd_patas()));
        System.out.println("Asas:" + String.valueOf(insecto.isAsas()));
        System.out.println("Reprodução: " + insecto.reproducao());
        System.out.println("");
        
        /*Rã*/
        Anfibio anfibio = new Anfibio();
        anfibio.setAtimentacao("Insetívoro");
        anfibio.setPele_nua(true);
        anfibio.setNome_do_tipo("Rã");
        anfibio.setPatas("4");
        anfibio.setPorte("Pequeno");
        anfibio.setSaude("Estável");
        anfibio.setSexo("Feminino");
        anfibio.setSom("coaxar");
        anfibio.setVivo(true);
        
        System.out.println("________________________");
        System.out.println("Tipo:" + anfibio.getNome_do_tipo());
        System.out.println("Vivo:" + String.valueOf(anfibio.isVivo()));
        System.out.println("Saúde: " + anfibio.getSaude());
        System.out.println("Sexo: " + anfibio.getSexo());
        System.out.println("Porte: " + anfibio.getPorte());        
        System.out.println("Patas: " + anfibio.getPatas());        
        System.out.println("Som: " + anfibio.getSom());
        System.out.println("Alimentação: " + anfibio.alimentacao());
        System.out.println("Pele nua: " + String.valueOf(anfibio.isPele_nua()));        
        System.out.println("Reprodução: " + anfibio.reproducao());
        System.out.println("");
        
        /*Rã*/
        anfibio = new Anfibio();
        anfibio.setAtimentacao("Insetívoro");
        anfibio.setPele_nua(true);
        anfibio.setNome_do_tipo("Rã");
        anfibio.setPatas("0");
        anfibio.setPorte("Médio");
        anfibio.setSaude("Estável");
        anfibio.setSexo("Feminino");
        anfibio.setSom("Sibila");
        anfibio.setVivo(true);
        
        System.out.println("________________________");
        System.out.println("Tipo:" + anfibio.getNome_do_tipo());
        System.out.println("Vivo:" + String.valueOf(anfibio.isVivo()));
        System.out.println("Saúde: " + anfibio.getSaude());
        System.out.println("Sexo: " + anfibio.getSexo());
        System.out.println("Porte: " + anfibio.getPorte());        
        System.out.println("Patas: " + anfibio.getPatas());        
        System.out.println("Som: " + anfibio.getSom());
        System.out.println("Alimentação: " + anfibio.alimentacao());
        System.out.println("Pele nua: " + String.valueOf(anfibio.isPele_nua()));        
        System.out.println("Reprodução: " + anfibio.reproducao());
        System.out.println("");
        
        
    }    
    
}
