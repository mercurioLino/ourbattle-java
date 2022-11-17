package main;

import classes.OurBattle;
import gui.Login;
import io.Carregador;
import io.LeitorGravadorObj;

public class ProjetoLabPOO {

    public static void main(String[] args) {
        try { 
            OurBattle ourbattle = (OurBattle) Carregador.carregarDados(new LeitorGravadorObj(), "./dados/ourbattle.dat");
            if (ourbattle == null) {
                ourbattle = new OurBattle();
            }
            new Login(ourbattle);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
