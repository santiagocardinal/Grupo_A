package uy.edu.curso.TestsEj26;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

import uy.edu.curso.Ej26.Expresion;


public class ExpresionTests {
    private Expresion exp;
    private List<Character> lista;
    private boolean result;
@Before
    public void SetUp() {
        exp=new Expresion();
    }
@Test
    public void CreaInstancia() {
        assertNotEquals(exp, null);
    }
@Test
    public void TestTrueBasico() {
        lista=List.of('{','}');
        result=exp.controlCorchetes(lista);
        assertTrue(result);
    }
@Test
    public void TestFalseBasico() {
        lista=List.of('{');
        boolean result=exp.controlCorchetes(lista);
        assertFalse(result);
    }
@Test
    public void TestCasoLimite() {
        lista=List.of();
        boolean result=exp.controlCorchetes(lista);
        assertTrue(result);
    }
@Test
    public void TestsBasicos() {
        lista=List.of('{','{','{','{');
        boolean result=exp.controlCorchetes(lista);
        assertFalse(result);
    }
@Test
    public void TestsBasicos2() {
        lista=List.of('{','{','{','{','}','}','}','}');
        boolean result=exp.controlCorchetes(lista);
        assertTrue(result);
    }
@Test
    public void CasoDeEjemploLetra() {
        lista=List.of('{','}','{','{','}','}');
        boolean result=exp.controlCorchetes(lista);
        assertTrue(result);
    }
@Test
    public void CasoDeEjemploLetra2() {
        lista=List.of('{','{','}','{','{','}');
        boolean result=exp.controlCorchetes(lista);
        assertFalse(result);
    }
}
