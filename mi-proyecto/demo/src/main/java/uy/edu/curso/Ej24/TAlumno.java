package uy.edu.curso.Ej24;

public class TAlumno  implements Comparable<TAlumno> {
    private String cedula;
    private String nombre;
    private String apellido;
 
    public TAlumno(String cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }
 
    public String getCedula() { return cedula; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
 
    @Override
    public int compareTo(TAlumno otro) {
        return this.cedula.compareTo(otro.cedula);
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof TAlumno)) return false;
        return this.cedula.equals(((TAlumno) obj).cedula);
    }
 
    @Override
    public int hashCode() {
        return cedula.hashCode();
    }
 
    @Override
    public String toString() {
        return "[CI: " + cedula + " | " + nombre + " " + apellido + "]";
    }
}
