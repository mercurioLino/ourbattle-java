package classes;

import actions.AddObjeto;
import java.io.Serializable;
import java.util.TreeSet;

public class PartidaEquipe extends Partida implements Serializable{
    private TreeSet<Equipe> equipesParticipantes;
    private Equipe equipeVencedora;
    
    public PartidaEquipe(String data, String hora, String tipo, Torneio torneio) {
        super(data, hora, tipo, torneio);
    }

    public TreeSet<Equipe> getEquipesParticipantes() {
        return equipesParticipantes;
    }

    public void setEquipesParticipantes(TreeSet<Equipe> equipesParticipantes) {
        this.equipesParticipantes = equipesParticipantes;
    }

    public Equipe getEquipeVencedora() {
        return equipeVencedora;
    }

    public void setEquipeVencedora(Equipe equipeVencedora) {
        this.equipeVencedora = equipeVencedora;
    }
    
    public void addEquipe(Equipe equipe) {
        new AddObjeto().addObjeto(equipe, this.equipesParticipantes);
    }
    
}
