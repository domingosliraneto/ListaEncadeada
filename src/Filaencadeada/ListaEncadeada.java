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
public class ListaEncadeada {

    private int quantidade = 0;
    private NoEncadeada inicio;
    private NoEncadeada fim;

    void criarFila() {

    }
    
    public boolean eVazia() {
        return quantidade == 0;
    }

    int tamanho() {
        return quantidade;
    }

    void limpar() {
        inicio.setProximo(null);
    }

    public NoEncadeada enfileirar(int valor) {
        NoEncadeada elemento = new NoEncadeada(valor, null);
        elemento.setProximo(inicio.getProximo());
        inicio.setProximo(elemento);
        quantidade++;
        return elemento;
    }

    NoEncadeada desenfileirar() {
        if (eVazia()) {
            System.out.println("Pilha vazia, não posso retirar elemento desejado");
            return null;
        } else {
            NoEncadeada aux = inicio.getProximo();
            inicio.setProximo(inicio.getProximo().getProximo());
            return aux;
        }
    }

    int pegarInicio() {
        return inicio.getProximo().getValor();

    }

    void listar() {
        if (eVazia()) {
            System.out.println("Pilha vazia, não posso retirar elemento desejado");
        } else {
            NoEncadeada aux = inicio.getProximo();
            while (aux != null) {
                System.out.println(aux.getValor());
                aux = aux.getProximo();

            }
        }
    }
}
