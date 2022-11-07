package br.com.letscode.turmaitau.calcSalario;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Funcionario {

    private String nome;
    private String cpf;
    private BigDecimal salarioBase;

    public Funcionario(String nome, String cpf, BigDecimal salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }

    public BigDecimal calcularSalario(int diasTrabalhados) {

        BigDecimal salarioCalculado =
                salarioBase.divide(BigDecimal.valueOf(30))
                        .multiply(BigDecimal.valueOf(diasTrabalhados))
                        .setScale(2, RoundingMode.UP);

        return salarioCalculado;

    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public BigDecimal getSalarioBase() {
        return salarioBase;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Funcionario{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", cpf='").append(cpf).append('\'');
        sb.append(", salarioBase=").append(salarioBase);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return Objects.equals(cpf, that.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

}
