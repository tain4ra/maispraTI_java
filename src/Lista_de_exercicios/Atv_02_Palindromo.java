//Crie um programa que leia uma palavra e verifique se ela é um palíndromo (se pode ser lida da mesma forma de trás para frente). Ignore diferenças entre maiúsculas e minúsculas.

package Lista_de_exercicios;

import java.util.Scanner;

public class Atv_02_Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine().toLowerCase();

        String reverso = new StringBuilder(palavra).reverse().toString();

        if (palavra.equals(reverso)) {
            System.out.println("A palavra é um palíndromo.");
        } else {
            System.out.println("A palavra não é um palíndromo.");
        }
    }
}
