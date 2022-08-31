package thiago.piffer.goldenco.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

class EnderecoTest {

    private final Long LONG = 1L;
    private final String STRING = "STRING";
    private final Cliente CLIENTE = mock(Cliente.class);

    @Test
    public void testarEndereco() {
        Endereco endereco = Endereco.Builder.create()
                .id(LONG)
                .cep(STRING)
                .cidade(STRING)
                .estado(STRING)
                .pais(STRING)
                .logradouro(STRING)
                .numero(STRING)
                .complemento(STRING)
                .cliente(CLIENTE)
                .build();

        assertEquals(LONG, endereco.getId());
        assertEquals(STRING, endereco.getCep());
        assertEquals(STRING, endereco.getCidade());
        assertEquals(STRING, endereco.getEstado());
        assertEquals(STRING, endereco.getPais());
        assertEquals(STRING, endereco.getLogradouro());
        assertEquals(STRING, endereco.getNumero());
        assertEquals(STRING, endereco.getComplemento());
        assertEquals(CLIENTE, endereco.getCliente());
    }

}