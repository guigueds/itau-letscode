package br.com.letscode.turmaitau.calcSalario;

import br.com.letscode.turmaitau.utils.ImprimirString;

import java.math.BigDecimal;

//teste git
public class CalcSalarioMain {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Rodrigo", "12345678", BigDecimal.valueOf(1500));

        BigDecimal salarioCalculado = funcionario.calcularSalario(20);

        ImprimirString.imprimir("Funcionario: " + funcionario.toString());

        ImprimirString.imprimir("Salario: " + salarioCalculado);

    }

}
