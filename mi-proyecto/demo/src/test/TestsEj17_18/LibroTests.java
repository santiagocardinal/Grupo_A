package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibroTests 
{

    // ── TEST 1: el constructor guarda los datos correctamente ─────────
    @Test
    public void testConstructor() 
    {
        libro l = new libro("001", "Java", 29.99, 5);

        assertEquals("001", l.getCodigoIdentificacion());
        assertNotEquals("002", l.getCodigoIdentificacion());
        assertEquals("Java", l.getTitulo());
        assertEquals((Double) 29.99, l.getPrecio());
        assertEquals((Integer) 5, (Integer) l.getCantidadEjemplares());
    }

    // ── TEST 2: getCodigo devuelve el código correcto ─────────────────
    @Test
    public void testGetCodigoIdentificacion() 
    {
        libro l = new libro("001", "Java", 29.99, 5);
        assertEquals("001", l.getCodigoIdentificacion());
    }

    // ── TEST 3: getTitulo devuelve el título correcto ─────────────────
    @Test
    public void testGetTitulo() 
    {
        libro l = new libro("001", "Java", 29.99, 5);
        assertEquals("Java", l.getTitulo());
    }

    // ── TEST 4: getPrecio devuelve el precio correcto ─────────────────
    @Test
    public void testGetPrecio() 
    {
        libro l = new libro("001", "Java", 29.99, 5);
        assertEquals((Double) 29.99, l.getPrecio());
    }

    // ── TEST 5: getCantidadEjemplares devuelve la cantidad correcta ───
    @Test
    public void testGetCantidadEjemplares() 
    {
        libro l = new libro("001", "Java", 29.99, 5);
        assertEquals((Integer) 5, (Integer) l.getCantidadEjemplares());
    }

    // ── TEST 6: setCodigo cambia el código correctamente ──────────────
   /*  @Test
    public void testSetCodigoIdentificacion() 
    {
        libro l = new libro("001", "Java", 29.99, 5);
        l.setCodigoIdentificacion("002"); // cambiamos el código
        assertEquals("002", l.getCodigoIdentificacion()); // debe ser el nuevo código
    }*/

    // ── TEST 7: setTitulo cambia el título correctamente ──────────────
    @Test
    public void testSetTitulo() 
    {
        libro l = new libro("001", "Java", 29.99, 5);
        l.setTitulo("Python"); // cambiamos el título
        assertEquals("Python", l.getTitulo()); // debe ser el nuevo título
    }

    // ── TEST 8: setPrecio cambia el precio correctamente ──────────────
    @Test
    public void testSetPrecio() 
    {
        libro l = new libro("001", "Java", 29.99, 5);
        l.setPrecio(49.99); // cambiamos el precio
        assertEquals((Double) 49.99, l.getPrecio()); // debe ser el nuevo precio
    }

    // ── TEST 9: setCantidadEjemplares cambia la cantidad correctamente ─
    @Test
    public void testSetCantidadEjemplares() 
    {
        libro l = new libro("001", "Java", 29.99, 5);
        l.setCantidadEjemplares(10); // cambiamos la cantidad
        assertEquals((Integer) 10, (Integer) l.getCantidadEjemplares()); // debe ser la nueva cantidad
    }

    // ── TEST 10: la cantidad de ejemplares puede ser 0 ────────────────
    @Test
    public void testCantidadEjemplaresCero() 
    {
        libro l = new libro("001", "Java", 29.99, 0);
        assertEquals((Integer) 0, (Integer) l.getCantidadEjemplares()); // la cantidad puede ser 0
    }
}