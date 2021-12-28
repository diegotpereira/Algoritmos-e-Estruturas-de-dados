package br.com.java.listasLigadas.testes;

import br.com.java.listasLigadas.ListaLigada;

public class TesteAdicionaNoFim {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        lista.adiciona("Rafael");
        lista.adiciona("paulo");

        System.out.println(lista.toString());
    }
}
