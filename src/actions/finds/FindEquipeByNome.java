/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actions.finds;

import classes.Equipe;
import java.util.TreeSet;

/**
 *
 * @author leona
 */
public class FindEquipeByNome {

    public static Equipe findEquipeByNome(String nome, TreeSet<Equipe> equipes) {
        Equipe retorno = null;
        try {
            for (Equipe equipe : equipes) {
                if (equipe.getNome().equals(nome)) {
                    retorno = equipe;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return retorno;
    }
}
