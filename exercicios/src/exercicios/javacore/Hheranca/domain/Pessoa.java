package exercicios.javacore.Hheranca.domain;

public class Pessoa {
    static {
        System.out.println("dentro do staic de Pessoa");
    }

    protected String nome;
    protected int idade;
    protected Endereco endereco;

    {
        System.out.println("dentro do bloco de inicializacao nao static1 de Pessoa");
    }

    {
        System.out.println("dentro do bloco de inicializacao nao static2 de Pessoa");
    }

    public Pessoa(String nome) {
        this.nome = nome;
        System.out.println("dentro do construtor de Pessoa");
    }

    public Pessoa(String nome, int idade) {
        this(nome);
        this.idade = idade;
    }

    public void imprime() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("endereco: " + endereco.getRua() + "cep: " + endereco.getCep());
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
