package uy.edu.curso.Ej26;

import java.util.List;
import java.util.Stack;

public class Expresion {
private Stack<Character> pila=new Stack<>(); //utilización de la clase Stack de Java
    public Expresion(){}
    public boolean controlCorchetes(List<Character> listaDeEntrada)
    {
        for(int i=0; i<listaDeEntrada.size();i++)//recorre cada character de la lista.
        {
            char a=listaDeEntrada.get(i);
            if(a=='{'){ //agrega a la pila el character correspondiente
                pila.push('{');
            }
            else{
                if (a=='}'){
                    pila.push('}');
                }
            }
            if((pila.size()>1)&&(pila.peek()=='}')){ //como los corchetes agregados a la pila quedan en orden inverso (el último elemento de la lista, es el tope de la pila), se fija si el +ultimo agregado es un corchete de cierre
                pila.pop(); //si lo es, lo elimina
                if(pila.peek()=='{'){ //si el ahora último (antes penúltimo) de la pila es un corchete de apertura, también lo elimina, de esta manera, si la secuencia es correcta, al final la pila queda vacía
                    pila.pop();
                }else{
                    pila.push('}'); //sino vuelve a agregar el corchete de cierre y la lista vuelve a estar igual que antes de entrar al if
                }
            }
        }
        if(pila.isEmpty()){return(true);}
        else{return(false);}
    }
}
