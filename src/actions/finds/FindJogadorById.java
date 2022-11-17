/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actions.finds;

import classes.Jogador;
import java.util.TreeSet;
import java.util.UUID;

/**
 *
 * @author leona
 */
public class FindJogadorById {
    public static Jogador findJogadorById(String id, TreeSet<Jogador> jogadores) {
        Jogador retorno = null;
        try{
            for(Jogador jogador: jogadores){
                if(jogador.getId().equals(id)){
                    retorno = jogador;
                }
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return retorno;
    } 
}
