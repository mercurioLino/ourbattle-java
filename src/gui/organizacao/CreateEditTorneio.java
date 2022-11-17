/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui.organizacao;

import interfaces.IAtualizaTabela;
import classes.Organizacao;
import classes.OurBattle;
import classes.Torneio;
import classes.TorneioEquipe;
import classes.TorneioIndividual;
import static io.Salvar.salvar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Windows
 */
public class CreateEditTorneio extends javax.swing.JFrame {

    /**
     * Creates new form CadastroTorneio
     */
    OurBattle ourbattle;
    Organizacao organizacao;
    Torneio torneio;
    IAtualizaTabela attTabela;

    public CreateEditTorneio(OurBattle ourbattle, Organizacao organizacao, Torneio torneio, IAtualizaTabela attTabela) {
        this.ourbattle = ourbattle;
        this.organizacao = organizacao;
        this.torneio = torneio;
        this.attTabela = attTabela;
        initComponents();
        inicializaTela();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void inicializaTela() {
        if (this.torneio != null) {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            this.tNome.setText(this.torneio.getNome());
            try {
                this.dataTorneio.setDate(formatter.parse(this.torneio.getData()));
            } catch (ParseException ex) {
                Logger.getLogger(CreateEditTorneio.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.tHora.setText(this.torneio.getHora());
            this.textPremiacao.setText(this.torneio.getPremiacao());
            this.tRegras.setText(this.torneio.getRegras());
            this.cTipo.setSelectedItem(this.torneio.getTipo());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        dataTorneio = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        tHora = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tRegras = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        cTipo = new javax.swing.JComboBox<>();
        textPremiacao = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Cancelar");

        jLabel5.setText("Regras:");

        jLabel4.setText("Premiação:");

        jLabel3.setText("Data:");

        jLabel2.setText("Nome:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Torneio");

        dataTorneio.setDateFormatString("dd'/'MM'/'yyyy");

        jLabel6.setText("Horário:");

        tRegras.setColumns(20);
        tRegras.setRows(5);
        jScrollPane1.setViewportView(tRegras);

        jLabel8.setText("Tipo:");

        cTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Equipe", "Individual" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addComponent(dataTorneio, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(textPremiacao))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addComponent(jLabel6)
                                .addComponent(tHora, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataTorneio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textPremiacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String nome = this.tNome.getText();
        String data = formato.format(this.dataTorneio.getDate());
        String hora = this.tHora.getText();
        String premiacao = this.textPremiacao.getText();
        String regras = this.tRegras.getText();
        String tipo = this.cTipo.getSelectedItem().toString();
        if (nome.isBlank() || data.isBlank() || hora.isBlank() || premiacao.isBlank() || regras.isBlank() || tipo.isBlank()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos para realizar cadastro", "OurBattle.gg", JOptionPane.ERROR_MESSAGE);
        } else {
            if (this.torneio == null) {
                if (tipo.equals("Individual")) {
                    TorneioIndividual torneio = new TorneioIndividual(nome, data, hora, premiacao, regras, tipo, this.organizacao);
                    this.ourbattle.getTorneios().add(torneio);
                    this.ourbattle.getTorneiosIndividual().add(torneio);
                } else {
                    TorneioEquipe torneio = new TorneioEquipe(nome, data, hora, premiacao, regras, tipo, this.organizacao);
                    this.ourbattle.getTorneios().add(torneio);
                    this.ourbattle.getTorneiosEquipe().add(torneio);
                }

            } else {
                this.torneio.setNome(nome);
                this.torneio.setData(data);
                this.torneio.setHora(hora);
                this.torneio.setPremiacao(premiacao);
                this.torneio.setRegras(regras);
            }
        }
        this.attTabela.atualizaTabela();
        salvar(this.ourbattle);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cTipo;
    private com.toedter.calendar.JDateChooser dataTorneio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tHora;
    private javax.swing.JTextField tNome;
    private javax.swing.JTextArea tRegras;
    private javax.swing.JTextField textPremiacao;
    // End of variables declaration//GEN-END:variables
}
