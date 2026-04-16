package uy.edu.curso.TestsEj24;

import uy.edu.curso.Ej24.TAlumno;
import static org.junit.Assert.*;
import org.junit.Test;
import uy.edu.curso.Ej24.TDAlista;

public class TdaListaTest {
    private TDAlista<TAlumno> lista;
 
    private TAlumno a1 = new TAlumno("1001", "Pedro",  "Gomez");
    private TAlumno a2 = new TAlumno("1002", "Maria",  "Lopez");
    private TAlumno a3 = new TAlumno("1003", "Juan",   "Perez");
  
    void setUp() {
        lista = new TDAlista<>();
    }
    //insertar elemento
     @Test
    void testInsertarUnElemento() {
        lista.insertar(a1);
        assertEquals(1, lista.longitud());
        assertFalse(lista.estaVacia());
    }
    // eliminar elemento
    @Test

    void testInsertarVariosElementos() {
        lista.insertar(a1);
        lista.insertar(a2);
        lista.insertar(a3);
        assertEquals(3, lista.longitud());
    }
     @Test
    void testEliminarEnVacia() {
        assertFalse(lista.eliminar(a1));
    }
 
    @Test

    void testEliminarExistente() {
        lista.insertar(a1);
        lista.insertar(a2);
        assertTrue(lista.eliminar(a1));
        assertEquals(1, lista.longitud());
        assertFalse(lista.buscar(a1));
    }
 
    @Test

    void testEliminarUnico() {
        lista.insertar(a1);
        lista.eliminar(a1);
        assertTrue(lista.estaVacia());
    }


}
