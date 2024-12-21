//Crie um jogo em que o programa escolhe um número entre 1 e 50, e o/a usuário/a deve adivinhar. O programa informa apenas se o palpite está certo ou errado. O jogo termina quando o número é adivinhado.

package Lista_de_exercicios;

import java.util.Scanner;

public class Atv_06_JogoAdivinhacao {
    public static void main(String[] args) {
        int numeroEscolhido = (int)(Math.random() * 50) + 1;

        Scanner sc = new Scanner(System.in);

        int palpite = 0;

        System.out.println("Vamos testar seus poderes psíquicos?");
        System.out.println("Eu escolhi um número entre 1 e 50, ouça sua voz interior e tente adivinhar qual é!");

        while (palpite != numeroEscolhido) {
            System.out.print("Digite seu palpite: ");
            palpite = sc.nextInt();

            if (palpite == numeroEscolhido) {
                System.out.println("Parabéns! Você acertou o número " + numeroEscolhido + "!");
            } else {
                System.out.println("Errou! Tente novamente.");
            }
        }
    }
}
