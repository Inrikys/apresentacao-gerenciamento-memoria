package com.example.gerenciamentomemoria.slides;

public class DemoStackApresentacao {

    public static void main(String[] args) {
        int valor = 7;
        valor = realizarCalculo(valor);

        System.out.println(valor);
    }

    public static int realizarCalculo(int valor) {
        int valorTemporario = valor + 3;
        int novoValor = valorTemporario * 2;
        return novoValor;
    }

}
