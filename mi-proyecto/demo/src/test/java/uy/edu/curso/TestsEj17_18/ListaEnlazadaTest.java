package uy.edu.curso.TestsEj17_18;
import org.junit.Test;
import static org.junit.Assert.*;
import uy.edu.curso.ejercicio17y18.ListaEnlazada;
import uy.edu.curso.ejercicio17y18.libro;
public class ListaEnlazadaTest 
{

    // ── TEST 1: la lista está vacía al crearla ────────────────────────
    @Test
    public void testListaVaciaAlCrear() 
    {
        ListaEnlazada<Integer> lista = new ListaEnlazada<>();
        assertTrue(lista.esVacia()); // la lista debe estar vacía al crearla
    }

    // ── TEST 2: agregar un elemento y verificar que no está vacía ─────
    @Test
    public void testAgregarUnElemento() 
    {
        ListaEnlazada<Integer> lista = new ListaEnlazada<>();
        lista.agregar(5);
        assertFalse(lista.esVacia()); // la lista no debe estar vacía después de agregar
        assertEquals((Integer) 1, (Integer) lista.tamaño()); // el tamaño debe ser 1 después de agregar un elemento
    }

    // ── TEST 3: agregar devuelve true ─────────────────────────────────
    @Test
    public void testAgregarDevuelveTrue() 
    {
        ListaEnlazada<Integer> lista = new ListaEnlazada<>();
        assertTrue(lista.agregar(5)); // agregar siempre debe devolver true
    }

    // ── TEST 4: tamaño aumenta al agregar elementos ───────────────────
    @Test
    public void testTamañoAumentaAlAgregar() 
    {
        ListaEnlazada<Integer> lista = new ListaEnlazada<>();
        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);
        assertEquals((Integer) 3, (Integer) lista.tamaño()); // el tamaño debe ser 3
    }

    // ── TEST 5: obtener el primer elemento ────────────────────────────
    @Test
    public void testObtenerPrimerElemento() 
    {
        ListaEnlazada<String> lista = new ListaEnlazada<>();
        lista.agregar("Hola");
        lista.agregar("Mundo");
        assertEquals("Hola", lista.obtener(0)); // el primer elemento debe ser "Hola"
        assertEquals((Integer) 2, (Integer) lista.tamaño()); // el tamaño debe ser 2            
    }

    // ── TEST 6: obtener el último elemento ────────────────────────────
    @Test
    public void testObtenerUltimoElemento() 
    {
        ListaEnlazada<String> lista = new ListaEnlazada<>();
        lista.agregar("Hola");
        lista.agregar("Mundo");
        assertEquals("Mundo", lista.obtener(1)); // el último elemento debe ser "Mundo"
    }

    // ── TEST 7: obtener con índice inválido devuelve null ─────────────
    @Test
    public void testObtenerIndiceInvalidoDevuelveNull() 
    {
        ListaEnlazada<Integer> lista = new ListaEnlazada<>();
        lista.agregar(1);
        assertNull(lista.obtener(99)); // un índice que no existe debe devolver null
    }

    // ── TEST 8: eliminar por índice el primer elemento ────────────────
    @Test
    public void testEliminarPrimerElementoPorIndice() 
    {
        ListaEnlazada<String> lista = new ListaEnlazada<>();
        lista.agregar("Hola");
        lista.agregar("Mundo");

        String eliminado = lista.eliminar(0);

        assertEquals("Hola", eliminado);          // debe devolver el elemento eliminado
        assertEquals("Mundo", lista.obtener(0));  // ahora el primero debe ser "Mundo"
    }

    // ── TEST 9: eliminar por índice un elemento del medio ─────────────
    @Test
    public void testEliminarElementoMedioPorIndice() 
    {
        ListaEnlazada<String> lista = new ListaEnlazada<>();
        lista.agregar("A");
        lista.agregar("B");
        lista.agregar("C");

        String eliminado = lista.eliminar(1); // eliminamos "B"

        assertEquals("B", eliminado);         // debe devolver "B"
        assertEquals((Integer) 2, (Integer) lista.tamaño()); // el tamaño debe ser 2
        assertEquals("A", lista.obtener(0));  // el primero debe ser "A"
        assertEquals("C", lista.obtener(1));  // el segundo debe ser "C"
    }

    // ── TEST 10: eliminar por índice en lista vacía devuelve null ─────
    @Test
    public void testEliminarEnListaVaciaDevuelveNull() 
    {
        ListaEnlazada<Integer> lista = new ListaEnlazada<>();
        assertNull(lista.eliminar(0)); // eliminar en lista vacía debe devolver null
    }

    // ── TEST 11: eliminar por elemento devuelve true si existe ────────
    @Test
    public void testEliminarElementoExistente() 
    {
        ListaEnlazada<String> lista = new ListaEnlazada<>();
        lista.agregar("Hola");
        lista.agregar("Mundo");

        assertTrue(lista.eliminar("Hola")); // debe devolver true al encontrar el elemento
    }

    // ── TEST 12: eliminar por elemento devuelve false si no existe ────
    @Test
    public void testEliminarElementoNoExistente() 
    {
        ListaEnlazada<String> lista = new ListaEnlazada<>();
        lista.agregar("Hola");

        assertFalse(lista.eliminar("Chau")); // debe devolver false si no existe
    }

    // ── TEST 13: tamaño de lista vacía es 0 ──────────────────────────
    @Test
    public void testTamañoListaVacia() 
    {
        ListaEnlazada<Integer> lista = new ListaEnlazada<>();
        assertEquals((Integer) 0, (Integer) lista.tamaño()); // el tamaño debe ser 0
    }

    // ── TEST 14: la lista funciona con objetos de tipo libro ──────────
    @Test
    public void testListaConLibros() 
    {
        ListaEnlazada<libro> lista = new ListaEnlazada<>();
        libro l1 = new libro("001", "Java", 29.99, 5);
        libro l2 = new libro("002", "Python", 19.99, 3);

        lista.agregar(l1);
        lista.agregar(l2);

        assertEquals((Integer) 2, (Integer) lista.tamaño());                          // el tamaño debe ser 2
        assertEquals("001", lista.obtener(0).getCodigoIdentificacion()); // el primero debe ser l1
        assertEquals("002", lista.obtener(1).getCodigoIdentificacion()); // el segundo debe ser l2
    }
    @Test
    public void ordenarListaporTitulo()
    {
        ListaEnlazada<libro> lista = new ListaEnlazada<>();
        libro l1 = new libro("001", "Java", 29.99, 5);
        libro l2 = new libro("002", "Python", 19.99, 3);
        libro l3 = new libro("003", "C++", 39.99, 2);

        lista.agregar(l1);
        lista.agregar(l2);
        lista.agregar(l3);

        lista.ordenar((a, b) -> a.getTitulo().compareTo(b.getTitulo()));

        assertEquals("C++", lista.obtener(0).getTitulo()); // el primero debe ser "C++"
        assertEquals("Java", lista.obtener(1).getTitulo()); // el segundo debe ser "Java"
        assertEquals("Python", lista.obtener(2).getTitulo()); // el tercero debe ser "Python"}
    }
}