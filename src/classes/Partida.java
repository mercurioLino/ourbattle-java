package classes;

import interfaces.IReturnRow;
import java.io.Serializable;
import java.util.UUID;
import java.util.Vector;

public abstract class Partida implements Comparable<Partida>, Serializable, IReturnRow{
    private String id;
    private String data;
    private String hora;
    private String tipo;
    private Torneio torneio;
    
    public Partida(String data, String hora, String tipo, Torneio torneio) {
        UUID uuid = UUID.randomUUID();
        this.id = uuid.toString();
        this.data = data;
        this.hora = hora;
        this.tipo = tipo;
        this.torneio = torneio;
    }

    public String getId() {
        return id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Torneio getTorneio() {
        return torneio;
    }

    public void setTorneio(Torneio torneio) {
        this.torneio = torneio;
    }
    
    @Override
    public int compareTo(Partida o) {
        return this.id.compareTo(o.getId());
    }
    
    @Override
    public Vector returnRow() {
        Vector row = new Vector();
        row.add(this.id);
        row.add(this.data);
        row.add(this.hora);
        row.add(this.tipo);
        return row;
    }
}
