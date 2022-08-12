package thiago.piffer.goldenco.model.dto;

import thiago.piffer.goldenco.model.enums.Relacionamento;
import thiago.piffer.goldenco.model.enums.Sexo;

public class ClienteDto {

    private Long id;
    private String nome;
    private String telefone;
    private String email;
    private String cpf;
    private String rg;
    private String observacoes;
    private Integer diametroDedo;
    private Sexo sexo;
    private Boolean possuiFilho;
    private Boolean universitario;

}
