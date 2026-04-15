package uy.edu.curso.Ej23;

//Define que vas a hacer

// Interfaz generica que define las operaciones básicas de una lista enlazada
interface TDALista<T>{

    //Agrega un elemento al final de la lista y devuelve true si se agregó correctamente
    boolean agregar(T elemento);

    //Devuelve el elemento en la posición indicada
    T obtener(int indice);
    
    //Elimina el elemento en la posición indicada y devuelve el elemento eliminado
    T eliminar(int indice);
    
    //Elimina la primera ocurrencia del elemento dado y devuelve true si se eliminó correctamente
    boolean eliminar(T elemento);
    
    //Devuelva la antidad de elementos en la lista
    int tamaño();
    
    //Devuelve true si la lista no tiene elementos o false en caso contrario
    boolean esVacia();
    


}

