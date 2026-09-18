package teste.model;

public class Carro {

    public String marca;
    public String modelo;
    public int ano;
    public String cor;
    public String placa;
    public double capacidadeTanque;
    public boolean ligado;

    public void ligar() {
        if (!ligado) { 
            System.out.println("Carro Ligando: - Vrum Vrum");
            ligado = true;
        } else {
            System.out.println("Impossivel Ligar, o Carro ja esta ligado!");
        }
    }

    public void desligar() {
        if (ligado) {
            System.out.println("Carro Desligando: - Vrum Vr.. V.. ....");
            ligado = false;
        } else {
            System.out.println("Impossivel Desligar, o Carro ja esta Desligado!");
        }
    }

    public void acelerar() {
        if (ligado) {
            System.out.println("Carro Acelerando: Vruuuummmm!");
        } else {
            System.out.println("Impossivel Acelerar, o carro esta desligado!");
        }
    }

    public void frear() { 
        System.out.println("Carro Freando: Sssshhh!");
    }

    public void buzinar() {
        System.out.println("BIBIBI");
    }
}