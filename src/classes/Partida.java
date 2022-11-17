package classes;

import java.io.Serializable;
import java.util.UUID;

public class Partida implements Comparable<Partida>, Serializable{
    private String id;
    private String data;
    private String hora;
    
    public Partida(String data, String hora) {
        UUID uuid = UUID.randomUUID();
        this.id = uuid.toString();
        this.data = data;
        this.hora = hora;
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

    
    @Override
    public int compareTo(Partida o) {
        return this.id.compareTo(o.getId());
    }
    
}
