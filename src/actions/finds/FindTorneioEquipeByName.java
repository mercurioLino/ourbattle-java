/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actions.finds;

import classes.TorneioEquipe;
import java.util.TreeSet;

/**
 *
 * @author leona
 */
public class FindTorneioEquipeByName {
    public static TorneioEquipe findTorneioEquipeByNome(String nome, TreeSet<TorneioEquipe> torneios) {
        TorneioEquipe retorno = null;
        try {
            for (TorneioEquipe torneio : torneios) {
                if (torneio.getNome().equals(nome)) {
                    retorno = torneio;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return retorno;
    }
}
