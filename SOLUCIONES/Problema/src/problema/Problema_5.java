package problema;

import java.util.Random;

public class Problema_5 {

    public static void main(String[] args) {
        int filas = 3;
        int columnas = 3;
        int[][] matrizA = new int[filas][columnas];

        llenarMatriz(matrizA, filas, columnas);
        System.out.println("Elementos en la matriz:");
        presentarMatriz(matrizA, filas, columnas);

        System.out.println("La suma de los elementos es: " + sumaMatriz(matrizA, filas, columnas));
        System.out.println("La resta de los elementos es: " + restarMatriz(matrizA, filas, columnas));
        System.out.println("La multiplicacion de los elementos es: " + multiplicacionMatriz(matrizA, filas, columnas));
    }

    static void llenarMatriz(int[][] matriz, int filas, int columnas) {
        Random random = new Random();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(9) + 1;
            }
        }
    }

    static void presentarMatriz(int[][] matriz, int filas, int columnas) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println("");
        }
    }

    static int sumaMatriz(int[][] matriz, int filas, int columnas) {
        int suma = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }

    static int restarMatriz(int[][] matriz, int filas, int columnas) {
        int resta = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i == 0 && j == 0) {
                    resta = matriz[i][j];
                } else {
                    resta -= matriz[i][j];
                }
            }
        }
        return resta;
    }

    static int multiplicacionMatriz(int[][] matriz, int filas, int columnas) {
        int multiplicacion = 1;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                multiplicacion *= matriz[i][j];
            }
        }
        return multiplicacion;
    }
}
/*
Elementos en la matriz:
2 | 6 | 4 | 
9 | 1 | 7 | 
8 | 8 | 6 | 
La suma de los elementos es: 51
La resta de los elementos es: -47
La multiplicacion de los elementos es: 1161216
*/