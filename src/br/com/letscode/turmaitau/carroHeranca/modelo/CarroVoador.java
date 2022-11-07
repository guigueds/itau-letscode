package br.com.letscode.turmaitau.carroHeranca.modelo;

public class CarroVoador extends Carro {

    public CarroVoador(String marca, String modelo, String placa, String cor, Integer anoFabricacao) {
        super(marca, modelo, placa, cor, anoFabricacao);
    }

    @Override
    public void ligar() {
        super.ligar();
        System.out.println("Ligando carro voador..");
    }

    @Override
    public void acelerar() {
        super.aumentarVelocidade(50);
    }


}
