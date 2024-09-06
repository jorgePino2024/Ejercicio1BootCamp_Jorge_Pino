package Ejercicios;

import java.math.BigInteger;

public class Ejercicio11 {
        public static void main(String[] args) {
            int n = 10; // El índice del número de Fibonacci que se desea calcular
            int resultado = fibonacci(n);

            System.out.println("El número de Fibonacci en la posición " + n + " es: " + resultado);
        }

        public static int fibonacci(int n) {
            if (n <= 1) {
                return n;
            }
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

