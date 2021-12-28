package br.com.java.listasLigadas;

import br.com.java.listasLigadas.modelo.Celula;

public class ListaLigada {
    private Celula primeira;
    private Celula ultima;
    private int totalDeElementos;

    public void adiciona(Object elemento){
        if (this.totalDeElementos == 0) {
            this.adicionaNoComeco(elemento);
        } else {
            Celula nova = new Celula(elemento);
            this.ultima.setProxima(nova);
            this.ultima = nova;
            this.totalDeElementos++;
        }
    }
    
    public void adiciona(int posicao, Object elemento) {}

    public Object pega(int posicao) {return null;}

    public void remove(int posicao) {}

    public int tamanho() {
        return this.totalDeElementos;
    }

    public boolean contem(Object o) { return false;}

    public void adicionaNoComeco(Object elemento) {}

    public void removeDoComeco() {}

    public void removeDoFim() {}
}
