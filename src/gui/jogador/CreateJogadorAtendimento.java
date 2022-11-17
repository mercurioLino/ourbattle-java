/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui.jogador;

import actions.carregadores.CarregarJogos;
import actions.carregadores.CarregarOrganizacoes;
import actions.finds.FindOrganizacaoByRazaoSocial;
import interfaces.IAtualizaTabela;
import classes.Atendimento;
import classes.Jogador;
import classes.Jogo;
import classes.Organizacao;
import classes.OurBattle;
import classes.Perfil;
import static io.Salvar.salvar;
import javax.swing.JOptionPane;

/**
 *
 * @author Windows
 */
public class CreateJogadorAtendimento extends javax.swing.JFrame {

    OurBattle ourbattle;
    Jogador jogador;
    IAtualizaTabela attTabela;
    public CreateJogadorAtendimento(OurBattle ourbattle, Jogador jogador, IAtualizaTabela attTabela) {
        this.ourbattle = ourbattle;
        this.jogador = jogador;
        this.attTabela = attTabela;
        initComponents();
        CarregarOrganizacoes.carregaComboBoxOrganizacoes(cOrganizacao, this.ourbattle.getOrganizacoes());
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bCancelar = new javax.swing.JButton();
        bEnviar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cOrganizacao = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tOcorrido = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Criar Perfil");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Atendimento");

        bCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        bEnviar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bEnviar.setText("Enviar");
        bEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEnviarActionPerformed(evt);
            }
        });

        jLabel6.setText("Organização:");

        jLabel7.setText("Descrição do ocorrido:");

        tOcorrido.setColumns(20);
        tOcorrido.setRows(5);
        jScrollPane1.setViewportView(tOcorrido);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bEnviar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(cOrganizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cOrganizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCancelar)
                    .addComponent(bEnviar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEnviarActionPerformed
        String ocorrido = this.tOcorrido.getText();
        Organizacao organizacao = FindOrganizacaoByRazaoSocial.findOrganizacaoByRazaoSocial(this.cOrganizacao.getSelectedItem().toString(), this.ourbattle.getOrganizacoes());
        if(ocorrido.isBlank()){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos para realizar cadastro", "OurBattle.gg", JOptionPane.ERROR_MESSAGE);
        } else {
            Atendimento atendimento = new Atendimento(this.jogador, organizacao, ocorrido);
            this.ourbattle.getAtendimentos().add(atendimento);
            this.jogador.getAtendimentos().add(atendimento);
        }
        this.attTabela.atualizaTabela();
        System.out.println(this.ourbattle.getAtendimentos().size());
        salvar(this.ourbattle);
        this.dispose();
    }//GEN-LAST:event_bEnviarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bEnviar;
    private javax.swing.JComboBox<String> cOrganizacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea tOcorrido;
    // End of variables declaration//GEN-END:variables
}
