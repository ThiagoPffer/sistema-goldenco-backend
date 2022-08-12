package thiago.piffer.goldenco.model;

import thiago.piffer.goldenco.model.enums.Sexo;
import thiago.piffer.goldenco.model.parent.Metadata;
import thiago.piffer.goldenco.model.parent.Pessoa;

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
    private Integer diametroDedo;
    private Boolean possuiFilho;
    private Boolean universitario;
    private String observacoes;

    @OneToOne(mappedBy = "cliente", cascade = CascadeType.ALL)
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;

    @OneToOne(mappedBy = "cliente", cascade = CascadeType.ALL)
    @JoinColumn(name = "id_conjugue")
    private Conjugue conjugue;

    public Cliente() {};

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDiametroDedo() {
        return diametroDedo;
    }

    public void setDiametroDedo(Integer diametroDedo) {
        this.diametroDedo = diametroDedo;
    }

    public Boolean getPossuiFilho() {
        return possuiFilho;
    }

    public void setPossuiFilho(Boolean possuiFilho) {
        this.possuiFilho = possuiFilho;
    }

    public Boolean getUniversitario() {
        return universitario;
    }

    public void setUniversitario(Boolean universitario) {
        this.universitario = universitario;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Conjugue getConjugue() {
        return conjugue;
    }

    public void setConjugue(Conjugue conjugue) {
        this.conjugue = conjugue;
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
}
