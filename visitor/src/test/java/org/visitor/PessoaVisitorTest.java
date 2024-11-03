package org.visitor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PessoaVisitorTest {

    @Test
    void deveRetornarExibirComprador() {
        Comprador comprador = new Comprador(1, "Augusto", 4);
        PessoaVisitor visitor = new PessoaVisitor();

        assertEquals("Comprador{id=1, nomeComprador='Augusto', quantidadeProduto=4}", visitor.exibir(comprador));
    }

    @Test
    void deveRetornarExibirProdutor() {
        Produtor produtor = new Produtor(1, "Augusto");
        PessoaVisitor visitor = new PessoaVisitor();

        assertEquals("Produtor{id=1, nomeProdutor='Augusto'}", visitor.exibir(produtor));
    }

    @Test
    void deveRetornarExibirVendedor() {
        Vendedor vendedor = new Vendedor(1, "Augusto", 987.65f);
        PessoaVisitor visitor = new PessoaVisitor();

        assertEquals("Vendedor{id=1, nomeVendedor='Augusto', comissaoVendedor=987.65}", visitor.exibir(vendedor));
    }
}