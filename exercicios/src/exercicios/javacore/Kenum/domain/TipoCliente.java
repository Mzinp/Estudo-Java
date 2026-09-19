package exercicios.javacore.Kenum.domain;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica"),
    DINOSAURO(3, "Pessoa Dinosauro");
    public final int VALOR;
    public final String DESCRICAO;

    TipoCliente(int valor, String descricao) {
        this.VALOR = valor;
        this.DESCRICAO = descricao;
    }

    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {
        for (TipoCliente tipoCliente : TipoCliente.values()) {
            if (tipoCliente.DESCRICAO.equals(nomeRelatorio)) {
                return tipoCliente;
            }
        }
        return null;
    }
}
