package exercicios;

public class Conta {
    private Integer numero=0;
    private Double saldo=0.0;
    private Double limite=0.0;

    public Double getSaldo() {
        return saldo;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void depositar(Double valor) {
        if (valor<=0) {
            throw new IllegalArgumentException("Valor deve ser maior que zero.");
        }
        else saldo = saldo + valor;
    }

    public void sacar(Double valor) {
        if (valor<=0) {
            throw new IllegalArgumentException("Valor deve ser maior que zero.");
        }
        else if (saldo+limite < valor) {
            throw new IllegalArgumentException("Voce excedeu o seu limite.");

        }
        else saldo = saldo - valor;
    }

    public void transferir(Conta conta, Double valor) {
        if (valor<=0) {
            throw new IllegalArgumentException("Valor deve ser maior que zero.");
        }
        else if (saldo+limite < valor) {
            throw new IllegalArgumentException("Voce excedeu o seu limite.");
        }
        else {
            saldo = saldo - valor;
            conta.saldo = conta.saldo + valor;
        }
    }
}
