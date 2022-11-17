/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import actions.IAtualizaTabela;
import classes.Equipe;
import classes.Jogador;
import classes.OurBattle;
import classes.Perfil;
import static io.Salvar.salvar;
import javax.swing.JOptionPane;

/**
 *
 * @author Windows
 */
public class CreateEditPerfil extends javax.swing.JFrame {

    OurBattle ourbattle;
    Jogador jogador;
    IAtualizaTabela attTabela;
    Perfil perfil;
    public CreateEditPerfil(OurBattle ourbattle, Equipe equipe, Jogador jogador, IAtualizaTabela attTabela) {
        this.perfil = perfil;
        this.attTabela = attTabela;
        this.ourbattle = ourbattle;
        this.jogador = jogador;
        initComponents();
        this.setLocationRelativeTo(null);
        this.inicializaTela();
        this.setVisible(true);
    }

    private void inicializaTela(){
        if(this.perfil!= null){
            this.tNick.setText(this.perfil.getNickname());
            this.tElo.setText(this.perfil.getElo());
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bCancelar = new javax.swing.JButton();
        bCadastrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tElo = new javax.swing.JTextField();
        tNick = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cJogo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Criar Perfil");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Criar Perfil");

        jLabel2.setText("Nickname:");

        bCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        bCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bCadastrar.setText("Cadastrar");
        bCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadastrarActionPerformed(evt);
            }
        });

        jLabel5.setText("Elo:");

        jLabel6.setText("Jogo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(bCancelar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(bCadastrar))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(194, 194, 194))
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cJogo, javax.swing.GroupLayout.Alignment.LEADING, 0, 155, Short.MAX_VALUE)
                                .addComponent(tElo, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tNick, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tNick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tElo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cJogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCancelar)
                    .addComponent(bCadastrar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadastrarActionPerformed
        String nome = this.textNome.getText();
        String tag = this.tElo.getText();
        if(nome.isBlank() || tag.isBlank()){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos para realizar cadastro", "OurBattle.gg", JOptionPane.ERROR_MESSAGE);
        } else {
            if(this.equipe == null){
                Equipe equipe = new Equipe(nome, tag);
                equipe.getJogadores().add(jogador);
                this.ourbattle.getEquipes().add(equipe);
            } else {
                this.equipe.setNome(nome);
                this.equipe.setTag(tag);
            }
        }
        this.attTabela.atualizaTabela();
        salvar(this.ourbattle);
        this.dispose();
    }//GEN-LAST:event_bCadastrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCadastrar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JComboBox<String> cJogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField tElo;
    private javax.swing.JTextField tNick;
    // End of variables declaration//GEN-END:variables
}
