//Implemente um programa que calcule e exiba os primeiros n números da sequência de Fibonacci. n deve ser fornecido pelo/a usuário/a.

package Lista_de_exercicios;

import java.util.Scanner;

public class Atv_03_Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de números a ser exibida: ");
        int sequencia = sc.nextInt();

        int a = 0, b = 1, c;

        System.out.print("Sequência de Fibonacci: " + a + " " + b);

        for (int i = 2; i < sequencia; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}
