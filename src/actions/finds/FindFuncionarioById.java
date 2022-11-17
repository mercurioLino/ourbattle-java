/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actions.finds;

import classes.Funcionario;
import java.util.TreeSet;
import java.util.UUID;

/**
 *
 * @author leona
 */
public class FindFuncionarioById {
    public static Funcionario findFuncionarioById(String id, TreeSet<Funcionario> funcionarios) {
        Funcionario retorno = null;
        try{
            for(Funcionario funcionario: funcionarios){
                if(funcionario.getId().equals(id)){
                    retorno = funcionario;
                }
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return retorno;
    }
}
