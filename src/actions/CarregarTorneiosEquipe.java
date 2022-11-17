/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actions;

import classes.Torneio;
import classes.TorneioEquipe;
import java.util.TreeSet;

/**
 *
 * @author leona
 */
public class CarregarTorneiosEquipe {
    public static void carregaComboBoxTorneiosEquipe(javax.swing.JComboBox cTorneios, TreeSet<TorneioEquipe> torneios) {
        for (TorneioEquipe torneio : torneios) {
            cTorneios.addItem(torneio.getNome());
        }
    }
}
