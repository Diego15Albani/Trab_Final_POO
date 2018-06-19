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
public class Cliente extends Usuario {

    private String rg;
    private String dtNascimento;

    public Cliente(String rg, String dtNascimento, String nome, String endereco, String cidade, String estado, int cep, String tel, String cpf, String email, String senha, String login, String nivel) {
        super(nome, endereco, cidade, estado, cep, tel, cpf, email, senha, login, nivel);
        this.rg = rg;
        this.dtNascimento = dtNascimento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

}
