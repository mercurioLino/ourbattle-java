/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import interfaces.IReturnRow;
import java.io.Serializable;
import java.util.TreeSet;
import java.util.Vector;

/**
 *
 * @author leona
 */
public class Jogador extends Usuario implements Serializable, IReturnRow{
    
    private String nome;
    private String username;
    private int pontuacao;
    private TreeSet<Equipe> equipes = new TreeSet<>();
    private TreeSet<Torneio> torneiosDisputados = new TreeSet<>();
    private TreeSet<Atendimento> atendimentos = new TreeSet<>();

    public Jogador(String nome, String username, String email, String senha, String tipo) {
        super(email, senha, tipo);
        this.nome = nome;
        this.username = username;
        this.pontuacao = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public TreeSet<Torneio> getTorneiosDisputados() {
        return torneiosDisputados;
    }

    public void setTorneiosDisputados(TreeSet<Torneio> torneiosDisputados) {
        this.torneiosDisputados = torneiosDisputados;
    }

    public TreeSet<Equipe> getEquipes() {
        return equipes;
    }

    public void setEquipes(TreeSet<Equipe> equipes) {
        this.equipes = equipes;
    }

    public TreeSet<Atendimento> getAtendimentos() {
        return atendimentos;
    }

    public void setAtendimentos(TreeSet<Atendimento> atendimentos) {
        this.atendimentos = atendimentos;
    }
    
    @Override
    public Vector returnRow() {
        Vector row = new Vector();
        row.add(this.getId());
        row.add(this.nome);
        row.add(this.username);
        row.add(this.pontuacao);
        return row;
    }
    
}
