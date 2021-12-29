package br.com.java.listasLigadas.testes;

import java.util.LinkedList;

import br.com.java.modelo.Aluno;

public class Teste {
    public static void main(String[] args) {
        Aluno paulo = new Aluno();
        paulo.setNome("Paulo Santana");

        Aluno rafael = new Aluno();
        rafael.setNome("rafael cosentino");

        Aluno fiodor = new Aluno();
        fiodor.setNome("fiodor dostoievski");
        
        LinkedList listaLigada = new LinkedList();
        
        listaLigada.add(paulo);
        listaLigada.add(rafael);
        listaLigada.add(1, fiodor);

        for(int i = 0; i < listaLigada.size(); i++) {
            System.out.println(listaLigada.get(i));
        }
    }
}
