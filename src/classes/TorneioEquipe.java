package classes;

import actions.AddObjeto;
import java.io.Serializable;
import java.util.TreeSet;

public class TorneioEquipe extends Torneio implements Serializable{
    private TreeSet<Equipe> equipesInscritas;
    private Equipe equipeVencedora;

    public TorneioEquipe(String nome, String data, String hora, String premiacao, String regras, String tipo, Organizacao organizacao) {
        super(nome, data, hora, premiacao, regras, tipo, organizacao);
    }

    public TreeSet<Equipe> getEquipesInscritas() {
        return equipesInscritas;
    }

    public void setEquipesInscritas(TreeSet<Equipe> equipesInscritas) {
        this.equipesInscritas = equipesInscritas;
    }

    public Equipe getEquipeVencedor() {
        return equipeVencedora;
    }

    public void setEquipeVencedor(Equipe equipeVencedor) {
        this.equipeVencedora = equipeVencedor;
    }
    
    public void addEquipe(Equipe equipe) {
        new AddObjeto().addObjeto(equipe, this.equipesInscritas);
    }
}
