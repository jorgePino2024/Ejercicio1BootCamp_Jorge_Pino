package Ejercicios;

public class Ejercicio22 {
    public static void main(String[] args) {
        int a = 987654;
        int numDigitos = contarDigitosPorCadena(a);

        System.out.println("El número " + a + " tiene " + numDigitos + " dígitos.");
    }

    public static int contarDigitosPorCadena(int numero) {
        return Integer.toString(numero).length(); // Convierte el número a cadena y cuenta su longitud
    }
}
