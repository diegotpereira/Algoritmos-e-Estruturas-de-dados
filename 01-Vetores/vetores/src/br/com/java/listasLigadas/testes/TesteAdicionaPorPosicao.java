package br.com.java.listasLigadas.testes;

import br.com.java.listasLigadas.ListaLigada;

public class TesteAdicionaPorPosicao {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        
        lista.adiciona("Rafael Carvalho");
        lista.adiciona(0, "Paulo Fialho");
        lista.adiciona(1, "Camila Santos");

        System.out.println(lista);
    }
}
