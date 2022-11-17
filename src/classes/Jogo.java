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
public class Jogo implements Comparable<Jogo>, Serializable, IReturnRow{
    private String id;
    private String nome;
    private String categoria;
    private String descricao;

    public Jogo(String nome, String categoria, String descricao) {
        UUID uuid = UUID.randomUUID();
        this.id = uuid.toString();
        this.nome = nome;
        this.categoria = categoria;
        this.descricao = descricao;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int compareTo(Jogo o) {
        return this.id.compareTo(o.getId());
    }
    
    @Override
    public Vector returnRow() {
        Vector row = new Vector();
        row.add(this.id);
        row.add(this.nome);
        row.add(this.categoria);
        return row;
    }
    
}
