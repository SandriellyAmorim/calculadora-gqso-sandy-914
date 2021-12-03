package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;

public class SomaTest {
    Soma soma;

    @BeforeEach
    public void setup() {
        soma = new Soma();
    }

    @Test
    public void testeSomaSucesso() {
        assertEquals(3, soma.soma("1", "2"));
    }

    @Test
    public void testeSomaRecebeUmaString() {
        assertThrows(IllegalArgumentException.class, ()->{
            soma.soma("1", "y");
        });
    }

    @Test
    public void testeSomaRecebeDuasString() {
        assertThrows(IllegalArgumentException.class, ()->{
            soma.soma("x", "y");
        });
    }
}