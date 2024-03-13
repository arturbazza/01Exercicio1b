import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaBancariaTest {

    @Test
    public void testSaque() {
        ContaBancaria conta = new ContaBancaria(100, 50, 10);
        assertTrue(conta.sacar(50));
        assertEquals(50, conta.getSaldo(), 0.01);
        assertFalse(conta.sacar(60));
        assertFalse(conta.sacar(40));
    }

    @Test
    public void testDeposito() {
        ContaBancaria conta = new ContaBancaria(100, 50, 10);
        conta.depositar(50);
        assertEquals(150, conta.getSaldo(), 0.01);
    }
}
