package br.com.letscode.turmaitau.carroHeranca;

import br.com.letscode.turmaitau.carroHeranca.modelo.Carro;
import br.com.letscode.turmaitau.carroHeranca.modelo.CarroCorrida;
import br.com.letscode.turmaitau.carroHeranca.modelo.CarroEsportivo;
import br.com.letscode.turmaitau.carroHeranca.modelo.CarroPasseio;

public class FabricaCarros {

    public static Carro fabricarCarro(String marca, String modelo, String placa, String cor, Integer anoFabricacao, String tipoCarro) {

        if ("esportivo".equals(tipoCarro)) {
            return new CarroEsportivo(
                    marca,
                    modelo,
                    placa,
                    cor,
                    anoFabricacao
            );
        } else if ("passeio".equals(tipoCarro)) {
            return new CarroPasseio(
                    marca,
                    modelo,
                    placa,
                    cor,
                    anoFabricacao
            );
        } else if ("corrida".equals(tipoCarro)) {
            return new CarroCorrida(
                    marca,
                    modelo,
                    placa,
                    cor,
                    anoFabricacao
            );
        } else {
            return null;
        }

    }

}
