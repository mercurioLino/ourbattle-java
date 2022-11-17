/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io;

import classes.OurBattle;
import io.Gravar;

/**
 *
 * @author leona
 */
public class Salvar {

    public static void salvar(OurBattle ourbattle) {
        try {
            Gravar.gravarDados(ourbattle);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
