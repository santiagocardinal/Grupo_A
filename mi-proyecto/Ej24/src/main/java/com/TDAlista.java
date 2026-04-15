package com;

public class TDAlista<T extends Comparable<T>> {

    private Nodo<T> primero;
    private int longitud;

    public TDAlista(){
        this.primero = null;
        this.longitud = 0;
    }

    // Inserta al final de la lista (lista no ordenada)
    public void insertar(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        if (primero == null) {
            primero = nuevo;
        } else {
            Nodo<T> actual = primero;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
        longitud++;
    }

    // Inserta manteniendo orden ascendente (usado en Tdaconjuntos) 
    public void insertarOrdenado(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        if (primero == null || primero.getDato().compareTo(dato) > 0) {
            nuevo.setSiguiente(primero);
            primero = nuevo;
        } else {
            Nodo<T> actual = primero;
            while (actual.getSiguiente() != null
                    && actual.getSiguiente().getDato().compareTo(dato) < 0) {
                actual = actual.getSiguiente();
            }
            nuevo.setSiguiente(actual.getSiguiente());
            actual.setSiguiente(nuevo);
        }
        longitud++;
    }

    // Busca un elemento por comparación equals
    public boolean buscar(T dato) {
        Nodo<T> actual = primero;
        while (actual != null) {
            if (actual.getDato().equals(dato)) return true;
            actual = actual.getSiguiente();
        }
        return false;
    }

    // Elimina la primera ocurrencia del dato
    public boolean eliminar(T dato) {
        if (primero == null) return false;
        if (primero.getDato().equals(dato)) {
            primero = primero.getSiguiente();
            longitud--;
            return true;
        }
        Nodo<T> actual = primero;
        while (actual.getSiguiente() != null) {
            if (actual.getSiguiente().getDato().equals(dato)) {
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
                longitud--;
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

    public int longitud() { return longitud; }

    public boolean estaVacia() { return primero == null; }

    //Devuelve el elemento en la posición i 
    public T obtener(int i) {
        Nodo<T> actual = primero;
        for (int k = 0; k < i; k++) {
            if (actual == null) throw new IndexOutOfBoundsException("Índice fuera de rango: " + i);
            actual = actual.getSiguiente();
        }
        if (actual == null) throw new IndexOutOfBoundsException("Índice fuera de rango: " + i);
        return actual.getDato();
    }

    public void imprimir() {
        Nodo<T> actual = primero;
        while (actual != null) {
            System.out.println("  " + actual.getDato());
            actual = actual.getSiguiente();
        }
    }

    public Nodo<T> getPrimero() { return primero; }
}
