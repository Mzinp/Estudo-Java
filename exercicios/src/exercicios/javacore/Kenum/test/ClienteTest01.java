package exercicios.javacore.Kenum.test;

import exercicios.javacore.Kenum.domain.Cliente;
import exercicios.javacore.Kenum.domain.TipoCliente;
import exercicios.javacore.Kenum.domain.TipoPagamento;

public class ClienteTest01 {
    static void main() {
        Cliente c1 = new Cliente("nome2", TipoPagamento.PIX, TipoCliente.PESSOA_FISICA);
        Cliente c2 = new Cliente("nome1", TipoPagamento.CREDITO, TipoCliente.PESSOA_JURIDICA);
        Cliente c3 = new Cliente("DINOSA", TipoPagamento.CREDITO, TipoCliente.DINOSAURO);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.PIX.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Fisica");
        System.out.println(tipoCliente2);
    }
}
