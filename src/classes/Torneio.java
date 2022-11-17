package classes;

import java.io.Serializable;
import java.util.TreeSet;
import java.util.UUID;

public class Torneio implements Comparable<Torneio>, Serializable{
    private String id;
    private String nome;
    private String data;
    private String hora;
    private String premiacao;
    private String regras;
    private int qtdParticipantes;
    private TreeSet<Partida> partidas;
    private int[] ranking = new int[3];

    public Torneio(String nome, String data, String hora, String premiacao, String regras) {
        UUID uuid = UUID.randomUUID();
        this.id = uuid.toString();
        this.nome = nome;
        this.data = data;
        this.hora = hora;
        this.premiacao = premiacao;
        this.regras = regras;
        this.qtdParticipantes = 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getPremiacao() {
        return premiacao;
    }

    public void setPremiacao(String premiacao) {
        this.premiacao = premiacao;
    }

    public int getQtdParticipantes() {
        return qtdParticipantes;
    }

    public void setQtdParticipantes(int qtdParticipantes) {
        this.qtdParticipantes = qtdParticipantes;
    }

    public String getRegras() {
        return regras;
    }

    public void setRegras(String regras) {
        this.regras = regras;
    }
    
    public int[] getRanking() {
        return ranking;
    }

    public void setRanking(int[] ranking) {
        this.ranking = ranking;
    }

    public TreeSet<Partida> getPartidas() {
        return partidas;
    }

    public void setPartidas(TreeSet<Partida> partidas) {
        this.partidas = partidas;
    }

    @Override
    public int compareTo(Torneio o) {
        return this.id.compareTo(o.getId());
    }
    
}
