package org.visitor;

public class Comprador implements Pessoa {

    private int id;

    private String nomeComprador;

    private int quantidadeProduto;

    public Comprador(int id, String nomeComprador, int quantidadeProduto) {
        this.id = id;
        this.nomeComprador = nomeComprador;
        this.quantidadeProduto = quantidadeProduto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeComprador() {
        return nomeComprador;
    }

    public void setNomeComprador(String nomeComprador) {
        this.nomeComprador = nomeComprador;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirComprador(this);
    }
}
