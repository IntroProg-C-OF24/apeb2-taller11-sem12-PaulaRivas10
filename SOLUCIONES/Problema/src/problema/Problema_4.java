package problema;

import java.util.Scanner;

public class Problema_4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        String nom, ced;
        System.out.println("Ingrese una opcion:");
        System.out.println("1. Valor de la planilla de luz");
        System.out.println("2. Valor del predio");
        opcion = teclado.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Cliente: ");
                nom = teclado.next();
                System.out.print("Cedula: ");
                ced = teclado.next();
                calcularValorLuz(nom, ced);
                break;
            case 2:
                System.out.print("Cliente: ");
                nom = teclado.next();
                System.out.print("Cedula: ");
                ced = teclado.next();
                calcularPredio(nom, ced);
                break;
            default:
                System.out.println("Ingrese solo opcion 1 o 2");
        }
    }

    static void calcularValorLuz(String nom, String ced) {
        Scanner teclado = new Scanner(System.in);
        double valorKw, numKw, pago;
        System.out.print("Valor del kilowatio: ");
        valorKw = teclado.nextDouble();
        System.out.print("Numero de kilowatios usados en el mes: ");
        numKw = teclado.nextDouble();
        pago = valorKw * numKw;
        System.out.println("Cliente " + nom + " con cedula " + ced + " cancela el valor de $" + pago);
    }

    static void calcularPredio(String nom, String ced) {
        Scanner teclado = new Scanner(System.in);
        double inmueble, predio;
        System.out.print("Valor del inmueble: ");
        inmueble = teclado.nextDouble();
        predio = inmueble * 0.02;
        System.out.println("Cliente " + nom + " con cedula " + ced + " tiene un bien inmueble valorado en $" + inmueble + " y tiene que pagar de predio $" + predio);
    }
}
/*
Ingrese una opcion:
1. Valor de la planilla de luz
2. Valor del predio
1
Cliente: Paula
Cedula: 1150027189
Valor del kilowatio: 1,25
Numero de kilowatios usados en el mes: 234
Cliente Paula con cedula 1150027189 cancela el valor de $292.5
*/