/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import interfaces.IReturnRow;
import java.io.Serializable;
import java.util.UUID;
import java.util.Vector;

/**
 *
 * @author leona
 */
public class Perfil implements Serializable, IReturnRow{
    private String id;
    private Jogador jogador;
    private Jogo jogo;
    private String nickname;
    private String elo;

    public Perfil(Jogador jogador, Jogo jogo, String nickname, String elo) {
        UUID uuid = UUID.randomUUID();
        this.id = uuid.toString();
        this.jogador = jogador;
        this.jogo = jogo;
        this.nickname = nickname;
        this.elo = elo;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getElo() {
        return elo;
    }

    public void setElo(String elo) {
        this.elo = elo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
    
    @Override
    public Vector returnRow() {
        Vector row = new Vector();
        row.add(this.jogador.getUsername());
        row.add(this.nickname);
        row.add(this.elo);
        row.add(this.jogo.getNome());
        return row;
    }
}
