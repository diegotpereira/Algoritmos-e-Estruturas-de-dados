package br.com.java.listasLigadas.testes;

import br.com.java.listasLigadas.ListaLigada;

public class TesteRemovePorPosicao {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        lista.adiciona("Rafael Gomes");
        lista.adiciona("Paulo Ferreira");
        lista.adiciona("Camila Santos");

        System.out.println(lista);

        lista.remove(1);

        System.out.println(lista);
    }
}
