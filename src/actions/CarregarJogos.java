package actions;

import classes.Jogo;
import java.util.TreeSet;

/**
 *
 * @author Luis Henrick
 */

public class CarregarJogos {

    public static void carregaComboBoxJogos(javax.swing.JComboBox cJogos, TreeSet<Jogo> jogos) {
        for (Jogo jogo : jogos) {
            cJogos.addItem(jogo);
        }
    }
}
