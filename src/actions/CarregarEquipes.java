/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actions;

import classes.Equipe;
import java.util.TreeSet;

/**
 *
 * @author leona
 */
public class CarregarEquipes {
    public static void carregaComboBoxEquipes(javax.swing.JComboBox cEquipes, TreeSet<Equipe> equipes) {
        for (Equipe equipe : equipes) {
            cEquipes.addItem(equipe.getNome());
        }
    }
}
