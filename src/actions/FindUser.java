/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actions;

import classes.Usuario;
import java.util.TreeSet;

/**
 *
 * @author leona
 */
public class FindUser {
    public static Usuario findUser(String email, String senha, TreeSet<Usuario> usuarios) {
        Usuario retorno = null;
        try{
            for(Usuario usuario: usuarios){
                if(usuario.getEmail().equals(email) && usuario.getEmail().equals(senha)){
                    retorno = usuario;
                }
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return retorno;
    } 
}
