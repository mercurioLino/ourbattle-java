/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import interfaces.IReturnRow;
import java.io.Serializable;
import java.util.Vector;

/**
 *
 * @author Windows
 */
public class Funcionario extends Usuario implements Serializable, IReturnRow{
    private String cpf;
    private String nome;
    private Organizacao organizacao;

    public Funcionario(String cpf, String nome, String email, Organizacao organizacao, String senha, String tipo) {
        super(email, senha, tipo);
        this.cpf = cpf;
        this.nome = nome;
        this.organizacao = organizacao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Organizacao getOrganizacao() {
        return organizacao;
    }

    public void setOrganizacao(Organizacao organizacao) {
        this.organizacao = organizacao;
    }
    
    @Override
    public Vector returnRow() {
        Vector row = new Vector();
        row.add(this.getId());
        row.add(this.nome);
        row.add(this.getEmail());
        row.add(this.organizacao.getRazaoSocial());
        return row;
    }
    
}
