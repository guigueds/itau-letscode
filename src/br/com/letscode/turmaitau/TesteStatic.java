package br.com.letscode.turmaitau;

import br.com.letscode.turmaitau.utils.ImprimirString;

import java.util.Arrays;

public class TesteStatic {

    public static String mensagem = "";

    public static void main(String[] args) {

        TesteStatic testeStatic = new TesteStatic();
        testeStatic.mensagem = "msg1";

        TesteStatic testeStatic2 = new TesteStatic();
        testeStatic2.mensagem = "msg2";

        TesteStatic.mensagem = "msg3";

        ImprimirString.imprimir(testeStatic.mensagem);
        ImprimirString.imprimir(testeStatic2.mensagem);

    }

    private String getMensagem() {
        return "Ola mundo";
    }

}
