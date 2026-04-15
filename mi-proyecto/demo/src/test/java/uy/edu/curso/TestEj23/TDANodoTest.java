package uy.edu.curso.TestEj23;

import static org.junit.Assert.*;
import org.junit.Test;
import uy.edu.curso.Ej23.TDANodo;

public class TDANodoTest {

    // Test 1: getDato() retorna el dato con el que se creó el nodo
    @Test
    public void testGetDatoEntero() {
        TDANodo<Integer> nodo = new TDANodo<>(42);
        assertEquals(Integer.valueOf(42), nodo.getDato());
    }

    // Test 2: getSiguiente() es null al crear un nodo nuevo
    @Test
    public void testSiguienteEsNullAlCrear() {
        TDANodo<Integer> nodo = new TDANodo<>(10);
        assertNull(nodo.getSiguiente());
    }

    // Test 3: setSiguiente() enlaza correctamente dos nodos
    @Test
    public void testSetYGetSiguiente() {
        TDANodo<Integer> nodo1 = new TDANodo<>(1);
        TDANodo<Integer> nodo2 = new TDANodo<>(2);
        nodo1.setSiguiente(nodo2);
        assertSame(nodo2, nodo1.getSiguiente());
    }

    // Test 4: getDato() con tipo String
    @Test
    public void testGetDatoString() {
        TDANodo<String> nodo = new TDANodo<>("hola");
        assertEquals("hola", nodo.getDato());
    }

    // Test 5: getDato() con tipo Double
    @Test
    public void testGetDatoDouble() {
        TDANodo<Double> nodo = new TDANodo<>(3.14);
        assertEquals(Double.valueOf(3.14), nodo.getDato());
    }

    // Test 6: cadena de tres nodos, verificar navegación completa
    @Test
    public void testCadenaTresNodos() {
        TDANodo<Integer> n1 = new TDANodo<>(1);
        TDANodo<Integer> n2 = new TDANodo<>(2);
        TDANodo<Integer> n3 = new TDANodo<>(3);

        n1.setSiguiente(n2);
        n2.setSiguiente(n3);

        assertEquals(Integer.valueOf(2), n1.getSiguiente().getDato());
        assertEquals(Integer.valueOf(3), n1.getSiguiente().getSiguiente().getDato());
        assertNull(n1.getSiguiente().getSiguiente().getSiguiente());
    }
}