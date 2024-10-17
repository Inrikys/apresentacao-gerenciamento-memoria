package com.example.gerenciamentomemoria.slides;

public class DemoEx2HeapApresentacao {

    public static void main(String[] args) {

        Zupper zupper = new Zupper("Henrique");

        mudarNomeZupper(zupper);

        System.out.println(zupper.getNome());
    }

    public static void mudarNomeZupper(Zupper z) {
        z.setNome("Zupperson");
    }

}
