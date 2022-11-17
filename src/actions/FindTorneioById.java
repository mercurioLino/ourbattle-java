/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actions;

import classes.Torneio;
import java.util.TreeSet;

/**
 *
 * @author leona
 */
public class FindTorneioById {
    public static Torneio findTorneioById(String id, TreeSet<Torneio> torneios) {
        Torneio retorno = null;
        try{
            for(Torneio torneio: torneios){
                if(torneio.getId().equals(id)){
                    retorno = torneio;
                }
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return retorno;
    } 
}
