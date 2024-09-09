package Ejercicios;

public class Ejercicio25 {
    public static void main(String[] args) {
        int n = 7;  // Número para el cual queremos la tabla de multiplicar
        int limit = 10;  // Hasta qué número queremos multiplicar (tabla de 10)

        System.out.println("Tabla de multiplicar del " + n);

        // Ciclo para generar la tabla de multiplicar
        for (int i = 1; i <= limit; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}


