package br.com.letscode.turmaitau.carros;

import java.util.Arrays;

public class CarroMain {

    public static void main(String[] args) {

        //criacao do objeto carro audi
        CarroSemEncapsulamento audi = new CarroSemEncapsulamento();
        audi.modelo = "A1";
        audi.marca = "Audi";
        audi.cor = "Branco";
        audi.anoFabricacao = 2020;
        audi.placa = "XYZ12345";
        //acelerando o carro audi
        audi.acelerar();

        //criacao do objeto carro nissao
        CarroSemEncapsulamento nissan = new CarroSemEncapsulamento();
        nissan.modelo = "March";
        nissan.marca = "Nissan";
        nissan.cor = "Branco";
        nissan.anoFabricacao = 2020;
        nissan.placa = "ABC12345";
        //acelerando o carro nissan
        nissan.acelerar();
        nissan.acelerar();

        System.out.println("audi = " + audi.toString());
        System.out.println("nissan = " + nissan);

        //mudando o modelo, ou seja, mudando o estado do meu objeto
        audi.modelo = "A2";
        nissan.modelo = "Versa";

        System.out.println("audi = " + audi);
        System.out.println("nissan = " + nissan);

        System.out.println( "audi = nissan? " + nissan.equals(audi) );

        CarroSemEncapsulamento golBranco = new CarroSemEncapsulamento();
        golBranco.modelo = new String("Gol");

        CarroSemEncapsulamento golPreto = new CarroSemEncapsulamento();
        golPreto.modelo = "Gol";

        System.out.println( "modelo golBranco = golPreto? " + (golPreto.equals(golBranco) ));

        Integer i1 = 1;
        Integer ii1 = new Integer("1");

        //cuidado com a comparacao entre objetos
        System.out.println("i1 = " + i1);
        System.out.println("ii1 = " + ii1);
        System.out.println("== " + (ii1.intValue() == i1.intValue()) );
        System.out.println("== " + (ii1 == i1) );
        System.out.println("== " + ( ii1.equals(i1)) );

        audi.imprimirToString();

    }

}
