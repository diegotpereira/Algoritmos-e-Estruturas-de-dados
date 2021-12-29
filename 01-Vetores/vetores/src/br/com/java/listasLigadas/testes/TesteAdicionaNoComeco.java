package br.com.java.listasLigadas.testes;

import br.com.java.listasLigadas.ListaLigada;

public class TesteAdicionaNoComeco {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        lista.adicionaNoComeco("Fernando Molina");
        lista.adicionaNoComeco("Flávio Basso");

        System.out.println(lista);
    }
}
