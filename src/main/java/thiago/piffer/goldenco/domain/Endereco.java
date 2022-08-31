package thiago.piffer.goldenco.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import thiago.piffer.goldenco.domain.util.BaseBuilder;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "enderecos")
public class Endereco implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cep;
    private String cidade;
    private String estado;
    private String pais;
    private String logradouro;
    private String numero;
    private String complemento;

    @JsonIgnore
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    public Endereco(){};

    public Long getId() {
        return id;
    }

    public String getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getPais() {
        return pais;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Endereco endereco = (Endereco) o;
        return id.equals(endereco.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public static class Builder extends BaseBuilder<Endereco> {

        private Builder(Endereco entity) { super(entity); }
        public static Builder create() { return new Builder(new Endereco()); }

        public Builder id(Long id) {
            entity.id = id;
            return this;
        }

        public Builder cep(String cep) {
            entity.cep = cep;
            return this;
        }

        public Builder cidade(String cidade) {
            entity.cidade = cidade;
            return this;
        }

        public Builder estado(String estado) {
            entity.estado = estado;
            return this;
        }

        public Builder pais(String pais) {
            entity.pais = pais;
            return this;
        }

        public Builder logradouro(String logradouro) {
            entity.logradouro = logradouro;
            return this;
        }

        public Builder numero(String numero) {
            entity.numero = numero;
            return this;
        }

        public Builder complemento(String complemento) {
            entity.complemento = complemento;
            return this;
        }

        public Builder cliente(Cliente cliente) {
            entity.cliente = cliente;
            return this;
        }

        @Override
        public void beforeBuild() {}
    }
}
