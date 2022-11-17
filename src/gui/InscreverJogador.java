/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import actions.CarregarTorneiosIndividual;
import actions.FindTorneioIndividualByNome;
import classes.Jogador;
import classes.OurBattle;
import classes.TorneioIndividual;
import static io.Salvar.salvar;

/**
 *
 * @author Windows
 */
public class InscreverJogador extends javax.swing.JFrame {

    OurBattle ourbattle; 
    Jogador jogador;
    public InscreverJogador(OurBattle ourbattle, Jogador jogador) {
        this.ourbattle = ourbattle;
        this.jogador = jogador;
        initComponents();
        this.inicializaTela();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void inicializaTela(){
        CarregarTorneiosIndividual.carregaComboBoxTorneiosIndividual(this.comboTorneio, this.ourbattle.getTorneiosIndividual());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bInscrever = new javax.swing.JButton();
        bSair = new javax.swing.JButton();
        comboTorneio = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inscrever Equipe");

        bInscrever.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bInscrever.setText("Inscrever-se");
        bInscrever.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInscreverActionPerformed(evt);
            }
        });

        bSair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bSair.setText("Cancelar");
        bSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSairActionPerformed(evt);
            }
        });

        comboTorneio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTorneioActionPerformed(evt);
            }
        });

        jLabel5.setText("Selecione um Torneio:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 72, Short.MAX_VALUE)
                        .addComponent(bSair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bInscrever))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboTorneio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 132, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboTorneio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bInscrever)
                    .addComponent(bSair))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_bSairActionPerformed

    private void comboTorneioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTorneioActionPerformed
        
    }//GEN-LAST:event_comboTorneioActionPerformed

    private void bInscreverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInscreverActionPerformed
        TorneioIndividual torneio = FindTorneioIndividualByNome.findTorneioIndividualByNome((String) this.comboTorneio.getSelectedItem(), this.ourbattle.getTorneiosIndividual());
        torneio.getJogadoresInscritos().add(this.jogador);
        salvar(this.ourbattle);
    }//GEN-LAST:event_bInscreverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bInscrever;
    private javax.swing.JButton bSair;
    private javax.swing.JComboBox<String> comboTorneio;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
