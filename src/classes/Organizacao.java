package classes;

import actions.AddObjeto;
import interfaces.IAddObjeto;
import interfaces.IReturnRow;
import java.io.Serializable;
import java.util.TreeSet;
import java.util.Vector;

public class Organizacao extends Usuario implements Serializable, IReturnRow{

    private String cnpj; 
    private String razaoSocial;
    private String nomeFantasia;
    private TreeSet<Funcionario> funcionarios;
    private TreeSet<Torneio> torneios;

    public Organizacao(String cnpj, String razaoSocial, String nomeFantasia, String email, String senha, String tipo) {
        super(email, senha, tipo);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public TreeSet<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(TreeSet<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public TreeSet<Torneio> getTorneios() {
        return torneios;
    }

    public void setTorneios(TreeSet<Torneio> torneios) {
        this.torneios = torneios;
    }

    public void addFuncionario(Funcionario funcionario) {
        new AddObjeto().addObjeto(funcionario, this.funcionarios);
    }
    
    public void addTorneio(Torneio torneio) {
        new AddObjeto().addObjeto(torneio, this.torneios);
    }

    @Override
    public Vector returnRow() {
        Vector row = new Vector();
        row.add(this.getId());
        row.add(this.razaoSocial);
        row.add(this.nomeFantasia);
        row.add(this.getEmail());
        row.add(this.cnpj);
        return row;
    }
}
