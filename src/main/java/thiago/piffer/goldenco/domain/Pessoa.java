package thiago.piffer.goldenco.domain;

import thiago.piffer.goldenco.domain.enums.Sexo;
import thiago.piffer.goldenco.domain.util.BaseBuilder;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
public class Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;

    protected String nome;
    protected String telefone;
    protected String email;
    protected String cpf;
    protected String rg;
    protected Float diametroDedo;
    protected Sexo sexo;

    public Pessoa() {};

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public Float getDiametroDedo() {
        return diametroDedo;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public static class PessoaBuilder<T extends Pessoa, B extends PessoaBuilder<T, B>> extends BaseBuilder<T> {

        public PessoaBuilder(T entity) { super(entity); }

        public B nome(String nome) {
            entity.nome = nome;
            return self();
        }

        public B telefone(String telefone) {
            entity.telefone = telefone;
            return self();
        }

        public B email(String email) {
            entity.email = email;
            return self();
        }

        public B cpf(String cpf) {
            entity.cpf = cpf;
            return self();
        }

        public B rg(String rg) {
            entity.rg = rg;
            return self();
        }

        public B diametroDedo(Float diametroDedo) {
            entity.diametroDedo = diametroDedo;
            return self();
        }

        public B sexo(Sexo sexo) {
            entity.sexo = sexo;
            return self();
        }

        @Override
        public void beforeBuild() {}

        @SuppressWarnings("unchecked")
        final B self() {
            return (B) this;
        }
    }
}
