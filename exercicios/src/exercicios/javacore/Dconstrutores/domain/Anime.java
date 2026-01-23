package exercicios.javacore.Dconstrutores.domain;

public class Anime {
    private String tipo;
    private int episodios;
    private String nome;
    private String genero;
    private String estudio;
    //constructor
    public Anime(String nome, String tipo, int episodios, String genero){
        this();
        this.init(nome,tipo,episodios,genero);

    }
    public Anime(String nome, String tipo, int episodios, String genero, String estudio){
        this(nome,tipo,episodios,genero);
        this.estudio = estudio;

    }
    public Anime(){
        System.out.println("dentro do constructor");
        if(this.tipo==null){
            System.out.print(" sem argumentos");
        }

    }
    //metodo geral
    public void init(String nome, String tipo, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }
    public void init(String nome, String tipo, int episodios, String genero) {
        this.init(nome, tipo, episodios);
        this.genero = genero;
    }
    //metodos gets e sets
    public void imprime(){
        System.out.println(tipo);
        System.out.println(episodios);
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
    public String getTipo() {
        return tipo;
    }
    public int getEpisodios() {
        return episodios;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}

