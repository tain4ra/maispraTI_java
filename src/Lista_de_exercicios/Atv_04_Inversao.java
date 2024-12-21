package Lista_de_exercicios;

import java.util.Scanner;

public class Atv_04_Inversao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para reverter: ");
        int num = sc.nextInt();

        String numString = Integer.toString(num);

        String inversoString = new StringBuilder(numString).reverse().toString();

        int inverso = Integer.parseInt(inversoString);

        System.out.println("Número invertido: " + inverso);

    }
}
