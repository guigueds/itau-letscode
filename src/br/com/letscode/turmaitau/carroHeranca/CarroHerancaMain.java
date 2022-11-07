package br.com.letscode.turmaitau.carroHeranca;

import br.com.letscode.turmaitau.carroHeranca.modelo.Carro;
import br.com.letscode.turmaitau.carroHeranca.modelo.CarroPasseio;
import br.com.letscode.turmaitau.carroHeranca.modelo.CarroVoador;

public class CarroHerancaMain {

    public static void main(String[] args) {

        Carro voador = new CarroVoador("Volks",
                "Gol",
                "ABC1234",
                "Verde",
                2022);
        voador.acelerar();

        Carro gol = FabricaCarros.fabricarCarro(
                "Volks",
                "Gol",
                "ABC1234",
                "Verde",
                2022,
                "passeio"
        );

        gol.ligar();
        CarroAcoes.acelerar(gol, 3);

        System.out.println("carroPasseio = " + gol);

        Carro ferrari = FabricaCarros.fabricarCarro(
                "Ferrari",
                "Modena",
                "AAA1234",
                "Vermelha",
                2021,
                "esportivo"
        );

        ferrari.ligar();
        CarroAcoes.acelerar(ferrari, 3);

        System.out.println("carroEsportivo = " + ferrari);

        Carro carroCorrida = FabricaCarros.fabricarCarro(
                "Ferrari",
                "XYZ",
                "",
                "Vermelha",
                2021,
                "corrida"
        );

        carroCorrida.ligar();
        CarroAcoes.acelerar(carroCorrida, 3);

        System.out.println("carroCorrida = " + carroCorrida);

    }


}
