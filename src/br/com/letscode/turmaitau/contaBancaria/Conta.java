package br.com.letscode.turmaitau.contaBancaria;

import java.math.BigDecimal;

public abstract class Conta {

    private String numero;
    private BigDecimal saldo = BigDecimal.ZERO;

    protected abstract void depositar(BigDecimal valor);

    protected void adicionarDinheiro(BigDecimal valor) {
        this.saldo = saldo.add(valor);
    }

    public void sacar() {

    }

    public void transferir() {

    }

}
