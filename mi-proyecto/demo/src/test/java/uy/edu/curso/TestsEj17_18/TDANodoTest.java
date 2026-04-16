package uy.edu.curso.TestsEj17_18;
import org.junit.Test;
import static org.junit.Assert.*;
import uy.edu.curso.ejercicio17y18.TDANodo;
import uy.edu.curso.ejercicio17y18.libro;
public class TDANodoTest 
{

    // ── TEST 1: el nodo guarda correctamente el dato ──────────────────
    @Test
    public void testGetDato() 
    {
        TDANodo<Integer> nodo = new TDANodo<>(5);
        assertEquals((Integer)5, nodo.getDato()); // el dato guardado debe ser 5
    }

    // ── TEST 2: al crear un nodo, el siguiente debe ser null ──────────
    @Test
    public void testSiguienteInicialmenteNull() 
    {
        TDANodo<String> nodo = new TDANodo<>("Hola");
        assertNull(nodo.getSiguiente()); // el siguiente debe ser null al crear el nodo
    }

    // ── TEST 3: setSiguiente funciona correctamente ───────────────────
    @Test
    public void testSetSiguiente() 
    {
        TDANodo<String> nodo1 = new TDANodo<>("Hola");
        TDANodo<String> nodo2 = new TDANodo<>("Mundo");

        nodo1.setSiguiente(nodo2); // enlazamos nodo1 con nodo2

        assertEquals(nodo2, nodo1.getSiguiente()); // el siguiente de nodo1 debe ser nodo2
    }

    // ── TEST 4: getSiguiente devuelve el nodo correcto ────────────────
    @Test
    public void testGetSiguiente() 
    {
        TDANodo<Integer> nodo1 = new TDANodo<>(1);
        TDANodo<Integer> nodo2 = new TDANodo<>(2);

        nodo1.setSiguiente(nodo2);

        assertEquals((Integer)2, nodo1.getSiguiente().getDato()); // el dato del siguiente debe ser 2
    }

    // ── TEST 5: el nodo funciona con objetos de tipo libro ────────────
    @Test
    public void testNodoConLibro() 
    {
        libro l = new libro("001", "Java", 29.99, 5);
        TDANodo<libro> nodo = new TDANodo<>(l);

        assertEquals("001", nodo.getDato().getCodigoIdentificacion()); // verifica el código
        assertEquals("Java", nodo.getDato().getTitulo());               // verifica el título
        assertEquals((Double)29.99, nodo.getDato().getPrecio());                // verifica el precio
        assertEquals(Integer.valueOf(5), Integer.valueOf(nodo.getDato().getCantidadEjemplares()));        // verifica el stock
    }

    // ── TEST 6: el nodo funciona con Double ───────────────────────────
    @Test
    public void testNodoConDouble() 
    {
        TDANodo<Double> nodo = new TDANodo<>(3.14);
        assertEquals((Double)3.14, nodo.getDato()); // el dato guardado debe ser 3.14
    }

    // ── TEST 7: cadena de nodos enlazados correctamente ───────────────
    @Test
    public void testCadenaDeNodos() 
    {
        TDANodo<Integer> nodo1 = new TDANodo<>(1);
        TDANodo<Integer> nodo2 = new TDANodo<>(2);
        TDANodo<Integer> nodo3 = new TDANodo<>(3);

        nodo1.setSiguiente(nodo2); // 1 -> 2
        nodo2.setSiguiente(nodo3); // 2 -> 3

        // verificamos que la cadena está bien enlazada
        assertEquals((Integer)2, nodo1.getSiguiente().getDato());                 // 1 -> 2
        assertEquals((Integer)3, nodo1.getSiguiente().getSiguiente().getDato());  // 1 -> 2 -> 3
        assertNull(nodo1.getSiguiente().getSiguiente().getSiguiente());  // 3 -> null
    }
}