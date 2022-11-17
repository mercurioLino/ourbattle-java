/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import actions.AddObjeto;
import java.io.Serializable;
import java.util.TreeSet;

/**
 *
 * @author leona
 */
public class TorneioIndividual extends Torneio implements Serializable {

    private TreeSet<Jogador> jogadoresInscritos;
    private Jogador jogadorVencedor;

    public TorneioIndividual(String nome, String data, String hora, String premiacao, String regras, String tipo, Organizacao organizacao) {
        super(nome, data, hora, premiacao, regras, tipo, organizacao);
    }

    public TreeSet<Jogador> getJogadoresInscritos() {
        return jogadoresInscritos;
    }

    public void setJogadoresInscritos(TreeSet<Jogador> jogadoresInscritos) {
        this.jogadoresInscritos = jogadoresInscritos;
    }

    public Jogador getJogadorVencedor() {
        return jogadorVencedor;
    }

    public void setJogadorVencedor(Jogador jogadorVencedor) {
        this.jogadorVencedor = jogadorVencedor;
    }

    public void addJogador(Jogador jogador) {
        new AddObjeto().addObjeto(jogador, this.jogadoresInscritos);
    }

}
