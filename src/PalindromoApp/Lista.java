/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PalindromoApp;

/**
 *
 * @author jenni
 */
class Lista {

    private Nodo ini, fin;
    private String nombre;

    public Lista(String nombre) {
        this.nombre = nombre;
        ini = fin = null;
    }

    public Lista() {
        this("miLista");
    }

    public boolean estaVacia() {
        return null == ini;
    }

    public void insertarAlFrente(Object dato) {
        if (estaVacia()) {
            ini = fin = new Nodo(dato);
        } else {
            ini = new Nodo(dato, ini);
        }
    }

    public void insertarAlFinal(Object dato) {
        if (estaVacia()) {
            ini = fin = new Nodo(dato);
        } else {
            fin = fin.siguiente = new Nodo(dato);
        }
    }

    public Object removerDelFrente() throws ExceptionListaVacia {
        if (estaVacia()) {
            throw new ExceptionListaVacia(nombre);
        }
        Object dato = ini.dato;

        if (ini == fin) {
            ini = fin = null;
        } else {
            ini = ini.siguiente;
        }
        return dato;
    }

    public Object removerDelFinal() throws ExceptionListaVacia {
        if (estaVacia()) {
            throw new ExceptionListaVacia(nombre);
        }
        Object dato = fin.dato;

        if (ini == fin) {
            ini = fin = null;
        } else {
            Nodo actual = ini;
            while (actual.siguiente != fin) {
                actual = actual.siguiente;
            }
            fin = actual;
            actual.siguiente = null;
            fin.siguiente = null;
        }
        return dato;
    }

    public void imprimir() {
        if (estaVacia()) {
            System.out.printf("%s esta vacia!", nombre);
            return;
        }
        Nodo actual = ini;
        while (actual != null) {
            System.out.printf("%s ", actual.dato.toString());
            actual = actual.siguiente;
        }
    }
}

