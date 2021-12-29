package br.com.java.listasLigadas.testes;

import br.com.java.listasLigadas.ListaLigada;

public class TesteRemoveDoComeco {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        lista.adiciona("Bernardo");
        lista.adiciona("Gabriel");

        lista.removeDoComeco();

        System.out.println(lista);
    }
}
