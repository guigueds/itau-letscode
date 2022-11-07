package br.com.letscode.turmaitau.carros;

import br.com.letscode.turmaitau.utils.ImprimirString;

public class EncapsulamentoCarroMain {

    public static void main(String[] args) {

        //criacao do objeto carro audi
        Carro audi = new Carro(
                "Audi",
                "A1",
                "Branco",
                2022
        );

        audi.ligar();
        audi.acelerar();
        audi.acelerar();

        System.out.println("audi = " + audi);

        audi.desligar();

        System.out.println("audi = " + audi);

        Carro nissan = new Carro(
                "Nissan",
                "Versa",
                "ABC1234",
                "Cinza",
                2022
        );

        System.out.println("nissan = " + nissan);

        Carro gol = new Carro(
                "Volks",
                "Gol",
                2022
        );
        gol.setPlaca("AAA1234");

        ImprimirString.imprimir("gol = " + gol);
        ImprimirString.imprimir("audi = " + audi);
        ImprimirString.imprimir("nissan = " + nissan);

        //Carro.imprimirMarca();
        //gol.imprimirMarca();

    }

}
