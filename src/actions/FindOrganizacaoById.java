/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actions;

import classes.Organizacao;
import java.util.TreeSet;
import java.util.UUID;

/**
 *
 * @author leona
 */
public class FindOrganizacaoById {
    public static Organizacao findOrganizacaoById(String id, TreeSet<Organizacao> organizacoes) {
        Organizacao retorno = null;
        try{
            for(Organizacao organizacao: organizacoes){
                if(organizacao.getId().equals(id)){
                    retorno = organizacao;
                }
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return retorno;
    } 
}
