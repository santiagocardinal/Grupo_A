package uy.edu.curso.Ej23;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {

        // Pregunta 1: cargar sucursales.txt (suc1.txt renombrado) 
        Directorio directorio = new Directorio();
        cargarArchivo(directorio, "mi-proyecto/demo/src/main/java/uy/edu/curso/Ej23/Sucursales/sucursales.txt");

        System.out.println("PREGUNTA 1");
        System.out.println("Cantidad de sucursales: " + directorio.cantidad());
        System.out.println("Lista de sucursales:");
        directorio.mostrar();

        // Pregunta 2: eliminar Chicago, ver qué sigue después de Hong Kong 
        System.out.println("\nPREGUNTA 2");
        directorio.quitar("Chicago");
        System.out.println("Lista después de eliminar Chicago:");
        directorio.mostrar();

        // Pregunta 3: Con suc2.txt, eliminar Shenzhen y Tokio 
        System.out.println("\nPREGUNTA 3");
        Directorio dir2 = new Directorio();
        cargarArchivo(dir2, "mi-proyecto/demo/src/main/java/uy/edu/curso/Ej23/Sucursales/suc2.txt");
        dir2.quitar("Shenzhen");
        dir2.quitar("Tokio");
        System.out.println("Cantidad después de eliminar Shenzhen y Tokio: " + dir2.cantidad());
        System.out.println("¿Esta vacío? " + dir2.estaVacio());
        dir2.mostrar();


        // Pregunta 4: imprimir suc3 con ";" 
        System.out.println("\nPREGUNTA 4");
        Directorio dir3 = new Directorio();
        cargarArchivo(dir3, "mi-proyecto/demo/src/main/java/uy/edu/curso/Ej23/Sucursales/suc3.txt");
        System.out.println("Imprimir con ';':");
        dir3.imprimir(";");
    }

    public static void cargarArchivo(Directorio directorio, String ruta) {
        try (BufferedReader lector = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                linea = linea.trim();
                if (!linea.isEmpty()) {
                    directorio.agregar(linea);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}