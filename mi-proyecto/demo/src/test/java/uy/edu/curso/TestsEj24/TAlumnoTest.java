package uy.edu.curso.TestsEj24;
import uy.edu.curso.Ej24.TAlumno;
import static org.junit.Assert.*;
import org.junit.Test;


class TAlumnoTest {

    private TAlumno alumno;

   
    void setUp() {
        alumno = new TAlumno("1001", "Pedro", "Gomez");
    }
    //Obtener la informacion para verificar que se guarda bien en la creacion
    @Test
  
    void testGetNombre(){
        assertEquals("Pedro", alumno.getNombre());
        assertNotEquals("Juan", alumno.getNombre());// verificacion que la comparacion se haga correctamente
    }
    @Test
   
    void testGetApellido(){
        assertEquals("Gomez",alumno.getApellido());
        assertNotEquals("Ramirez",alumno.getApellido());// verificacion que la comparacion se haga correctamente

    }
        @Test
       
    void testGetCedula(){
        assertEquals("1001",alumno.getCedula());
        assertNotEquals("1000", alumno.getCedula()); // verificacion que la comparacion se haga correctamente

    }


}
