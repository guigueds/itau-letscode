package br.com.letscode.turmaitau.cestaprodutos;

import java.util.Scanner;

public class RecuperarDadosProduto {

    public Scanner entrada = null;

    public RecuperarDadosProduto(Scanner entrada) {
        this.entrada = entrada;
    }

    public int recuperarQtde() {
        System.out.println("Digite a qtde de produtos: ");
        Integer qtdemaxprodutos = entrada.nextInt(); //NullPointerException
        return qtdemaxprodutos;
    }

    public String recuperarNome() {
        System.out.println("Digite o nome do produto: ");
        String nome = entrada.next(); //NullPointerException
        return nome;
    }

    public Double recuperarPreco() {
        System.out.println("Digite o valor do produto: ");
        Double valor = entrada.nextDouble();
        return valor;
    }

}
