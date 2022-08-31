package thiago.piffer.goldenco.domain;

import org.junit.jupiter.api.Test;
import thiago.piffer.goldenco.domain.enums.Sexo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

class ClienteTest {

    private final Long LONG = 1L;
    private final String STRING = "STRING";
    private final Sexo SEXO = Sexo.MASCULINO;
    private final Float FLOAT = 1F;
    private final Boolean BOOLEAN = Boolean.TRUE;
    private final Endereco ENDERECO = mock(Endereco.class);
    private final Conjugue CONJUGUE = mock(Conjugue.class);

    @Test
    public void testarCliente() {
        Cliente cliente = Cliente.Builder.create()
                .id(LONG)
                .nome(STRING)
                .telefone(STRING)
                .email(STRING)
                .cpf(STRING)
                .rg(STRING)
                .observacoes(STRING)
                .sexo(SEXO)
                .diametroDedo(FLOAT)
                .possuiFilho(BOOLEAN)
                .universitario(BOOLEAN)
                .endereco(ENDERECO)
                .conjugue(CONJUGUE)
                .build();

        assertEquals(LONG, cliente.getId());
        assertEquals(STRING, cliente.getNome());
        assertEquals(STRING, cliente.getTelefone());
        assertEquals(STRING, cliente.getEmail());
        assertEquals(STRING, cliente.getCpf());
        assertEquals(STRING, cliente.getRg());
        assertEquals(STRING, cliente.getObservacoes());
        assertEquals(SEXO, cliente.getSexo());
        assertEquals(FLOAT, cliente.getDiametroDedo());
        assertEquals(BOOLEAN, cliente.getPossuiFilho());
        assertEquals(BOOLEAN, cliente.getUniversitario());
        assertEquals(ENDERECO, cliente.getEndereco());
        assertEquals(CONJUGUE, cliente.getConjugue());
    }
}