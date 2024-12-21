//Escreva um programa que leia uma frase e conte o número de palavras nela. Considere que as palavras estão separadas por espaços em branco.

package Lista_de_exercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Atv_07_ContadorPalavras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();

        String[] palavras = frase.trim().split("\\s+");

        System.out.println("Número de palavras: " + palavras.length);
    }


}
