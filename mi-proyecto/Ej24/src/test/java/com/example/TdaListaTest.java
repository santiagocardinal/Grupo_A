package com.example;
import org.junit.jupiter.api.*;

import com.TAlumno;
import com.TDAlista;

import static org.junit.jupiter.api.Assertions.*;

public class TdaListaTest {
    private TDAlista<TAlumno> lista;
 
    private TAlumno a1 = new TAlumno("1001", "Pedro",  "Gomez");
    private TAlumno a2 = new TAlumno("1002", "Maria",  "Lopez");
    private TAlumno a3 = new TAlumno("1003", "Juan",   "Perez");
    @BeforeEach
    void setUp() {
        lista = new TDAlista<>();
    }
    //insertar elemento
     @Test
    @DisplayName("insertar un elemento y ver si longitud pasa a 1")
    void testInsertarUnElemento() {
        lista.insertar(a1);
        assertEquals(1, lista.longitud());
        assertFalse(lista.estaVacia());
    }
    // eliminar elemento
    @Test
    @DisplayName("insertar varios elementos y revisar longitud ")
    void testInsertarVariosElementos() {
        lista.insertar(a1);
        lista.insertar(a2);
        lista.insertar(a3);
        assertEquals(3, lista.longitud());
    }
     @Test
    @DisplayName("eliminar en lista vacía retorna false")
    void testEliminarEnVacia() {
        assertFalse(lista.eliminar(a1));
    }
 
    @Test
    @DisplayName("eliminar un elemento y revisar que la longitud halla disminido")
    void testEliminarExistente() {
        lista.insertar(a1);
        lista.insertar(a2);
        assertTrue(lista.eliminar(a1));
        assertEquals(1, lista.longitud());
        assertFalse(lista.buscar(a1));
    }
 
    @Test
    @DisplayName("eliminar único elemento y verificar si la lista esta vacia")
    void testEliminarUnico() {
        lista.insertar(a1);
        lista.eliminar(a1);
        assertTrue(lista.estaVacia());
    }


}
