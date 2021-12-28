package br.com.java.testes;

import br.com.java.modelo.Aluno;
import br.com.java.modelo.Vetor;

public class TesteEstoura {
    public static void main(String[] args) {
        Vetor vetor = new Vetor();

        for(int i = 0; i < 100001; i++) {
            Aluno aluno = new Aluno();
            vetor.adiciona(aluno);
        }
    }
}
