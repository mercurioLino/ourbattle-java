/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import classes.OurBattle;
import excecoes.ErroDeGravacaoException;

/**
 *
 * @author Luiz Henrick
 */
public class Gravar {
    public static void gravarDados(OurBattle ourbattle) throws ErroDeGravacaoException{
        try{
            OurBattle objOurBattle = new OurBattle();
            objOurBattle = ourbattle;
            Gravador.gravarDados(new LeitorGravadorObj(), objOurBattle, "ourbattle.dat");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
