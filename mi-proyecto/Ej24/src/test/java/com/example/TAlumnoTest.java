package com.example; 
import com.TAlumno;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Tests para TAlumno")
class TAlumnoTest {

    private TAlumno alumno;

    @BeforeEach
    void setUp() {
        alumno = new TAlumno("1001", "Pedro", "Gomez");
    }
    //Obtener la informacion para verificar que se guarda bien en la creacion
    @Test
    @DisplayName("Obtener el Nombre del Alumno")
    void testGetNombre(){
        assertEquals("Pedro", alumno.getNombre());
        assertNotEquals("Juan", alumno.getNombre());// verificacion que la comparacion se haga correctamente
    }
    @Test
    @DisplayName("Obtener el Apellido del Alumno")
    void testGetApellido(){
        assertEquals("Gomez",alumno.getApellido());
        assertNotEquals("Ramirez",alumno.getApellido());// verificacion que la comparacion se haga correctamente

    }
        @Test
    @DisplayName("Obtener la Cedula del Alumno")
    void testGetCedula(){
        assertEquals("1001",alumno.getCedula());
        assertNotEquals("1000", alumno.getCedula()); // verificacion que la comparacion se haga correctamente

    }


}
