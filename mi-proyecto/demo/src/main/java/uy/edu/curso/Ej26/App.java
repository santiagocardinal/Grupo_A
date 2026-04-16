package uy.edu.curso.Ej26;
import java.util.*;

public class App {

    public static void main(String[] args) {
        Expresion exp = new Expresion();
        List<Character> lista;
        lista = List.of('{', '{', '}', '}');
        System.out.println(exp.controlCorchetes(lista)); //debería imprimir "true"
        lista = List.of('{', '{', '}', '}', '}', '}');
        System.out.println(exp.controlCorchetes(lista)); //debería imprimir "false"
        lista = List.of('{', '{', '}', '}', '{', '}', '{', '{', '}', '}');
        System.out.println(exp.controlCorchetes(lista)); //debería imprimir "true"
        lista = List.of('}');
        System.out.println(exp.controlCorchetes(lista)); //debería imprimir "false"
    }
}
