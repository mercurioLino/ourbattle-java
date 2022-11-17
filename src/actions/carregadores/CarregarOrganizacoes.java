package actions.carregadores;

import classes.Organizacao;
import java.util.TreeSet;

/**
 *
 * @author Luis Henrick
 */

public class CarregarOrganizacoes {

    public static void carregaComboBoxOrganizacoes(javax.swing.JComboBox cOrganizacoes, TreeSet<Organizacao> organizacoes) {
        for (Organizacao organizacao : organizacoes) {
            cOrganizacoes.addItem(organizacao.getRazaoSocial());
        }
    }
}
