package Ejercicios;

public class Ejercicio4 {
    public static void main(String[] args) {
        int a = 29;
        boolean esPrimo = true;

        // Determinar si el número es primo
        if (a <= 1) {
            esPrimo = false; // Los números menores o iguales a 1 no son primos
        } else {
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    esPrimo = false; // Si se encuentra un divisor, no es primo
                    break;
                }
            }
        }
        // Mostrar el resultado
        if (esPrimo) {
            System.out.println(a + " es un número primo.");
        } else {
            System.out.println(a + " no es un número primo.");
        }
    }
}


