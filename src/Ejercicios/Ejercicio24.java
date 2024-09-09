package Ejercicios;

public class Ejercicio24 {
    public static void main(String[] args) {
        int a = 3;  // Número del cual buscaremos múltiplos
        int limit = 50;  // Límite superior del rango
        int sum = 0;  // Variable para almacenar la suma de los múltiplos

        // Iteramos desde 1 hasta el límite, sumando los múltiplos de 3
        for (int i = 1; i <= limit; i++) {
            if (i % a == 0) {  // Si i es múltiplo de 3
                sum += i;  // Lo agregamos a la suma
            }
        }

        // Mostramos el resultado
        System.out.println("La suma de todos los múltiplos de " + a + " entre 1 y " + limit + " es: " + sum);
    }
}
