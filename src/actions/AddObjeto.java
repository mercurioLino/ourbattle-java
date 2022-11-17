/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actions;

import interfaces.IAddObjeto;
import java.util.TreeSet;

/**
 *
 * @author leona
 */
public class AddObjeto implements IAddObjeto{

    @Override
    public <T> void addObjeto(T objeto, TreeSet<T> objetos) {
        try{
            objetos.add(objeto);
        } catch(Exception e){
            e.printStackTrace();
        }
    }    
}
