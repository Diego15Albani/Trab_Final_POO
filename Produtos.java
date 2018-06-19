/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_final;

/**
 *
 * @author Albani
 */
public class Produtos {

    private String nome;
    private String descricao;
    private String precoCompra;
    private String precoVenda;
    private String qtdEstoque;

    public Produtos(String nome, String descricao, String precoCompra, String precoVenda, String qtdEstoque) {
        this.nome = nome;
        this.descricao = descricao;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
        this.qtdEstoque = qtdEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(String precoCompra) {
        this.precoCompra = precoCompra;
    }

    public String getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(String precoVenda) {
        this.precoVenda = precoVenda;
    }

    public String getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(String qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public void pesquisar() {

    }

}
