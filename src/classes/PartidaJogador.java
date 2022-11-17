/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import actions.AddObjeto;
import interfaces.IAddObjeto;
import java.io.Serializable;
import java.util.TreeSet;

/**
 *
 * @author leona
 */
public class PartidaJogador extends Partida implements Serializable{
    private TreeSet<Jogador> jogadoresParticipantes;
    private Jogador jogadorVencedor;

    public PartidaJogador(String data, String hora) {
        super(data, hora);
    }
        
    public TreeSet<Jogador> getJogadoresParticipantes() {
        return jogadoresParticipantes;
    }

    public void setJogadoresParticipantes(TreeSet<Jogador> jogadoresParticipantes) {
        this.jogadoresParticipantes = jogadoresParticipantes;
    }

    public Jogador getJogadorVencedor() {
        return jogadorVencedor;
    }

    public void setJogadorVencedor(Jogador jogadorVencedor) {
        this.jogadorVencedor = jogadorVencedor;
    }
    
    public void addJogador(Jogador jogador) {
        new AddObjeto().addObjeto(jogador, this.jogadoresParticipantes);
    }
}
