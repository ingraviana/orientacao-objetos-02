package exercicios;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CorrentistaTeste {

    @Test
    public void criarObjetoCorrentista(){
        Correntista c1 = new Correntista();
        assertNotNull(c1);
    }

    @Test
    public void metodoGetCodigo() {
        Correntista c1 = new Correntista();
        c1.setCodigo("0123");
        assertEquals("0123", c1.getCodigo());
    }

    @Test
    public void metodoGetNome() {
        Correntista c1 = new Correntista();
        c1.setNome("July");
        assertEquals("July", c1.getNome());
    }

    @Test
    public void metodoGetEmail() {
        Correntista c1 = new Correntista();
        c1.setEmail("july@email.com");
        assertEquals("july@email.com", c1.getEmail());
    }

    @Test
    public void metodoGetTelefone() {
        Correntista c1 = new Correntista();
        c1.setTelefone("0123 - 5567");
        assertEquals("0123 - 5567", c1.getTelefone());
    }

    @Test
    public void metodoSetCodigo() {
        Correntista c1 = new Correntista();
        c1.setCodigo("0123");
        assertEquals("0123", c1.getCodigo());
    }

    @Test
    public void metodoSetNome() {
        Correntista c1 = new Correntista();
        c1.setNome("July");
        assertEquals("July", c1.getNome());
    }

    @Test
    public void metodoSetEmail() {
        Correntista c1 = new Correntista();
        c1.setEmail("july@email.com");
        assertEquals("july@email.com", c1.getEmail());
    }

    @Test
    public void metodoSetTelefone() {
        Correntista c1 = new Correntista();
        c1.setTelefone("0123 - 4567");
        assertEquals("0123 - 4567", c1.getTelefone());
    }


    @Test
    public void presencaAtributoCodigo(){
        Correntista c1 = new Correntista();
        c1.setCodigo("123");
        assertNotNull(c1.getCodigo());
    }

    @Test
    public void presencaAtributoNome(){
        Correntista c1 = new Correntista();
        c1.setNome("July");
        assertNotNull(c1.getNome());
    }

    @Test
    public void presencaAtributoEmail(){
        Correntista c1 = new Correntista();
        c1.setEmail("july@email.com");
        assertNotNull(c1.getEmail());
    }

    @Test
    public void presencaAtributoTelefone(){
        Correntista c1 = new Correntista();
        c1.setTelefone("0123 - 4567");
        assertNotNull(c1.getTelefone());
    }
}
