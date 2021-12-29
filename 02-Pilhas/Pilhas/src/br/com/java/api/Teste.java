package br.com.java.api;

import java.util.Stack;

import br.com.java.modelo.Peca;

public class Teste {
    public static void main(String[] args) {
        Stack<Peca> pilha = new Stack<Peca>();

        Peca inserePeca = new Peca();
        pilha.push(inserePeca);

        Peca pecaRemove = pilha.pop();

        if (pilha.isEmpty()) {
            System.out.println("A pilha está vazia.");
        }
    }
}
