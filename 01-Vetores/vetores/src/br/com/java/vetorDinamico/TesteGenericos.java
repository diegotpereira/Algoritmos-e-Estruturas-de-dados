package br.com.java.vetorDinamico;

import java.util.ArrayList;

import br.com.java.modelo.Aluno;

public class TesteGenericos {
    public static void main(String[] args) {
        ArrayList vetorSemGenerics = new ArrayList<>();
        ArrayList<Aluno> vetorComGenerics = new ArrayList<Aluno>();

        Aluno aluno = new Aluno();

        vetorSemGenerics.add(aluno);
        vetorComGenerics.add(aluno);

        Aluno a1 = (Aluno) vetorSemGenerics.get(0);
        Aluno a2 = vetorComGenerics.get(0);

        System.out.println(aluno);
    }
}
