
package br.sumare.com.veiculo;


public class Onibus extends Veiculo implements Iveicular{
    private String rota;
    @Override
    public boolean isCombustivel(boolean combustivel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean IsFuncionando(boolean funcionando) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getRota() {
        return rota;
    }

    public void setRota(String rota) {
        this.rota = rota;
    }
    
}
