package Ejercicios;

public class Ejercicio20 {
    public static void main(String[] args) {
        int a = 153;  // Número a verificar
        int original = a;  // Guardamos el número original
        int numDigits = String.valueOf(a).length();  // Contamos el número de dígitos
        int sum = 0;

        // Sumamos los dígitos elevados a la potencia del número de dígitos
        while (a != 0) {
            int digit = a % 10;  // Obtenemos el último dígito
            sum += Math.pow(digit, numDigits);  // Elevamos el dígito y lo sumamos
            a /= 10;  // Eliminamos el último dígito del número
        }

        // Comparamos la suma con el número original
        if (sum == original) {
            System.out.println(original + " es un número Armstrong.");
        } else {
            System.out.println(original + " no es un número Armstrong.");
        }
    }
}
