package uy.edu.curso.Ej24;
public class Main {
    public static void main(String[] args){
        //Creacion de alumnos
        TAlumno a1 =new TAlumno("1001","Pedro","Gomez");
        TAlumno a2 =new TAlumno("1002","Maria","Lopez");
        TAlumno a3 =new TAlumno("1003","Juan","Perez");
        TAlumno a4 =new TAlumno("1004","Ana","Garcia");
        TAlumno a5 =new TAlumno("1005","Luis","Martinez");
        TAlumno a6 =new TAlumno("1006","Sofia","Rodriguez");
        TAlumno a7 =new TAlumno("1007","Carlos","Sanchez");
        // Agrego alumnos a las respectivas Clases (es decir las Listas)
        //Primo AED1
        Tdaconjuntos<TAlumno> aed1 = new Tdaconjuntos<>();
        aed1.agregar(a1);
        aed1.agregar(a2);
        aed1.agregar(a3);
        aed1.agregar(a4);
        aed1.agregar(a5);
        //Segundo PF
        Tdaconjuntos<TAlumno> pf = new Tdaconjuntos<>();
        pf.agregar(a3);
        pf.agregar(a4); 
        pf.agregar(a5);
        pf.agregar(a6);
        pf.agregar(a7);
        //Realizo la union de ambos conjuntos para mostrar la cantidad de alumnos estan inscriptos a los 2 Clases
        Tdaconjuntos<TAlumno> union = aed1.union(pf);
        System.out.println("Cantidad de alumnos inscriptos a ambos Clases: " + union.tamanio());
        //Realizo la interseccion de amboos conjuntos para mostrar la cantidad de alumnos estan inscriptos a ambos Clases
        Tdaconjuntos<TAlumno> inter = aed1.interseccion(pf);
        System.out.println("Cantidad de alumnos inscriptos a ambos Clases: " + inter.tamanio());

    }   

}
