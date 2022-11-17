/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actions;

import classes.TorneioIndividual;
import java.util.TreeSet;

/**
 *
 * @author leona
 */
public class FindTorneioIndividualByNome {
    public static TorneioIndividual findTorneioIndividualByNome(String nome, TreeSet<TorneioIndividual> torneios) {
        TorneioIndividual retorno = null;
        try {
            for (TorneioIndividual torneio : torneios) {
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
