/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import actions.AtualizaTabela;
import actions.FindPerfilById;
import actions.IAtualizaTabela;
import classes.Jogador;
import classes.OurBattle;
import classes.Perfil;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Windows
 */
public class JogadorPerfil extends javax.swing.JFrame implements IAtualizaTabela{

    /**
     * Creates new form TorneiosOrganizador
     */
    OurBattle ourbattle;
    Jogador jogador;
    Perfil perfil;
    public JogadorPerfil(OurBattle ourbattle, Jogador jogador) {
        this.ourbattle = ourbattle;
        this.jogador = jogador;
        initComponents();
        this.atualizaTabela();
        this.inicializaTela();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
        private void inicializaTela() {
            
        this.tabelaPerfis.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(tabelaPerfis.getSelectedRowCount() > 0){
                    Perfil perfil = FindPerfilById.findPerfilById((String) tabelaPerfis.getValueAt(tabelaPerfis.getSelectedRow(), 0), ourbattle.getPerfis());
                    if (perfil.getJogador().equals(jogador)) {
                        bAlterarPerfil.setEnabled(true);
                        bRemoverPerfil.setEnabled(true);
                    } else {
                        bAlterarPerfil.setEnabled(false);
                        bRemoverPerfil.setEnabled(false);
                    }
                }
            }
        });
    }
    
    @Override
    public void atualizaTabela() {
        AtualizaTabela.atualizaTabela(this.ourbattle.getPerfis(), this.tabelaPerfis);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPerfis = new javax.swing.JTable();
        bAlterarPerfil = new javax.swing.JButton();
        bSair = new javax.swing.JButton();
        bRemoverPerfil = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        bAddPerfil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Perfis");

        tabelaPerfis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Jogador", "Nickname", "Elo", "Jogo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaPerfis.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tabelaPerfis);
        tabelaPerfis.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tabelaPerfis.getColumnModel().getColumnCount() > 0) {
            tabelaPerfis.getColumnModel().getColumn(0).setMinWidth(0);
            tabelaPerfis.getColumnModel().getColumn(0).setPreferredWidth(0);
            tabelaPerfis.getColumnModel().getColumn(0).setMaxWidth(0);
            tabelaPerfis.getColumnModel().getColumn(1).setResizable(false);
            tabelaPerfis.getColumnModel().getColumn(2).setResizable(false);
            tabelaPerfis.getColumnModel().getColumn(3).setResizable(false);
            tabelaPerfis.getColumnModel().getColumn(4).setResizable(false);
        }

        bAlterarPerfil.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bAlterarPerfil.setText("Editar");
        bAlterarPerfil.setEnabled(false);
        bAlterarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAlterarPerfilActionPerformed(evt);
            }
        });

        bSair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bSair.setText("Sair");
        bSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSairActionPerformed(evt);
            }
        });

        bRemoverPerfil.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bRemoverPerfil.setText("Remover");
        bRemoverPerfil.setEnabled(false);
        bRemoverPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRemoverPerfilActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtros"));

        jLabel1.setText("Nome do Jogador:");

        jLabel2.setText("Jogo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Perfis");

        bAddPerfil.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bAddPerfil.setText("Novo Perfil");
        bAddPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddPerfilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bAddPerfil))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bAlterarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bRemoverPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bSair, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(bAddPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAlterarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSair, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bRemoverPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAddPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddPerfilActionPerformed
        new CreateEditPerfil(this.ourbattle, null, this.jogador, this);
    }//GEN-LAST:event_bAddPerfilActionPerformed

    private void bSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_bSairActionPerformed

    private void bRemoverPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRemoverPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bRemoverPerfilActionPerformed

    private void bAlterarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAlterarPerfilActionPerformed
        Perfil perfil = FindPerfilById.findPerfilById((String) tabelaPerfis.getValueAt(tabelaPerfis.getSelectedRow(), 0), ourbattle.getPerfis());
        new CreateEditPerfil(this.ourbattle, perfil, this.jogador, this);
    }//GEN-LAST:event_bAlterarPerfilActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAddPerfil;
    private javax.swing.JButton bAlterarPerfil;
    private javax.swing.JButton bRemoverPerfil;
    private javax.swing.JButton bSair;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tabelaPerfis;
    // End of variables declaration//GEN-END:variables
}
