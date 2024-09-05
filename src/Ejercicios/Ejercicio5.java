package Ejercicios;

public class Ejercicio5 {
    public static void main(String[] args) {
        int a = 5;
        int b = 12;
        int c = 9;
        boolean esPrimo = true;

        // Determinar numero mayor
        int mayor;
        if (a > b && a > c) {
            mayor = a;
        } else if (b > c) {
            mayor = b;
        } else {
            mayor = c;
        }
        // Mostrar el resultado
        System.out.println("El mayor número es: " + mayor);
    }
}


