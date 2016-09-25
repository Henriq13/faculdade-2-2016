
package br.sumare.com.veiculo;


public class Automovel extends Veiculo implements Iveicular{
    private int qtdparcelas;

    @Override
    public boolean isCombustivel(boolean combustivel) {
        return combustivel;
    }

    @Override
    public boolean IsFuncionando(boolean funcionando) {
        return funcionando;        
    }

    public int getQtdparcelas() {
        return qtdparcelas;
    }

    public void setQtdparcelas(int qtdparcelas) {
        this.qtdparcelas = qtdparcelas;
    }
    
    

   
    
}
