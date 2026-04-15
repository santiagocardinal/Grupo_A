package com.example;

public class App {
    public static void main(String[] args) {
        //Se intento dar una ruta al estilo que se pedria pero no funcionaba 
        biblioteca biblioteca = new biblioteca("Ejercicio17y18\\src\\main\\resources\\Adquisiciones.txt");
        System.out.println("__________________________________________________________________________");
        // Procesa préstamos y devoluciones
        biblioteca.mostrarPrestamosYDevoluciones("Ejercicio17y18\\src\\main\\resources\\Prestamos.txt");
        System.out.println("__________________________________________________________________________");
        // Consultar existencias de un libro puntual
        biblioteca.consultarExistencias("978-950-999-111-2");
        System.out.println("__________________________________________________________________________");
        // Retirar un libro del catálogo y mostrar que libros se retiraron
        biblioteca.retirarLibro("978-987-999-000-1");
        biblioteca.retirarLibro("978-950-666-777-8");
        biblioteca.ordenarLibrosretirados();
        biblioteca.getLibrosRetirados();
        System.out.println("__________________________________________________________________________");
        biblioteca.ordenarPorTitulo();
        biblioteca.mostrarLibros();
        System.out.println("__________________________________________________________________________");
    }
}