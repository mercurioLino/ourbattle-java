/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actions.finds;

import java.util.TreeSet;

/**
 *
 * @author leona
 */
public class FindObject {
    
    public <T> T findObject(T objeto, TreeSet<T> objetos) {
        T retorno = null;
        try{
            for(T object: objetos){
                if(object.equals(objeto)){
                    retorno = object;
                }
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return retorno;
    } 
}
