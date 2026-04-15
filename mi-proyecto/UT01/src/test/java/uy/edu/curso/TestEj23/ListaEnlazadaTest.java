
package uy.edu.curso.TestEj23;

import static org.junit.Assert.*;
import org.junit.Test;
import uy.edu.curso.Ej23.ListaEnlazada;

public class ListaEnlazadaTest {

    public ListaEnlazada<Integer> lista = new ListaEnlazada<>();
    

    // ─── esVacia() 

    @Test
    public void testEsVaciaConListaNueva() {
        assertTrue(lista.esVacia());
    }

    @Test
    public void testEsVaciaConElementos() {
        lista.agregar(1);
        assertFalse(lista.esVacia());
    }

    // ─── agregar() 

    @Test
    public void testAgregarRetornaTrue() {
        assertTrue(lista.agregar(10));
    }

    @Test
    public void testAgregarVariosElementos() {
        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);
        assertEquals(3, lista.tamaño());
    }

    @Test
    public void testAgregarMantienOrden() {
        lista.agregar(10);
        lista.agregar(20);
        lista.agregar(30);
        assertEquals(Integer.valueOf(10), lista.obtener(0));
        assertEquals(Integer.valueOf(20), lista.obtener(1));
        assertEquals(Integer.valueOf(30), lista.obtener(2));
    }

    // ─── obtener() 

    @Test
    public void testObtenerPrimerElemento() {
        lista.agregar(42);
        assertEquals(Integer.valueOf(42), lista.obtener(0));
    }

    @Test
    public void testObtenerIndiceInexistenteRetornaNull() {
        lista.agregar(1);
        assertNull(lista.obtener(5));
    }

    @Test
    public void testObtenerEnListaVaciaRetornaNull() {
        assertNull(lista.obtener(0));
    }

    // ─── tamaño()

    @Test
    public void testTamañoListaVacia() {
        assertEquals(0, lista.tamaño());
    }

    @Test
    public void testTamañoCreceCadaAgregado() {
        lista.agregar(1);
        assertEquals(1, lista.tamaño());
        lista.agregar(2);
        assertEquals(2, lista.tamaño());
    }

    // ─── eliminar(T elemento) 

    @Test
    public void testEliminarElementoPrimerNodo() {
        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);
        assertTrue(lista.eliminar(Integer.valueOf(1)));
        assertEquals(Integer.valueOf(2), lista.obtener(0));
        assertEquals(2, lista.tamaño());
    }

    @Test
    public void testEliminarElementoDelMedio() {
        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);
        assertTrue(lista.eliminar(Integer.valueOf(2)));
        assertEquals(Integer.valueOf(3), lista.obtener(1));
        assertEquals(2, lista.tamaño());
    }

    @Test
    public void testEliminarElementoUltimo() {
        lista.agregar(1);
        lista.agregar(2);
        assertTrue(lista.eliminar(Integer.valueOf(2)));
        assertEquals(1, lista.tamaño());
        assertNull(lista.obtener(1));
    }

    @Test
    public void testEliminarElementoInexistenteRetornaFalse() {
        lista.agregar(1);
        assertFalse(lista.eliminar(Integer.valueOf(99)));
    }

    @Test
    public void testEliminarEnListaVaciaRetornaFalse() {
        assertFalse(lista.eliminar(Integer.valueOf(1)));
    }

}