package aula3;

public class Pessoa {

    private String nome;
    private int idade;
    private int cpf;
    private boolean sexo;
    private float altura;
    private float peso;

    public Pessoa() {
        System.out.println("Carregando");
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String naux) {
        this.nome = naux;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCpf() {
        return this.cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public boolean isSexo() {
        return this.sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public boolean getSexo() {
        return this.sexo;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public void andar(){
        System.out.println("Andando");
    }
    
    public void comer(){
        System.out.println("Comendo");
    }
    
    public void dormir(){
        System.out.println("Dormindo");
    }

    
}
