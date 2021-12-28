package br.com.java.vetor;

import br.com.java.modelo.Aluno;
import br.com.java.modelo.Vetor;

public class TesteRemovePorPosicao {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();

        a1.setNome("Rafael");
        a2.setNome("Paulo");

        Vetor lista = new Vetor();

        lista.adiciona(a1);
        lista.adiciona(a2);

        lista.remove(0);

        System.out.println(lista);
    }
}
