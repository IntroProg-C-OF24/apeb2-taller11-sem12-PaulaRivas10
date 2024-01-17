package problema;

import java.util.Scanner;

public class Problema_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double not1, not2, not3, not4, prom;
        String promCualitativo;
        System.out.print("Ingrese nota 1: ");
        not1 = scanner.nextDouble();
        System.out.print("Ingrese nota 2: ");
        not2 = scanner.nextDouble();
        System.out.print("Ingrese nota 3: ");
        not3 = scanner.nextDouble();
        System.out.print("Ingrese nota 4: ");
        not4 = scanner.nextDouble();
        prom = promTotal(not1, not2, not3, not4);
        promCualitativo = promCualitativo(prom);
        System.out.println("El promedio cualitativo es: " + promCualitativo);
    }
     static double promTotal(double nota1, double nota2, double nota3, double nota4) {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }
     static String promCualitativo(double promedio) {
        String promCualitativo;
        if (promedio >= 0 && promedio <= 5) {
            promCualitativo = "Regular";
        } else if (promedio > 5 && promedio <= 8) {
            promCualitativo = "Bueno";
        } else if (promedio > 8 && promedio <= 9) {
            promCualitativo = "Muy Bueno";
        } else {
            promCualitativo = "Sobresaliente"; 
        }
        return promCualitativo;
    }
}
/*
Ingrese nota 1: 7
Ingrese nota 2: 9,5
Ingrese nota 3: 5
Ingrese nota 4: 10
El promedio cualitativo es: Bueno
*/

 

