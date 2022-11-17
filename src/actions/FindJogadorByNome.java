/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actions;

import classes.Jogador;
import java.util.TreeSet;

/**
 *
 * @author leona
 */
public class FindJogadorByNome {
    public static Jogador findJogadorByNome(String nome, TreeSet<Jogador> jogadores) {
        Jogador retorno = null;
        try {
            for (Jogador jogador : jogadores) {
                if (jogador.getNome().equals(nome)) {
                    retorno = jogador;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return retorno;
    }
}
