package com.example.gerenciamentomemoria.slides;

import java.util.ArrayList;
import java.util.List;

public class DemoEx1HeapApresentacao {

    public static void main(String[] args) {
        List<String> minhaLista = new ArrayList<>();

        minhaLista.add("Um");
        minhaLista.add("Dois");
        minhaLista.add("Três");

        printarLista(minhaLista);
    }

    public static void printarLista(List<String> lista) {
        System.out.println(lista);
    }

}
