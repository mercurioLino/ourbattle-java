/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui.jogador;

import actions.AtualizaTabela;
import actions.finds.FindEquipeById;
import interfaces.IAtualizaTabela;
import classes.Equipe;
import classes.Jogador;
import classes.OurBattle;
import static io.Salvar.salvar;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Windows
 */
public class MenuEquipesJogador extends javax.swing.JFrame implements IAtualizaTabela {

    OurBattle ourbattle;
    Jogador jogador;

    public MenuEquipesJogador(OurBattle ourbattle, Jogador jogador) {
        this.ourbattle = ourbattle;
        this.jogador = jogador;
        initComponents();
        this.inicializaTela();
        this.atualizaTabela();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void inicializaTela() {
        this.tabelaEquipes.getColumnModel().getColumn(0).setMinWidth(0);
        this.tabelaEquipes.getColumnModel().getColumn(0).setMaxWidth(0);

        this.tabelaEquipes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.tabelaEquipes.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(tabelaEquipes.getSelectedRowCount() > 0){
                    Equipe equipe = FindEquipeById.findEquipeById((String) tabelaEquipes.getValueAt(tabelaEquipes.getSelectedRow(), 0), ourbattle.getEquipes());
                    if (equipe.getJogadores().contains(jogador)) {
                        buttonAlterarEquipe.setEnabled(true);
                        buttonRemoverEquipe.setEnabled(true);
                    } else {
                        buttonAlterarEquipe.setEnabled(false);
                        buttonRemoverEquipe.setEnabled(false);
                    }
                }
            }
        });
    }

    @Override
    public void atualizaTabela() {
        AtualizaTabela.atualizaTabela(this.ourbattle.getEquipes(), this.tabelaEquipes);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonCreateEquipe = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaEquipes = new javax.swing.JTable();
        buttonRemoverEquipe = new javax.swing.JButton();
        buttonSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        buttonAlterarEquipe = new javax.swing.JButton();
        buttonInscrever = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        buttonCreateEquipe.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonCreateEquipe.setText("Criar Equipe");
        buttonCreateEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCreateEquipeActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ranking de Equipes"));

        tabelaEquipes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Tag", "Nome", "Pontua????o"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaEquipes.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tabelaEquipes);
        tabelaEquipes.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tabelaEquipes.getColumnModel().getColumnCount() > 0) {
            tabelaEquipes.getColumnModel().getColumn(0).setMinWidth(0);
            tabelaEquipes.getColumnModel().getColumn(0).setPreferredWidth(0);
            tabelaEquipes.getColumnModel().getColumn(0).setMaxWidth(0);
            tabelaEquipes.getColumnModel().getColumn(1).setResizable(false);
            tabelaEquipes.getColumnModel().getColumn(2).setResizable(false);
            tabelaEquipes.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonRemoverEquipe.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonRemoverEquipe.setText("Remover Equipe");
        buttonRemoverEquipe.setEnabled(false);
        buttonRemoverEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoverEquipeActionPerformed(evt);
            }
        });

        buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit.png"))); // NOI18N
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Sair");

        buttonAlterarEquipe.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonAlterarEquipe.setText("Alterar Equipe");
        buttonAlterarEquipe.setEnabled(false);
        buttonAlterarEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlterarEquipeActionPerformed(evt);
            }
        });

        buttonInscrever.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonInscrever.setText("Inscrever-se em uma Equipe");
        buttonInscrever.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInscreverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel1)))
                        .addGap(285, 285, 285)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonCreateEquipe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonInscrever, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonAlterarEquipe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonRemoverEquipe)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonCreateEquipe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonInscrever))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRemoverEquipe)
                    .addComponent(buttonAlterarEquipe))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonSairActionPerformed

    private void buttonCreateEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCreateEquipeActionPerformed
        new CreateEditEquipe(this.ourbattle, null, this.jogador, this);
    }//GEN-LAST:event_buttonCreateEquipeActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        salvar(ourbattle);
    }//GEN-LAST:event_formWindowClosed

    private void buttonRemoverEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoverEquipeActionPerformed
        Equipe equipe = FindEquipeById.findEquipeById((String) this.tabelaEquipes.getValueAt(this.tabelaEquipes.getSelectedRow(), 0), this.ourbattle.getEquipes());
        this.ourbattle.getEquipes().remove(equipe);
        this.atualizaTabela();
        salvar(ourbattle);
    }//GEN-LAST:event_buttonRemoverEquipeActionPerformed

    private void buttonAlterarEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarEquipeActionPerformed
        Equipe equipe = FindEquipeById.findEquipeById((String) this.tabelaEquipes.getValueAt(this.tabelaEquipes.getSelectedRow(), 0), this.ourbattle.getEquipes());
        new CreateEditEquipe(this.ourbattle, equipe, null, this);
    }//GEN-LAST:event_buttonAlterarEquipeActionPerformed

    private void buttonInscreverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInscreverActionPerformed
        new InscreverJogadorEmEquipe(this.ourbattle, this.jogador);
    }//GEN-LAST:event_buttonInscreverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAlterarEquipe;
    private javax.swing.JButton buttonCreateEquipe;
    private javax.swing.JButton buttonInscrever;
    private javax.swing.JButton buttonRemoverEquipe;
    private javax.swing.JButton buttonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaEquipes;
    // End of variables declaration//GEN-END:variables
}
