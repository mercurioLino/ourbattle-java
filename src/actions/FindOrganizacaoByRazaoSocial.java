/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actions;

import classes.Organizacao;
import java.util.TreeSet;

/**
 *
 * @author leona
 */
public class FindOrganizacaoByRazaoSocial {
    public static Organizacao findOrganizacaoByRazaoSocial(String razaoSocial, TreeSet<Organizacao> organizacoes) {
        Organizacao retorno = null;
        try{
            for(Organizacao organizacao: organizacoes){
                if(organizacao.getRazaoSocial().equals(razaoSocial)){
                    retorno = organizacao;
                }
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return retorno;
    } 
}
