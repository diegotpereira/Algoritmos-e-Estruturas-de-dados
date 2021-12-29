package br.com.java.listasLigadas.testes;

import br.com.java.listasLigadas.ListaLigada;

public class TestePegaPorPosicao {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        lista.adiciona("Rafael Pereira");
        lista.adiciona("Vagner Gomes");

        System.out.println(lista.pega(0));
        System.out.println(lista.pega(1));
    }
}
