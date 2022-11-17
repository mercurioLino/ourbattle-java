/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actions.finds;

import classes.Jogo;
import java.util.TreeSet;

/**
 *
 * @author leona
 */
public class FindJogoByNome {
    public static Jogo findJogoByNome(String nome, TreeSet<Jogo> jogos) {
        Jogo retorno = null;
        try{
            for(Jogo jogo: jogos){
                if(jogo.getNome().equals(nome)){
                    retorno = jogo;
                }
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return retorno;
    } 
}
