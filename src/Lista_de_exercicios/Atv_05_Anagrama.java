//Escreva um programa que receba duas palavras e determine se elas são anagramas (se possuem as mesmas letras, mas em ordem diferente). Exemplo: "amor" e "roma".

package Lista_de_exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Atv_05_Anagrama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira palavra: ");
        String palavra1 = sc.nextLine().toLowerCase();

        System.out.println("Digite a segunda palavra: ");
        String palavra2 = sc.nextLine().toLowerCase();

        char[] letras1 = palavra1.toCharArray();
        char[] letras2 = palavra2.toCharArray();

        Arrays.sort(letras1);
        Arrays.sort(letras2);

        if (Arrays.equals(letras1, letras2)) {
            System.out.println("As palavras são anagramas.");
        } else {
            System.out.println("As palavras não são anagramas.");
        }
    }
}
