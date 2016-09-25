
package edu.com.sumare12;


public abstract class A implements OperacaoLista{
    @SuppressWarnings("unused")
    private String[] nome = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sababo"};
    
    @Override
    public void listar() {
        for( String string : nome){
            System.out.println(string);
        }
        
    }
    
    
}
