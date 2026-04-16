package uy.edu.curso.Ej24;

public class Tdaconjuntos<T extends Comparable<T>>{
    private TDAlista<T> lista;
    
    public Tdaconjuntos(){
        this.lista = new TDAlista<>();
    }
    public void agregar(T elemento){
        if(!lista.buscar(elemento)){
            lista.insertarOrdenado(elemento);
        }
    }

    public boolean contiene(T elemento){
        return lista.buscar(elemento);
    }

    public void eliminar(T elemento){
        lista.eliminar(elemento);
    }

    public int tamanio() { 
        return lista.longitud(); 

    }

 
    public boolean estaVacio() { 
        return lista.estaVacia();

     }
 
    public void imprimir() { 
        lista.imprimir(); 

    }
    public Tdaconjuntos<T> union(Tdaconjuntos<T> otro) {
        Tdaconjuntos<T> l3 = new Tdaconjuntos<>();
        int i =0;
        int j =0;
        TDAlista<T> l1 = this.lista;
        TDAlista<T> l2 = otro.lista;

        while (i <= l1.longitud()-1 && j<= l2.longitud()-1) {
            T eleml1 = l1.obtener(i);
            T eleml2 = l2.obtener(j);
            int cmp = eleml1.compareTo(eleml2);

            if (cmp <0){
                l3.lista.insertar(eleml1);  //Agrega el elemento de la primera lista l1
                i++ ;
            }
            else if (cmp >0){               //Agrega el elemento en la segunda lista l1
                l3.lista.insertar(eleml2);
                j++;
            }
            else{                           //Si el elemento comparado es igual esto hace que solo se agrege una unica vez
                l3.lista.insertar(eleml1);
                i++;
                j++;
            }
            
        }
        // Agregar los elementos restantes de L1
        while (i <= l1.longitud() - 1) {
            l3.lista.insertar(l1.obtener(i));
            i++;
        }
 
        // Agregar los elementos restantes de L2
        while (j <= l2.longitud() - 1) {
            l3.lista.insertar(l2.obtener(j));
            j++;
        }
 
        return l3;

    }
        public Tdaconjuntos<T> interseccion(Tdaconjuntos<T> otro) {
        Tdaconjuntos<T> l3 = new Tdaconjuntos<>();
 
        int i = 0;
        int j = 0;
        TDAlista<T> l1 = this.lista;
        TDAlista<T> l2 = otro.lista;
 
        while (i <= l1.longitud() - 1 && j <= l2.longitud() - 1) {
            T elemL1 = l1.obtener(i);
            T elemL2 = l2.obtener(j);
            int cmp = elemL1.compareTo(elemL2);
 
            if (cmp < 0) {
                // L1[I] < L2[J]: avanzar solo I
                i++;
            } else if (cmp > 0) {
                // L1[I] > L2[J]: avanzar solo J
                j++;
            } else {
                // L1[I] == L2[J]: elemento común → agregar a L3
                l3.lista.insertar(elemL1);
                i++;
                j++;
            }
        }
 
        return l3;
    }
}
