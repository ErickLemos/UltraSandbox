package com.ultrasandbox.planetas.business.querys;

import com.ultrasandbox.planetas.core.repository.PlanetaRepository;
import com.ultrasandbox.planetas.domain.models.Planeta;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class BuscarPlanetaPorIdQueryTest {

    @InjectMocks
    private BuscarPlanetaPorIdQuery query;

    @Mock
    private PlanetaRepository repository;

    @Test
    @DisplayName("teste com valores válidos")
    void test() {
        var planeta = Planeta.builder()
                .id("id").nome("nome")
                .build();

        when(repository.buscarPorId(any(String.class))).thenReturn(planeta);
        var planetaQuery = query.process("id");

        assertEquals(planeta.getId(), planetaQuery.getId());
        assertEquals(planeta.getNome(), planetaQuery.getNome());
    }

    @Test
    @DisplayName("teste com valor id inválido")
    void testComIdInvalido() {
        assertThrows(IllegalArgumentException.class,
                () -> query.process("id id"));
    }

}