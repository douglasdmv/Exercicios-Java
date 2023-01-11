package algoritmo48;

/* Sabendo-se que 100 quilowatts de energia custa um sétimo do salário mínimo, fazer um algoritmo que receba o valor do
salário mínimo e a quantidade de quilowatts gasta por uma residência e calcule: valor em reais de cada kw, valor em
reais a ser pago e valor a ser pago com desconto de 10%. */

import java.util.Scanner;

public class alg48 {

    public static void main(String[] args) {

        double salario, kwgasto, valorkw, valorpago, valordesc;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor do salario minimo: ");
        salario = leitor.nextDouble();
        System.out.println("Digite a quantidade de quilowatts gasta: ");
        kwgasto = leitor.nextDouble();
        valorkw = (salario / 7) / 100;
        valorpago = valorkw * kwgasto;
        valordesc = valorpago - (valorpago * 0.1);

        System.out.println("Valor de cada kw: " + valorkw);
        System.out.println("Valor a ser pago (R$): " + valorpago);
        System.out.println("Valor a ser pago com desconto (R$): " + valordesc);

    }

}
