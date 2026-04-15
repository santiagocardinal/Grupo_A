package uy.edu.curso.Ej23;

public class TDANodo<T> {

    private T dato; //Este es el dato que se va a almacenar en el nodo

    private TDANodo<T> siguiente;//Referencia al siguiente nodo, es decir, el nodo que sigue a este nodo

    // constructor// crea un nodo con el dato dado y sin siguiente
    public TDANodo(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    // Devuelve el dato almacenado en el nodo
    public T getDato() { return this.dato; }
    

    //Devuelve la referencia al siguiente nodo
    public TDANodo<T> getSiguiente() {
        return this.siguiente;
    }


    //Permite establecer la referencia al siguiente nodo
    public void setSiguiente(TDANodo<T> siguiente) {
        this.siguiente = siguiente;
    }
}