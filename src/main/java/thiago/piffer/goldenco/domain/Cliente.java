package thiago.piffer.goldenco.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "clientes")
public class Cliente extends Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String observacoes;
    private Boolean possuiFilho;
    private Boolean universitario;

    @OneToOne(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;

    @OneToOne(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "id_conjugue")
    private Conjugue conjugue;

    public Cliente() {};

    public Long getId() {
        return id;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public Boolean getPossuiFilho() {
        return possuiFilho;
    }

    public Boolean getUniversitario() {
        return universitario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Conjugue getConjugue() {
        return conjugue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return id.equals(cliente.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public static class Builder extends Pessoa.PessoaBuilder<Cliente, Builder> {

        private Builder(Cliente entity) { super(entity); }
        public static Builder create() { return new Builder(new Cliente()); }

        public Builder id(Long id) {
            entity.id = id;
            return this;
        }

        public Builder observacoes(String observacoes) {
            entity.observacoes = observacoes;
            return this;
        }

        public Builder possuiFilho(Boolean possuiFilho) {
            entity.possuiFilho = possuiFilho;
            return this;
        }

        public Builder universitario(Boolean universitario) {
            entity.universitario = universitario;
            return this;
        }

        public Builder endereco(Endereco endereco) {
            entity.endereco = endereco;
            return this;
        }

        public Builder conjugue(Conjugue conjugue) {
            entity.conjugue = conjugue;
            return this;
        }

    }
}
