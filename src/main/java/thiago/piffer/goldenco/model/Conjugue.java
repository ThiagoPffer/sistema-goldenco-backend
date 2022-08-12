package thiago.piffer.goldenco.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import thiago.piffer.goldenco.model.enums.Relacionamento;
import thiago.piffer.goldenco.model.parent.Pessoa;

import javax.persistence.*;
import java.io.Serializable;

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

    public void setId(Long id) {
        this.id = id;
    }

    public Relacionamento getRelacionamento() {
        return relacionamento;
    }

    public void setRelacionamento(Relacionamento relacionamento) {
        this.relacionamento = relacionamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
