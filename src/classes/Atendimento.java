/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import interfaces.IReturnRow;
import java.io.Serializable;
import java.util.UUID;
import java.util.Vector;

/**
 *
 * @author Windows
 */
public class Atendimento implements Serializable, IReturnRow{
    private String id;
    private Jogador jogador;
    private Organizacao organizacao;
    private String descricao;
    private String feedback;
    private Funcionario funcionario;
    private boolean solucionado;

    public Atendimento(String descricao, String feedback, boolean solucionado) {
        UUID uuid = UUID.randomUUID();
        this.id = uuid.toString();
        this.descricao = descricao;
        this.feedback = feedback;
        this.solucionado = solucionado;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getFeedback() {
        return feedback;
    }

    public boolean isSolucionado() {
        return solucionado;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public void setSolucionado(boolean solucionado) {
        this.solucionado = solucionado;
    }

    @Override
    public Vector returnRow() {
        Vector row = new Vector();
        row.add(this.id);
        row.add(this.jogador.getNome());
        row.add(this.organizacao.getRazaoSocial());
        row.add(this.solucionado);
        return row;
    }
    
    
    
}
