package Ejercicios;

public class Ejercicio13 {
    public static void main(String[] args) {
        int a = 1229;  // Número a verificar si es palíndromo
        int original = a;  // Guardar el valor original del número
        int reversa = 0;  // Esta variable almacenará el número invertido

        // Invertimos el número
        while (a != 0) {
            int digit = a % 10;  // Obtener el último dígito del número
            reversa = reversa * 10 + digit;  // Agregar el dígito al número invertido
            a /= 10;  // Elimina el último dígito del número original
        }

        // Comparamos el número original con el número invertido
        if (original == reversa) {
            System.out.println(original + " es un número Palíndromo.");
        } else {
            System.out.println(original + " no es un número Palíndromo.");
        }
    }
}
