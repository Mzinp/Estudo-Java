package exercicios.javacore.Kenum.domain;

public class Cliente {
    private String nome;
    private TipoPagamento tipoPagamento;
    private TipoCliente tipoCliente;

    public Cliente(String nome, TipoPagamento tipoPagamento, TipoCliente tipoCliente) {
        this.nome = nome;
        this.tipoPagamento = tipoPagamento;
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoPagamento=" + tipoPagamento +
                ", tipoCliente=" + tipoCliente.VALOR +
                ", tipoClienteDescricao=" + tipoCliente.DESCRICAO +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoClien) {
        this.tipoCliente = tipoCliente;
    }


}
