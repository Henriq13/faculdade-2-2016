
package aula;


public class Aula {

   

    
    public static void main(String[] args) {
        
        Logica calc = new Logica();
        
        /*Soma*/
        System.out.print("Soma\n__________________________\n"  );
        System.out.println( calc.soma(5, 5) );
        System.out.println( calc.soma(5.1f, 5.1f));
        System.out.println( calc.soma(true, false) );
        System.out.println( calc.soma(5.00, 5.00) );
        System.out.println( calc.soma(5, 5) );
        System.out.println( calc.soma("5", "5") );
        
        System.out.print("Subtracao\n__________________________\n"  );
        /*Subtracao*/
        System.out.println( calc.subritracao(5, 5) );
          System.out.println( calc.subritracao( 7.1, 5.1f) );
        System.out.println( calc.subritracao(true, false) );
        System.out.println( calc.subritracao(5.00, 5.00) );
        System.out.println( calc.subritracao(5, 5) );
        System.out.println( calc.subritracao("5", "5") );        
        System.out.println( calc.subritracao("5",  new Integer("3")) );
        
        /*Multiplicacao*/
        System.out.print("Multiplicacao\n__________________________\n"  );                     
        System.out.println( calc.mutiplicacao(5, 5) );
          System.out.println( calc.mutiplicacao( 7.1, 5.1f) );
        System.out.println( calc.mutiplicacao(true, false) );
        System.out.println( calc.mutiplicacao(5.00, 5.00) );
        System.out.println( calc.mutiplicacao(5, 5) );
        System.out.println( calc.mutiplicacao("5", "5") );        
        System.out.println( calc.mutiplicacao("5",  new Integer("3")) );
        
        /*Divisao*/
        System.out.print("Multiplicacao\n__________________________\n"  );                     
        System.out.println( calc.divisao(5, 5) );
          System.out.println( calc.divisao( 7.1, 5.1f) );
        System.out.println( calc.divisao(true, false) );
        System.out.println( calc.divisao(5.00, 5.00) );
        System.out.println( calc.divisao(5, 5) );
        System.out.println( calc.divisao("5", "5") );        
        System.out.println( calc.divisao("5",  new Integer("3")) );
        
        
        System.out.println( calc.soma("5",  new Aula()) );

    }

}
