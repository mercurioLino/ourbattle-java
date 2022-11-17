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
public class CarregarTorneiosIndividual {
    public static void carregaComboBoxTorneiosIndividual(javax.swing.JComboBox cTorneios, TreeSet<TorneioIndividual> torneios) {
        for (TorneioIndividual torneio : torneios) {
            cTorneios.addItem(torneio.getNome());
        }
    }
}
