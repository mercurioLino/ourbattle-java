/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import interfaces.IReturnRow;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author leonardo.gabriel
 */
public class AtualizaTabela {
    public static void atualizaTabela(Set<?> set, javax.swing.JTable tabela){
        DefaultTableModel model = (DefaultTableModel)tabela.getModel();
        model.setRowCount(0);
        Iterator it = set.iterator();
        while(it.hasNext()){
            IReturnRow current = (IReturnRow) it.next();
            Vector row = current.returnRow();
            model.addRow(row);
        }
    }
}
