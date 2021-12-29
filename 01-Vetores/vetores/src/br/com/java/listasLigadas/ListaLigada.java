package br.com.java.listasLigadas;

import br.com.java.listasLigadas.modelo.Celula;

public class ListaLigada {
    
    private Celula primeira;
    private Celula ultima;
    private int totalDeElementos;

    public void adiciona(Object elemento){
        // Celula nova = new Celula(this.primeira, elemento);
        // this.primeira = nova;

        // if (this.totalDeElementos == 0) {
        //     // caso especial da lista vazia
        //     this.ultima = this.primeira;
        // }

        // this.totalDeElementos++;

        if (this.totalDeElementos == 0) {
            this.adicionaNoComeco(elemento);
        } else {
            Celula nova = new Celula(elemento);
            this.ultima.setProxima(nova);
            nova.setAnterior(this.ultima);
            this.ultima = nova;
            this.totalDeElementos++;
        }
    }
    
    public void adiciona(int posicao, Object elemento) {
        // no começo
        if (posicao == 0) {
            this.adicionaNoComeco(elemento);
            // no fim
        } else if(posicao == this.totalDeElementos) {
            this.adiciona(elemento);
        } else {
            Celula anterior = this.pegaCelula(posicao - 1);
            Celula nova = new Celula(anterior.getProxima(), elemento);
            anterior.setProxima(nova);
            this.totalDeElementos++;
        }
    }

    public Object pega(int posicao) {return null;}

    public void remove(int posicao) {}

    public int tamanho() {
        return this.totalDeElementos;
    }

    public boolean contem(Object o) { return false;}

    public void adicionaNoComeco(Object elemento) {
        if (this.totalDeElementos == 0) {
            Celula nova = new Celula(elemento);
            this.primeira = nova;
            this.ultima = nova;
        } else {
            Celula nova = new Celula(this.primeira, elemento);
            this.primeira.setAnterior(nova);
            this.primeira = nova;
        }
        this.totalDeElementos++;
    }

    public void removeDoComeco() {}

    public void removeDoFim() {}

    public String toString() {
        // verifica se a lista está vazia
        if (this.totalDeElementos == 0) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        Celula atual = primeira;

        // Percorrendo até o penúltimo elemento.
        for(int i = 0; i < this.totalDeElementos - 1; i++) {
            builder.append(atual.getElemento());
            builder.append(", ");
            atual = atual.getProxima();
        }

        // último elemento
        builder.append(atual.getElemento());
        builder.append("]");

        return builder.toString();
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.totalDeElementos;
    }

    private Celula pegaCelula(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição não existe");
        }
        Celula atual = primeira;
        for(int i = 0; i < posicao; i++) {
            atual = atual.getProxima();
        }
        return atual;
    }
}
