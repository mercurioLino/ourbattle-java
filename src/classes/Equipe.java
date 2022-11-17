/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import interfaces.IReturnRow;
import java.io.Serializable;
import java.util.TreeSet;
import java.util.UUID;
import java.util.Vector;

/**
 *
 * @author Windows
 */
public class Equipe implements Comparable<Equipe>, Serializable, IReturnRow{
    private String id;
    private String nome;
    private String tag;
    private int pontuacao;
    private TreeSet<Jogador> jogadores = new TreeSet<>();
    private TreeSet<Partida> partidasDisputadas = new TreeSet<>();   
    private TreeSet<Torneio> torneiosDisputados = new TreeSet<>();

    public Equipe(String nome, String tag) {
        UUID uuid = UUID.randomUUID();
        this.id = uuid.toString();
        this.nome = nome;
        this.tag = tag;
        this.pontuacao = 0;
    }
    
    public Equipe(String nome) {
        UUID uuid = UUID.randomUUID();
        this.id = uuid.toString();
        this.nome = nome;
        this.pontuacao = 0;
        this.jogadores = new TreeSet<>();
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
    
    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public TreeSet<Jogador> getJogadores() {
        return jogadores;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public void setJogadores(TreeSet<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public TreeSet<Partida> getPartidasDisputadas() {
        return partidasDisputadas;
    }

    public void setPartidasDisputadas(TreeSet<Partida> partidasDisputadas) {
        this.partidasDisputadas = partidasDisputadas;
    }

    public TreeSet<Torneio> getTorneiosDisputados() {
        return torneiosDisputados;
    }

    public void setTorneiosDisputados(TreeSet<Torneio> torneiosDisputados) {
        this.torneiosDisputados = torneiosDisputados;
    }

    @Override
    public int compareTo(Equipe equipe) {
        return this.id.compareTo(equipe.getId());
    }

    @Override
    public Vector returnRow() {
        Vector row = new Vector();
        row.add(this.id);
        row.add(this.nome);
        row.add(this.tag);
        row.add(this.pontuacao);
        return row;
    }
    
    
    
}
