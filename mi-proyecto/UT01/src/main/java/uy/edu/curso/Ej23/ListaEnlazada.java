package uy.edu.curso.Ej23;

//Como lo vas a hacer

//Implementacion de una lista enlazada generica que implementa la interfaz TDALista
public class ListaEnlazada<T> implements TDALista<T>{

    //Referencia al primer nodo de la lista
    protected TDANodo<T> primero;




    // constructor, crea una lista vacia
    public ListaEnlazada() {
        this.primero = null;
    }




    // implementar métodos del TDALista:


    //Agrega un elemento al final de la lista y devuelve true si se agregó correctamente
    @Override
    public boolean agregar(T elemento) {
        TDANodo<T> nuevoNodo = new TDANodo<>(elemento);

        //Si la lista esta vacia el nuevo nodo se convierte en el primero
        if (primero == null) {
            primero = nuevoNodo;
        } else {
            //Va a recorrer la lista hasta llegar al ultimo nodo
            TDANodo<T> actual = primero;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            //Aca enlaza el ultimo nodo con el nuevo nodo
            actual.setSiguiente(nuevoNodo);
        }
        return true;
    }


    //Devuelve el elemento en la posición indicada
    @Override
    public T obtener(int indice) {
        TDANodo<T> actual=this.primero;
        int i=0;
        //Recorrer la lista hasta llegar al indice buscado
        while (actual!=null) {
            if(i == indice) {
                return actual.getDato();
            }
            actual = actual.getSiguiente();
            i++;
        }
        //si el indice no existe devuelve null
        return null;
    }


    //Elimina el elemento en la posicion indicada 
    @Override 
    public T eliminar(int indice) // Este metodo no se utiliza en este ejercicio porque las sucursales se eliminan por nombre, no por indice
    {
        return null;
    }


    //Elimina el primer elemento que coincida con el elemento buscado
    //Devuelve true si se encontro el elemento, false si no estaba en la lista
    @Override
    public boolean eliminar(T elemento) {
        if(this.primero == null) {
            return false; //La lista esta vacia, no se puede eliminar nada
        }

        // en caso especial: el elemento a eliminar es el primer nodo. No hay nodo anterior que redirigir, entonces simplemente movemos el primero para que apunte al segundo nodo, dejando el nodo original sin referencias(eliminado)
        if (this.primero.getDato().equals(elemento)) {
            this.primero = this.primero.getSiguiente();
            return true;
        }



        // Recorre la lista buscando el elemento
        TDANodo<T> actual = this.primero;
        while (actual.getSiguiente() != null) {
            if (actual.getSiguiente().getDato().equals(elemento)) {
                // Salta el nodo a eliminar enlazando con el siguiente
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
                return true;
            }
            actual = actual.getSiguiente();
        }
        // El elemento no estaba en la lista
        return false;
    }




    // Devuelve la cantidad de elementos en la lista
    @Override
    public int tamaño() {
        int contador = 0;
        TDANodo<T> actual = this.primero;

        // Recorre toda la lista contando nodos
        while (actual != null) {
            contador++;
            actual = actual.getSiguiente();
        }
        return contador;
    }



    // Devuelve true si la lista no tiene elementos
    @Override
    public boolean esVacia() {
        return this.primero == null;
    }
}
