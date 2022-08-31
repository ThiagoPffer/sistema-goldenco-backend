package thiago.piffer.goldenco.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import thiago.piffer.goldenco.domain.enums.Relacionamento;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "conjugues")
public class Conjugue extends Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Relacionamento relacionamento;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    public Conjugue() {
    }

    public Long getId() {
        return id;
    }

    public Relacionamento getRelacionamento() {
        return relacionamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conjugue conjugue = (Conjugue) o;
        return id.equals(conjugue.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public static class Builder extends Pessoa.PessoaBuilder<Conjugue, Builder> {

        private Builder(Conjugue entity) { super(entity); }
        public static Builder create() { return new Builder(new Conjugue()); }

        public Builder id(Long id) {
            entity.id = id;
            return this;
        }

        public Builder relacionamento(Relacionamento relacionamento) {
            entity.relacionamento = relacionamento;
            return this;
        }

        public Builder cliente(Cliente cliente) {
            entity.cliente = cliente;
            return this;
        }

    }
}
