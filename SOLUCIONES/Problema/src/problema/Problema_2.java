package problema;

import java.util.Scanner;

public class Problema_2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double base, altura, area, lado;
        int opcion;

        System.out.println("Ingresa una opcion");
        System.out.println("[1] Area del cuadrado");
        System.out.println("[2] Area del triangulo");
        System.out.println("[3] Area del rectangulo");
        opcion = teclado.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Lado del cuadrado:");
                lado = teclado.nextDouble();
                area = areaCuadrado(lado);
                System.out.println("Area del cuadrado: " + area);
                break;
            case 2:
                System.out.println("Base del triangulo:");
                base = teclado.nextDouble();
                System.out.println("Altura del triangulo:");
                altura = teclado.nextDouble();
                area = areaTriangulo(base, altura);
                System.out.println("Area del triangulo: " + area);
                break;
            case 3:
                System.out.println("Base del rectangulo:");
                base = teclado.nextDouble();
                System.out.println("Altura del rectangulo:");
                altura = teclado.nextDouble();
                area = areaRectangulo(base, altura);
                System.out.println("Area del rectangulo: " + area);
                break;
            default:
                System.out.println("No existe esta opcion");
        }
    }

    static double areaCuadrado(double lado) {
        return lado * lado;
    }

    static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    static double areaRectangulo(double base, double altura) {
        return base * altura;
    }
}
/*
Ingresa una opcion
[1] Area del cuadrado
[2] Area del triangulo
[3] Area del rectangulo
2
Base del triangulo:
34
Altura del triangulo:
67
Area del triangulo: 1139.0
*/
