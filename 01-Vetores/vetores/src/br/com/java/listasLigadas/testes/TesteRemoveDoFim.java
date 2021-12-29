package br.com.java.listasLigadas.testes;

import br.com.java.listasLigadas.ListaLigada;

public class TesteRemoveDoFim {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        lista.adiciona("Rafael");
        lista.adiciona("Vagner");

        lista.removeDoFim();

        System.out.println(lista);
    }
}
