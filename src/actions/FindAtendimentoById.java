/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actions;

import classes.Atendimento;
import java.util.TreeSet;

/**
 *
 * @author leona
 */
public class FindAtendimentoById {
    public static Atendimento findAtendimentoById(String id, TreeSet<Atendimento> atendimentos) {
        Atendimento retorno = null;
        try{
            for(Atendimento atendimento: atendimentos){
                if(atendimento.getId().equals(id)){
                    retorno = atendimento;
                }
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return retorno;
    } 
}
