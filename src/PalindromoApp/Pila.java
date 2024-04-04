/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PalindromoApp;

/**
 *
 * @author jenni
 */
class Pila extends Lista {

    public Pila() {
        super("pila");
    }

    public void push(Object dato) {
        insertarAlFrente(dato);
    }

    public Object pop() throws ExceptionListaVacia {
        return removerDelFrente();
    }
}
