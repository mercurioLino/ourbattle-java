/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actions;

import classes.Jogador;
import classes.Usuario;
import java.util.TreeSet;

/**
 *
 * @author leona
 */
public class ContainsUserByMail {
    public static boolean containsJogadorByMail(String email, TreeSet<Usuario> usuarios) {
        boolean retorno = false;
        try{
            for(Usuario usuario: usuarios){
                if(usuario.getEmail().equals(email)){
                    retorno = true;
                }
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return retorno;
    } 
}
