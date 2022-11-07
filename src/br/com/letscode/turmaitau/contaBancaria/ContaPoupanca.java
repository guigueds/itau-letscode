package br.com.letscode.turmaitau.contaBancaria;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta {

    @Override
    public void depositar(BigDecimal valor) {
        BigDecimal valorDepositado =
                valor.multiply(BigDecimal.valueOf(1.5)).add(valor);

        super.adicionarDinheiro(valorDepositado);
    }

}
