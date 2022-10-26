package br.com.letscode.turmaitau;

import java.util.Arrays;

public class StringMain {

    public static void main(String[] args) {

        StringBuilder nomeSB = new StringBuilder();
        nomeSB.append("Rodrigo");
        nomeSB.append(" ");
        nomeSB.append("Raminelli");
        nomeSB.append(" outro sobrenome");

        String nomeStr = nomeSB.toString();

        StringBuilder nomeSB2 = nomeSB;

        nomeSB.append("mais um sobrenome");

        System.out.println("nomeStr = " + nomeStr);
        System.out.println("nomeSB = " + nomeSB.toString());
        System.out.println("nomeSB2 = " + nomeSB2.toString());


    }

}
