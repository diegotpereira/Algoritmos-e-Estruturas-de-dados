package br.com.java.testes;

import br.com.java.modelo.Aluno;
import br.com.java.modelo.Vetor;

public class Teste {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();

        a1.setNome("Jorge");

        Vetor lista = new Vetor();

        lista.adiciona(a1);
        lista.pega(0);
        lista.pega(1);
        lista.pega(100000000);
    }
}
