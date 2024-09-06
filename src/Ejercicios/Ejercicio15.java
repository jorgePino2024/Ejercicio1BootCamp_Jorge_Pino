package Ejercicios;

public class Ejercicio15 {
    public static void main(String[] args) {
        double radio = 7.0;
        double area = calcularAreaCirculo(radio);

        System.out.println("El área del círculo con radio " + radio + " es: " + area);
    }

    public static double calcularAreaCirculo(double r) {
        return Math.PI * r * r;
    }
}
