
package br.sumare.com.veiculo;


public class Moto extends Veiculo implements Iveicular{
    private String kmplitro;
    @Override
    public boolean isCombustivel(boolean combustivel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean IsFuncionando(boolean funcionando) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getKmplitro() {
        return kmplitro;
    }

    public void setKmplitro(String kmplitro) {
        this.kmplitro = kmplitro;
    }
    
}
