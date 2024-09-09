package Ejercicios;

public class Ejercicio19 {
    public static void main(String[] args) {
        int a = 28;  // Número a verificar si es perfecto
        int sum = 0;  // Almacena la suma de los divisores

        // Encontramos los divisores de a (excluyendo el número mismo)
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {  // Si i es un divisor de a
                sum += i;  // Agregamos el divisor a la suma
            }
        }
        // Comparamos la suma de los divisores con el número original
        if (sum == a) {
            System.out.println(a + " es un número perfecto.");
        } else {
            System.out.println(a + " no es un número perfecto.");
        }
    }
}
