package org.visitor;

public class Produto {

    private String nome;

    private String preco;

    private String descricaoProduto;

    public Produto(String nome, String preco, String descricaoProduto) {
        this.nome = nome;
        this.preco = preco;
        this.descricaoProduto = descricaoProduto;
    }

    public String getNome() {
        return nome;
    }

    public String getPreco() {
        return preco;
    }

    public String getdescricaoProduto() {
        return descricaoProduto;
    }
}
