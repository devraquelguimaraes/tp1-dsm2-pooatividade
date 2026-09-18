package teste.view;

import teste.model.Carro;

public class Main {

    public static void main(String[] args) {

        Carro c1 = new Carro();
        c1.marca = "Renault";
        c1.modelo = "Logan";
        c1.ano = 2002;
        c1.cor = "Negro";
        c1.placa = "CTF-2S33";
        c1.capacidadeTanque = 50.0;

        Carro c2 = new Carro();
        c2.marca = "Fiat";
        c2.modelo = "Moby";
        c2.ano = 2018;
        c2.cor = "Prata";
        c2.placa = "CBA-2B23";
        c2.capacidadeTanque = 47.0;

        System.out.println("--- Testes com o Carro 1 (" + c1.modelo + " - Tanque: " + c1.capacidadeTanque + "L) ---");

        System.out.println("Ligando 1ª vez:");
        c1.ligar();

        System.out.println("Ligando 2ª vez:");
        c1.ligar();

        System.out.println("Acelerando:");
        c1.acelerar();

        System.out.println("Freando:");
        c1.frear();

        System.out.println("Buzinando:");
        c1.buzinar();

        System.out.println("Desligando 1ª vez:");
        c1.desligar();

        System.out.println("Desligando 2ª vez:");
        c1.desligar();
    }
}