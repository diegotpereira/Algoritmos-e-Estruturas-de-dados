package br.com.java.teste;

import br.com.java.modelo.Peca;
import br.com.java.modelo.Pilha;

public class Teste {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        Peca peca = new Peca();
        pilha.insere(peca);

        Peca pecaRemove = pilha.remove();

        if (pilha.vazia()) {
            System.out.println("A pilha está vazia");
        }
    }
}
