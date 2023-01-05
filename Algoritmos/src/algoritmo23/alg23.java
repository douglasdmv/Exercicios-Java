package algoritmo23;

/* Entrar com um número inteiro de 3 casas e imprimir o algarismo da casa das dezenas  */

import java.util.Scanner;

public class alg23 {

    public static void main(String[] args) {
        Integer n, n2;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o numero inteiro de tres casas: ");
        n = leitor.nextInt();
        n2 = n % 100 / 10;
        System.out.println("O algarismo da casa das dezenas é: " + n2);
    }

}
