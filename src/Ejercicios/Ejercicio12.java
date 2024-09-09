package Ejercicios;

public class Ejercicio12 {
    public static void main(String[] args) {
        int a = 54321;
        int reversa = 0;

        while (a != 0) {
            int digit = a % 10;  // obtener el último dígito
            reversa = reversa * 10 + digit;  // agregar el dígito a la posición correcta en el número invertido
            a /= 10;  // eliminar el último dígito del número original
        }

        System.out.println(" El Número invertido: " + reversa);
    }
}
