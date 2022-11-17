/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author Windows
 */
public abstract class Usuario implements Comparable<Usuario>, Serializable {
    private String id;
    private String email;
    private String senha;
    private String tipo;
    public Usuario(String email, String senha, String tipo) {
        UUID uuid = UUID.randomUUID();
        this.id = uuid.toString();
        this.email = email;
        this.senha = senha;
        this.tipo = tipo;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public int compareTo(Usuario o) {
        return this.id.compareTo(o.getId());
    }
            
}
