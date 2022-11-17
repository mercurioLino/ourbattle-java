/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.io.Serializable;

/**
 *
 * @author Windows
 */
public class Atendimento implements Serializable{
    private Jogador jogador;
    private Organizacao organizacao;
    private String descricao;
    private String feedback;
    private boolean solucionado;

    public Atendimento(String descricao, String feedback, boolean solucionado) {
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
    
}
