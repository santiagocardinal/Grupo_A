package uy.edu.curso.TestEj23;

import org.junit.Test;
import static org.junit.Assert.*;
import uy.edu.curso.Ej23.Directorio;



public class DirectorioTest {


    Directorio directorio = new Directorio();


    @Test

    public void directiorioNuevoEstaVacio() {
        assertTrue(directorio.estaVacio());
    }

    @Test
    public void directorioConSucursalNoEstaVacio() {
        directorio.agregar("Montevideo");
        assertFalse(directorio.estaVacio());
    }

    // ─── agregar()

    @Test
    public void agregarUnaSucursalAumentaCantidad() {
        directorio.agregar("Montevideo");
        assertEquals(1, directorio.cantidad());
    }

    @Test
    public void agregarTresSucursalesDevuelveCantidadTres() {
        directorio.agregar("Montevideo");
        directorio.agregar("Canelones");
        directorio.agregar("Salto");
        assertEquals(3, directorio.cantidad());
    }

    // ─── cantidad() 

    @Test
    public void cantidadEnDirectorioVacioEsCero() {
        assertEquals(0, directorio.cantidad());
    }

    @Test
    public void cantidadDisminuyeAlQuitar() {
        directorio.agregar("Montevideo");
        directorio.agregar("Canelones");
        directorio.quitar("Montevideo");
        assertEquals(1, directorio.cantidad());
    }

    // ─── buscar() 

    @Test
    public void buscarSucursalExistenteDevuelveTrue() {
        directorio.agregar("Montevideo");
        assertTrue(directorio.buscar("Montevideo"));
    }

    @Test
    public void buscarSucursalInexistenteDevuelveFalse() {
        directorio.agregar("Montevideo");
        assertFalse(directorio.buscar("Salto"));
    }

    @Test
    public void buscarEnDirectorioVacioDevuelveFalse() {
        assertFalse(directorio.buscar("Montevideo"));
    }

    // ─── quitar()

    @Test
    public void quitarSucursalExistenteYaNoPuedeEncontrarse() {
        directorio.agregar("Montevideo");
        directorio.quitar("Montevideo");
        assertFalse(directorio.buscar("Montevideo"));
    }

    @Test
    public void quitarSucursalNoAfectaLasOtras() {
        directorio.agregar("Montevideo");
        directorio.agregar("Canelones");
        directorio.agregar("Salto");
        directorio.quitar("Canelones");
        assertTrue(directorio.buscar("Montevideo"));
        assertTrue(directorio.buscar("Salto"));
    }

    @Test
    public void quitarSucursalInexistenteNoLanzaExcepcion() {
        directorio.agregar("Montevideo");
        directorio.quitar("Fanta"); 
    }

    @Test
    public void quitarUnicaSucursalDejaDirectorioVacio() {
        directorio.agregar("Montevideo");
        directorio.quitar("Montevideo");
        assertTrue(directorio.estaVacio());
    }
}