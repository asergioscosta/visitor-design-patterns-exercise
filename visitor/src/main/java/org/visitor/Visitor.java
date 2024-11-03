package org.visitor;

public interface Visitor {

    String exibirComprador(Comprador comprador);

    String exibirProdutor(Produtor produtor);

    String exibirVendedor(Vendedor vendedor);
}
