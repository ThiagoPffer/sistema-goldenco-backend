package thiago.piffer.goldenco.domain;

import org.junit.jupiter.api.Test;
import thiago.piffer.goldenco.domain.enums.Relacionamento;
import thiago.piffer.goldenco.domain.enums.Sexo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

class ConjugueTest {

    private final Long LONG = 1L;
    private final String STRING = "STRING";
    private final Sexo SEXO = Sexo.MASCULINO;
    private final Float FLOAT = 1F;
    private final Relacionamento RELACIONAMENTO = Relacionamento.CASADOS;
    private final Cliente CLIENTE = mock(Cliente.class);

    @Test
    public void testarConjugue() {
        Conjugue conjugue = Conjugue.Builder.create()
                .id(LONG)
                .nome(STRING)
                .telefone(STRING)
                .email(STRING)
                .cpf(STRING)
                .rg(STRING)
                .diametroDedo(FLOAT)
                .sexo(SEXO)
                .relacionamento(RELACIONAMENTO)
                .cliente(CLIENTE)
                .build();

        assertEquals(LONG, conjugue.getId());
        assertEquals(STRING, conjugue.getNome());
        assertEquals(STRING, conjugue.getTelefone());
        assertEquals(STRING, conjugue.getEmail());
        assertEquals(STRING, conjugue.getCpf());
        assertEquals(STRING, conjugue.getRg());
        assertEquals(FLOAT, conjugue.getDiametroDedo());
        assertEquals(SEXO, conjugue.getSexo());
        assertEquals(RELACIONAMENTO, conjugue.getRelacionamento());
        assertEquals(CLIENTE, conjugue.getCliente());
    }

}