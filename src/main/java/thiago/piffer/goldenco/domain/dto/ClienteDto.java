package thiago.piffer.goldenco.domain.dto;

import thiago.piffer.goldenco.domain.enums.Sexo;

public class ClienteDto {

    private Long id;
    private String nome;
    private String telefone;
    private String email;
    private String cpf;
    private String rg;
    private String observacoes;
    private Sexo sexo;
    private Float diametroDedo;
    private Boolean possuiFilho;
    private Boolean universitario;

    public Long getId() {
        return id;
    }

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

    public String getObservacoes() {
        return observacoes;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public Float getDiametroDedo() {
        return diametroDedo;
    }

    public Boolean getPossuiFilho() {
        return possuiFilho;
    }

    public Boolean getUniversitario() {
        return universitario;
    }
}
