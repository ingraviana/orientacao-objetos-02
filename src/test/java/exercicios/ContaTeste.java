package exercicios;

import exercicios.Conta;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaTeste {
    private Conta conta1;

    @BeforeEach
    public void beforeEach() {
        conta1 = new Conta();
        conta1.setNumero(1);
        conta1.depositar(100.00);
    }

    @AfterEach
    public void afterEach() {
        conta1 = null;
    }

    @Test
    public void criarObjetoConta() {
        assertNotNull(conta1);
    }

    @Test
    public void presencaAtributos() {
        assertNotNull(conta1.getNumero());
        assertNotNull(conta1.getSaldo());
    }

    @Test
    public void metodoSetNumero() {
        conta1.setNumero(2);
        assertEquals(2, conta1.getNumero());
    }
    @Test
    public void metodoGetLimite() {
        conta1.setLimite(300.0);
        assertEquals(300.0, conta1.getLimite());
    }

    @Test
    public void metodoSetLimite() {
        conta1.setLimite(200.0);
        assertEquals(200.0, conta1.getLimite());
    }

    @Test
    public void metodoDepositar() {
        conta1.depositar(200.0);
        assertEquals(300.0, conta1.getSaldo());

    }

    @Test
    public void metodoDepositarValorInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> conta1.depositar(-200.0));
        assertEquals("Valor deve ser maior que zero.", exception.getMessage());
    }

    @Test
    public void metodoSacar() {
        conta1.sacar(50.0);
        assertEquals(50.0, conta1.getSaldo());

    }

    @Test
    public void metodoSacarValorInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> conta1.sacar(-200.0));
        assertEquals("Valor deve ser maior que zero.", exception.getMessage());

    }

    @Test
    public void metodoSacarSaldoInsuficiente() {
        conta1.setLimite(100.0);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> conta1.sacar(250.0));
        assertEquals("Voce excedeu o seu limite.", exception.getMessage());

    }

    @Test
    public void metodoTransferir() {
        Conta conta2 = new Conta();
        conta1.transferir(conta2,30.0);
        assertEquals(70.0, conta1.getSaldo());
        assertEquals(30.0, conta2.getSaldo());

    }

    @Test
    public void metodoTransferirValorInvalido() {
        Conta conta2 = new Conta();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> conta1.transferir(conta2,-30.0));
        assertEquals("Valor deve ser maior que zero.", exception.getMessage());

    }

    @Test
    public void metodoTransferirSaldoInsuficiente() {
        Conta conta2 = new Conta();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> conta1.transferir(conta2,250.0));
        assertEquals("Voce excedeu o seu limite.", exception.getMessage());

    }
}
