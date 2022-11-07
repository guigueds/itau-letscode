package br.com.letscode.turmaitau.contaBancaria;

import java.math.BigDecimal;

public class ContaCorrente extends Conta {

    @Override
    public void depositar(BigDecimal valor) {
        super.adicionarDinheiro(valor);
    }

}
