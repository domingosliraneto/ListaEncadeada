/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaencadeada;

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

    public void enfileirar(NoEncadeada valor) {
        if ( eVazia() ){
            inicio = fim = valor;
        }
        else{
         valor.proximo = inicio;
            inicio = valor;
        }
        quantidade++;
    }

    NoEncadeada desenfileirar() {
        return null;

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
