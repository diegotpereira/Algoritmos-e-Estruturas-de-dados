package br.com.java.generalizacao.modelo;

import java.util.LinkedList;
import java.util.List;

public class Pilha {
    
    private List<Object> objetos = new LinkedList<Object>();    

    public void insere(Object objeto) {
        this.objetos.add(objeto);
    }

    public Object remove() {
        return this.objetos.remove(this.objetos.size());
    }

    public boolean vazia() {
        return this.objetos.size() == 0;
    }
}