

import org.cafeteria.builder.Cafeteria;
import org.cafeteria.builder.CafeteriaBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CafeteriaBuilderTest {

    @Test
    public void deveRetornarExcecaoDeNomeVazio() {
        try {
            CafeteriaBuilder builder = new CafeteriaBuilder();
            Cafeteria cafeteria = builder
                    .setDono("João")
                    .setFuncionarios(10)
                    .setFaturamento(1000)
                    .setDespesas(500)
                    .build();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome de cafeteria invalido", e.getMessage());
        }
    }

    @Test
    public void deveRetornarExcecaoDeDonoVazio() {
        try {
            CafeteriaBuilder builder = new CafeteriaBuilder();
            Cafeteria cafeteria = builder
                    .setNome("Café do João")
                    .setFuncionarios(10)
                    .setFaturamento(1000)
                    .setDespesas(500)
                    .build();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome de dono invalido", e.getMessage());
        }
    }
}