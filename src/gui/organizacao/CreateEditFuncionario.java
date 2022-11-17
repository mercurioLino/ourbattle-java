/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui.organizacao;

import static io.Salvar.salvar;
import classes.Funcionario;
import classes.OurBattle;
import javax.swing.JOptionPane;
import static actions.ContainsUserByMail.containsUserByMail;
import interfaces.IAtualizaTabela;
import classes.Organizacao;

/**
 *
 * @author Windows
 */
public class CreateEditFuncionario extends javax.swing.JFrame {

    OurBattle ourbattle;
    Funcionario funcionario;
    Organizacao organizacao;
    IAtualizaTabela attTabela;
    public CreateEditFuncionario(OurBattle ourbattle, Organizacao organizacao, Funcionario funcionario, IAtualizaTabela attTabela) {
        this.attTabela = attTabela;
        this.organizacao = organizacao;
        this.funcionario = funcionario;
        this.ourbattle = ourbattle;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.inicializaTela();
    }

    private void inicializaTela(){
        if(this.funcionario!= null){
            this.textNome.setText(this.funcionario.getNome());
            this.textCPF.setText(this.funcionario.getCpf());
            this.textEmail.setText(this.funcionario.getEmail());
            this.textPassword.setText(this.funcionario.getSenha());
            this.textConfirmPassword.setText(this.funcionario.getSenha());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textPassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        textConfirmPassword = new javax.swing.JPasswordField();
        buttonSalvar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();
        textCPF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Dados do Jogador");

        jLabel2.setText("Nome:");

        jLabel3.setText("E-mail:");

        jLabel4.setText("Senha:");

        jLabel5.setText("Confirmar senha:");

        textConfirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textConfirmPasswordActionPerformed(evt);
            }
        });

        buttonSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonSalvar.setText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });

        buttonCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonCancelar.setText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        jLabel6.setText("CPF:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(buttonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textPassword)
                            .addComponent(textConfirmPassword))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(1, 1, 1)
                .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(1, 1, 1)
                .addComponent(textCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancelar)
                    .addComponent(buttonSalvar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void textConfirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textConfirmPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textConfirmPasswordActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        String nome = this.textNome.getText();
        String email = this.textEmail.getText();
        String cpf = this.textCPF.getText();
        String password = String.valueOf(this.textPassword.getPassword());
        String confirmPassword = String.valueOf(this.textConfirmPassword.getPassword());
        if (nome.isBlank() || email.isBlank() || cpf.isBlank() || password.isBlank() || confirmPassword.isBlank()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos para realizar cadastro", "OurBattle.gg", JOptionPane.ERROR_MESSAGE);
        } else if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(null, "As senhas devem ser iguais", "OurBattle.gg", JOptionPane.ERROR_MESSAGE);
        } else if(containsUserByMail(email, this.ourbattle.getUsuarios())) {
            if(funcionario == null){
                JOptionPane.showMessageDialog(null, "E-mail ja cadastrado", "OurBattle.gg", JOptionPane.ERROR_MESSAGE);
            } else if (!email.equals(this.funcionario.getEmail())){
                JOptionPane.showMessageDialog(null, "E-mail ja cadastrado", "OurBattle.gg", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            if(this.funcionario == null){
                this.funcionario = new Funcionario(cpf, nome, email, this.organizacao, password, "Funcionario");
                this.ourbattle.getFuncionarios().add(funcionario);
                this.ourbattle.getUsuarios().add(this.funcionario);
            } else{
                this.funcionario.setEmail(email);
                this.funcionario.setNome(nome);
                this.funcionario.setSenha(password);
                this.funcionario.setCpf(cpf);
            }
        }
        this.attTabela.atualizaTabela();
        salvar(this.ourbattle);
        this.dispose();
    }//GEN-LAST:event_buttonSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField textCPF;
    private javax.swing.JPasswordField textConfirmPassword;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textNome;
    private javax.swing.JPasswordField textPassword;
    // End of variables declaration//GEN-END:variables
}
