package br.com.java.listasLigadas.testes;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestePerformance {
    public static void main(String[] args) {
        ArrayList<String> vetor = new ArrayList<String>();
        LinkedList<String> lista = new LinkedList<String>();
        int numerosDeElementos = 40000;

        // Adicionado no começo
        long inicio = System.currentTimeMillis();

        for(int i = 0; i < numerosDeElementos; i++) {
            vetor.add(0, "" + i);
        }

        long fim = System.currentTimeMillis();
        System.out.println("Vetor adiciona no começo: " + 
            (fim - inicio) / 1000.0);

        inicio = System.currentTimeMillis();

        for(int i = 0; i < numerosDeElementos; i++) {
            lista.add(0, "" + i);
        }

        fim = System.currentTimeMillis();
        System.out.println("Lista Ligada adiciona no começo: " + 
            (fim - inicio) / 1000.0);

        // Percorrendo
        for(int i = 0; i < numerosDeElementos; i++){
            vetor.get(i);
        }

        fim = System.currentTimeMillis();
        System.out.println("Vetor percorrendo: " + 
            (fim - inicio) / 1000.0);

        inicio = System.currentTimeMillis();

        for(int i = 0; i < numerosDeElementos; i++) {
            lista.get(i);
        }

        fim = System.currentTimeMillis();
        System.out.println("Lista Ligada percorrendo: " + 
            (fim -inicio) / 1000.0);

        // Removendo do começo
        inicio = System.currentTimeMillis();

        for (int i = 0; i < numerosDeElementos; i++) {
        vetor.remove(0);
        }

        fim = System.currentTimeMillis();
        System.out.println("Vetor remove do começo: " + 
           (fim - inicio) / 1000.0);

        inicio = System.currentTimeMillis();

        for (int i = 0; i < numerosDeElementos; i++) {
        lista.remove(0);
        }

        fim = System.currentTimeMillis();

        System.out.println("Lista Ligada remove do começo: " + 
           (fim - inicio) / 1000.0);
    }
}
