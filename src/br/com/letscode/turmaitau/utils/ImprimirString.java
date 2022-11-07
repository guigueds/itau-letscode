package br.com.letscode.turmaitau.utils;

import java.time.LocalDateTime;

public class ImprimirString {

    public static void imprimir(String mensagen) {
        System.out.println("mensagen = " + mensagen.toUpperCase());
    }

    public static String adicionarDataHora(String mensagem) {
        return mensagem.toLowerCase() + LocalDateTime.now();
    }

}
