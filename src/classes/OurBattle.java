/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.awt.List;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.TreeSet;

/**
 *
 * @author leona
 */
public class OurBattle implements Serializable{
    TreeSet<Atendimento> atendimentos = new TreeSet<>();
    TreeSet<Equipe> equipes = new TreeSet<>();
    TreeSet<Funcionario> funcionarios = new TreeSet<>();
    TreeSet<Jogo> jogos = new TreeSet<>();
    TreeSet<Organizacao> organizacoes = new TreeSet<>();
    TreeSet<Jogador> jogadores = new TreeSet<>();
    TreeSet<Partida> partidas = new TreeSet<>();
    TreeSet<Torneio> torneios = new TreeSet<>();
    TreeSet<Usuario> usuarios = new TreeSet<>();
    TreeSet<Perfil> perfis = new TreeSet<>();

    public OurBattle() {
        this.inicializaJogos();
    }
     
    private void inicializaJogos(){
        Jogo jogo1 = new Jogo("LOL", "MOBA", "Jogo MOBA 5x5 da RIOT");
        Jogo jogo2 = new Jogo("CS:GO", "FPS", "Jogo FPS 5x5 da VALVE");
        Jogo jogo3 = new Jogo("TFT", "Autochess", "Jogo Autochess da RIOT");
        Jogo jogo4 = new Jogo("Valorant", "FPS", "Jogo FPS 5x5 da RIOT");
        Jogo jogo5 = new Jogo("Fortnite", "Battle Royale", "Jogo Battle Royale da EPIC GAMES");
        this.jogos.add(jogo1);
        this.jogos.add(jogo2);
        this.jogos.add(jogo3);
        this.jogos.add(jogo4);
        this.jogos.add(jogo5);
    }
    public TreeSet<Atendimento> getAtendimentos() {
        return atendimentos;
    }
    
    public void setAtendimentos(TreeSet<Atendimento> atendimentos) {
        this.atendimentos = atendimentos;
    }

    public TreeSet<Equipe> getEquipes() {
        return equipes;
    }

    public void setEquipes(TreeSet<Equipe> equipes) {
        this.equipes = equipes;
    }

    public TreeSet<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(TreeSet<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public TreeSet<Jogo> getJogos() {
        return jogos;
    }

    public void setJogos(TreeSet<Jogo> jogos) {
        this.jogos = jogos;
    }

    public TreeSet<Organizacao> getOrganizacoes() {
        return organizacoes;
    }

    public void setOrganizacoes(TreeSet<Organizacao> organizacoes) {
        this.organizacoes = organizacoes;
    }

    public TreeSet<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(TreeSet<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public TreeSet<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(TreeSet<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    

    public TreeSet<Partida> getPartidas() {
        return partidas;
    }

    public void setPartidas(TreeSet<Partida> partidas) {
        this.partidas = partidas;
    }

    public TreeSet<Torneio> getTorneios() {
        return torneios;
    }

    public void setTorneios(TreeSet<Torneio> torneios) {
        this.torneios = torneios;
    }
    
    public TreeSet<Perfil> getPerfis() {
        return perfis;
    }

    public void setPerfis(TreeSet<Perfil> perfis) {
        this.perfis = perfis;
    }
}
