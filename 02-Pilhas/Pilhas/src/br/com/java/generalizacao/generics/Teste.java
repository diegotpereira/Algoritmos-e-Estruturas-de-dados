package br.com.java.generalizacao.generics;

import br.com.java.modelo.Peca;

public class Teste {
    public static void main(String[] args) {
        Pilha<Peca> pilha = new Pilha<Peca>();

        Peca peca = new Peca();
        
        pilha.insere(peca);

        Peca pecaRemove = pilha.remove();

        if (pilha.vazia()) {
            System.out.println("A pilha está vazia");
        }
        Pilha<String> pilha2 = new Pilha<String>();
        pilha2.insere("Rafael Constante");
        pilha2.insere("Carlos Garcia");

        String rafael = pilha2.remove();
        String carlos =  pilha2.remove();

        System.out.println(rafael);
        System.out.println(carlos);
        
    }
}
