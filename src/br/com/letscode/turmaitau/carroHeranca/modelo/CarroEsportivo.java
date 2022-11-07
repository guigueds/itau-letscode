package br.com.letscode.turmaitau.carroHeranca.modelo;

public class CarroEsportivo extends Carro {

    public CarroEsportivo(String marca, String modelo, String placa, String cor, Integer anoFabricacao) {
        super(marca, modelo, placa, cor, anoFabricacao);
    }

    @Override
    public void acelerar() {
        super.aumentarVelocidade(15);
    }

}
