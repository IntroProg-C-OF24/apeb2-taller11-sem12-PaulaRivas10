package problema;

import java.util.Scanner;

public class Problema_1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el numero de filas: ");
        int filas = teclado.nextInt();

        System.out.print("Ingrese el numero de columnas: ");
        int columnas = teclado.nextInt();

        int[][] matrizA = new int[filas][columnas];
        int[][] matrizB = new int[filas][columnas];
        int[][] matrizC = new int[filas][columnas];

        matrizNumAl(matrizA, filas, columnas);

        System.out.println("Matriz de numeros aleatorios:");
        presentarMatriz(matrizA, filas, columnas);

        matrizPares(matrizA, matrizB, filas, columnas);

        System.out.println("Matriz de numeros pares:");
        presentarMatriz(matrizB, filas, columnas);

        matrizImpares(matrizA, matrizC, filas, columnas);

        System.out.println("Matriz de numeros impares:");
        presentarMatriz(matrizC, filas, columnas);

        presentarPromedio(matrizA, filas, columnas);

        teclado.close();
    }

    static void matrizNumAl(int[][] matriz, int filas, int columnas) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (int) (Math.random() * 10 + 1);
            }
        }
    }

    static void presentarMatriz(int[][] matriz, int filas, int columnas) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void matrizPares(int[][] matrizA, int[][] matrizB, int filas, int columnas) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matrizA[i][j] % 2 == 0) {
                    matrizB[i][j] = matrizA[i][j];
                }
            }
        }
    }

    static void matrizImpares(int[][] matrizA, int[][] matrizC, int filas, int columnas) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matrizA[i][j] % 2 != 0) {
                    matrizC[i][j] = matrizA[i][j];
                }
            }
        }
    }

    static void presentarPromedio(int[][] matriz, int filas, int columnas) {
        int suma = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma += matriz[i][j];
            }
        }

        double promedio = (double) suma / (filas * columnas);
        System.out.println("Promedio: " + promedio);
    }
}
/*
Ingrese el numero de filas: 5
Ingrese el numero de columnas: 4
Matriz de numeros aleatorios:
6	10	5	10	
4	9	7	1	
3	9	2	3	
9	5	3	6	
2	2	7	6	

Matriz de numeros pares:
6	10	0	10	
4	0	0	0	
0	0	2	0	
0	0	0	6	
2	2	0	6	

Matriz de numeros impares:
0	0	5	0	
0	9	7	1	
3	9	0	3	
9	5	3	0	
0	0	7	0	

Promedio: 5.45
*/