
package aula3;


public class Aula3 {

    public Aula3(){
        System.out.println("Carregando aula3");
    }

    public static void main(String[] args) {        
            Pessoa p1 = new Pessoa();     
            Aula3 a1 = new Aula3();
            p1.setNome("José");
            p1.setIdade(23);
            p1.setAltura(1.70f);            
            p1.setPeso(78.6f);
            p1.setCpf(123);
            p1.setSexo(true);
            
            System.out.println(p1.getNome());            
            System.out.println (p1.getIdade());
            System.out.println (p1.getAltura());
            System.out.println (p1.getPeso());
            System.out.println (p1.getCpf());
            System.out.println (p1.getSexo());   
            
            p1.andar();
            p1.comer();
            p1.dormir();            
            
            Funcionario f1 = new Funcionario();
            f1.trabalhar();
            
            
            
            
    }
    
}


