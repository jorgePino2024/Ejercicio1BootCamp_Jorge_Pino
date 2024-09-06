package Ejercicios;

import java.math.BigInteger;

public class Ejercicio10 {
    public static void main(String[] args) {
        int numero = 50; // Puedes cambiar este valor para calcular el factorial de otro número
        BigInteger factorial = calcularFactorial(numero);

        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
    public static BigInteger calcularFactorial(int n) {
        BigInteger resultado = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            resultado = resultado.multiply(BigInteger.valueOf(i));
        }
        return resultado;
    }
}

