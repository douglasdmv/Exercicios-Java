package algoritmo25;

/*  Digitar data em formato ddmmaa e imprimir cada um separadamente */

import java.util.Scanner;

public class alg25 {

    public static void main(String[] args) {

        Integer data, dia, mes, ano;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a data em formato ddmmaa: ");
        data = leitor.nextInt();
        dia = data / 10000;
        mes = data % 10000 / 100;
        ano = data % 1000;

        System.out.println("Dia: " + dia);
        System.out.println("Mês: " + mes);
        System.out.println("Ano: " + ano);

    }

}
