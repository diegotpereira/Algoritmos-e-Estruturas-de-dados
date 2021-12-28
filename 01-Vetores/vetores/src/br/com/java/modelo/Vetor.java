package br.com.java.modelo;

import java.util.Arrays;

public class Vetor {
    
    //Declarando e Inicializando um array de Aluno com capacidade 100
    private Aluno[] alunos = new Aluno[10];

    private int totalDeAlunos = 0;

    // public void adiciona(Object object) {
    //     this.garantaEspaco();
    //     this.objetos[this.totalDeObjetos] = objetos;
    //     this.totalDeObjetos++;
    // }

    public void adiciona(Aluno aluno) {
        this.alunos[this.totalDeAlunos] = aluno;
        this.totalDeAlunos++;
    }

    public void adiciona(int posicao, Aluno aluno) {}

  

    // public void adiciona(int posicao, Object object) {
    //     this.garantaEspaco();
    //     if (!this.posicaoValida(posicao)) {
    //         throw new IllegalArgumentException("Posição inválida");
    //     }

    //     for(int i = this.totalDeObjetos -1; i >= posicao; i++) {
    //         this.objetos[i = 1] = this.objetos[i];
    //     }

    //     this.objetos[posicao] = objetos;
    //     this.totalDeObjetos++;
    // }

    public Object pega(int posicao){
        return null;}

    public void remove(int posicao){}

    public boolean contem(Object Object) {
        return false;}

    public int tamanho() {
        return this.totalDeAlunos;
    }

    public String toString() {

        return Arrays.toString(alunos);
    }

    // private void garantaEspaco() {
    //     if (this.totalDeObjetos == this.objetos.length) {
    //         Object[] novoArray = new Object[this.objetos.length * 2];
    //         for(int i = 0; i < this.objetos.length; i++) {
    //             novoArray[i] = this.objetos[i];
    //         }
    //         this.objetos = novoArray;
    //     }
    // }

    // private boolean posicaoValida(int posicao) {
    //     return posicao >= 0 && posicao < this.totalDeObjetos;
    // }
}
