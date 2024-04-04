/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PalindromoApp;

/**
 *
 * @author jenni
 */
public class Nodo {

    public Object dato;
    public Nodo siguiente;

    public Nodo(Object dato, Nodo siguiente) {
        setDato(dato);
        setSiguiente(siguiente);
    }

    public Nodo(Object dato) {
        setDato(dato);
        setSiguiente(null);
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}

class ExceptionListaVacia extends RuntimeException {

    public ExceptionListaVacia() {
        this("lista");
    }

    public ExceptionListaVacia(String nombre) {
        super(nombre + " esta vacia!");
    }
}

