package br.com.java.listasLigadas.testes;

import br.com.java.listasLigadas.ListaLigada;

public class TesteContemElemento {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        lista.adiciona("Rafael Carvalho");
        lista.adiciona("Roberto Arruda");

        System.out.println(lista.contem("Rafael Carvalho"));
        System.out.println(lista.contem("Camila"));
    }
}
