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
public class FindEquipeById {
    public static Equipe findEquipeById(String id, TreeSet<Equipe> equipes) {
        Equipe retorno = null;
        try{
            for(Equipe equipe: equipes){
                if(equipe.getId().equals(id)){
                    retorno = equipe;
                }
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return retorno;
    } 
}
