package com.example.gerenciamentomemoria.slides;

public class DemoEx22HeapApresentacao {

    public static void main(String[] args) {

        final Zupper zupper = new Zupper("Henrique");

        mudarNomeZupper(zupper);

        System.out.println(zupper.getNome());
    }

    public static void mudarNomeZupper(Zupper z) {
        z.setNome("Zupperson");
    }

}
