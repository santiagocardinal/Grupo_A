package uy.edu.curso.Ej23;

public class Directorio {

    private ListaEnlazada<String> sucursales;

    // Constructor crea un directorio vacío
    public Directorio() {
        this.sucursales = new ListaEnlazada<String>();
    }

    // Agrega una sucursal al directorio
    public void agregar(String sucursal) {
        this.sucursales.agregar(sucursal);
    }

    // Busca una sucursal en el directorio
    // Devuelve true si la encuentra, false si no está
    public boolean buscar(String sucursal) {
        TDANodo<String> actual = this.sucursales.primero;
        while (actual != null) {
            if (actual.getDato().equals(sucursal)) {
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

    // Elimina una sucursal del directorio por nombre
    public void quitar(String sucursal) {
        this.sucursales.eliminar(sucursal);
    }

    // Muestra todas las sucursales por consola
    public void mostrar() {
        TDANodo<String> actual = this.sucursales.primero;
        while (actual != null) {
            System.out.println(actual.getDato());
            actual = actual.getSiguiente();
        }
    }

    // Devuelve la cantidad de sucursales en el directorio
    public int cantidad() {
        return this.sucursales.tamaño();
    }

    // Devuelve true si el directorio no tiene sucursales
    public boolean estaVacio() {
        return this.sucursales.esVacia();
    }

    // Imprime todas las sucursales separadas por el ;
    public void imprimir(String separador) {
        TDANodo<String> actual = this.sucursales.primero;
        while (actual != null) {
            System.out.print(actual.getDato() + separador);
            actual = actual.getSiguiente();
        }
    }
}