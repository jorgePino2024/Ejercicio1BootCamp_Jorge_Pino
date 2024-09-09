package Ejercicios;

public class Ejercicio23 {
    public static void main(String[] args) {
        int a = 48;  // Número a verificar

        // Verificamos si es divisible por 2
        if (a % 2 == 0) {
            System.out.println(a + " Es divisible por 2.");
        } else {
            System.out.println(a + " No es divisible por 2.");
        }

        // Verificamos si es divisible por 3
        if (a % 3 == 0) {
            System.out.println(a + " Es divisible por 3.");
        } else {
            System.out.println(a + " No es divisible por 3.");
        }
        // Verificamos si es divisible por 5
        if (a % 5 == 0) {
            System.out.println(a + " Es divisible por 5.");
        } else {
            System.out.println(a + " No es divisible por 5.");
        }
    }
}
