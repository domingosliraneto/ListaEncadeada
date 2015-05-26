/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filaencadeada;

/**
 *
 * @author Domingos Neto
 */
public class NoEncadeada {
    private int valor;
    NoEncadeada proximo;

    public NoEncadeada(int valor, NoEncadeada proximo) {
        this.valor = valor;
        this.proximo = proximo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NoEncadeada getProximo() {
        return proximo;
    }

    public void setProximo(NoEncadeada proximo) {
        this.proximo = proximo;
    }
    
}
