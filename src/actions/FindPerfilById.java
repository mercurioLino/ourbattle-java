/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actions;

import classes.Perfil;
import java.util.TreeSet;

/**
 *
 * @author leona
 */
public class FindPerfilById {
    public static Perfil findPerfilById(String id, TreeSet<Perfil> perfis) {
        Perfil retorno = null;
        try{
            for(Perfil perfil: perfis){
                if(perfil.getId().equals(id)){
                    retorno = perfil;
                }
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return retorno;
    } 
}
