package thiago.piffer.goldenco.model.parent;

import thiago.piffer.goldenco.model.enums.Sexo;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Pessoa extends Metadata{

    private String nome;
    private String telefone;
    private String email;
    private String cpf;
    private String rg;
    private Sexo sexo;

    public Pessoa(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
}
