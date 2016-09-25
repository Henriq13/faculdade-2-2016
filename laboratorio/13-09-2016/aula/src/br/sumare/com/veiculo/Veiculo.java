
package br.sumare.com.veiculo;


public abstract class Veiculo {
    private String modelo;
    private String marca;
    private String ano;
    private String chassi;
    private String qtdlugares;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getQtdlugares() {
        return qtdlugares;
    }

    public void setQtdlugares(String qtdlugares) {
        this.qtdlugares = qtdlugares;
    }
    
}
