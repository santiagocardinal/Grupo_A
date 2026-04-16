package uy.edu.curso.TestsEj24;

import uy.edu.curso.Ej24.TAlumno;
import uy.edu.curso.Ej24.Tdaconjuntos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TdaconjuntosTest {

    @Test
    void testUnionBasica() {
        TAlumno a1 = new TAlumno("1001", "Ana", "García");
        TAlumno a2 = new TAlumno("1002", "Bruno", "López");
        TAlumno a3 = new TAlumno("1003", "Carla", "Martínez");
        TAlumno a4 = new TAlumno("1004", "Diego", "Fernández");
        TAlumno a5 = new TAlumno("1005", "Elena", "Pérez");
        TAlumno a6 = new TAlumno("1006", "Fabián", "Rodríguez");
        TAlumno a7 = new TAlumno("1007", "Gabriela", "Torres");

        Tdaconjuntos<TAlumno> aed1 = new Tdaconjuntos<>();
        aed1.agregar(a1);
        aed1.agregar(a2);
        aed1.agregar(a3);
        aed1.agregar(a4);
        aed1.agregar(a5);

        Tdaconjuntos<TAlumno> pf = new Tdaconjuntos<>();
        pf.agregar(a3);
        pf.agregar(a5);
        pf.agregar(a6);
        pf.agregar(a7);

        Tdaconjuntos<TAlumno> union = aed1.union(pf);

        assertEquals(7, union.tamanio(), "La unión debería tener 7 alumnos sin duplicados");
    }

    @Test
    void testInterseccionBasica() {
        TAlumno a3 = new TAlumno("1003", "Carla", "Martínez");
        TAlumno a5 = new TAlumno("1005", "Elena", "Pérez");

        Tdaconjuntos<TAlumno> aed1 = new Tdaconjuntos<>();
        aed1.agregar(a3);
        aed1.agregar(a5);

        Tdaconjuntos<TAlumno> pf = new Tdaconjuntos<>();
        pf.agregar(a3);
        pf.agregar(a5);

        Tdaconjuntos<TAlumno> inter = aed1.interseccion(pf);

        assertEquals(2, inter.tamanio(), "La intersección debería tener 2 alumnos");
    }

    @Test
    void testUnionConVacio() {
        Tdaconjuntos<TAlumno> vacio = new Tdaconjuntos<>();
        Tdaconjuntos<TAlumno> normal = new Tdaconjuntos<>();

        normal.agregar(new TAlumno("2001", "Hugo", "Díaz"));
        normal.agregar(new TAlumno("2002", "Irene", "Sosa"));

        Tdaconjuntos<TAlumno> resultado = normal.union(vacio);

        assertEquals(2, resultado.tamanio(), "Unión con vacío debería mantener tamaño");
    }

    @Test
    void testInterseccionConVacio() {
        Tdaconjuntos<TAlumno> vacio = new Tdaconjuntos<>();
        Tdaconjuntos<TAlumno> normal = new Tdaconjuntos<>();

        normal.agregar(new TAlumno("2001", "Hugo", "Díaz"));

        Tdaconjuntos<TAlumno> resultado = normal.interseccion(vacio);

        assertEquals(0, resultado.tamanio(), "Intersección con vacío debería ser 0");
    }

    @Test
    void testUnionConsigoMismo() {
        Tdaconjuntos<TAlumno> normal = new Tdaconjuntos<>();

        normal.agregar(new TAlumno("2001", "Hugo", "Díaz"));
        normal.agregar(new TAlumno("2002", "Irene", "Sosa"));

        Tdaconjuntos<TAlumno> resultado = normal.union(normal);

        assertEquals(2, resultado.tamanio(), "No debe duplicar elementos");
    }

    @Test
    void testInterseccionConsigoMismo() {
        Tdaconjuntos<TAlumno> normal = new Tdaconjuntos<>();

        normal.agregar(new TAlumno("2001", "Hugo", "Díaz"));
        normal.agregar(new TAlumno("2002", "Irene", "Sosa"));

        Tdaconjuntos<TAlumno> resultado = normal.interseccion(normal);

        assertEquals(2, resultado.tamanio(), "Debe ser igual al conjunto original");
    }
}
