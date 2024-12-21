//Escreva um programa que peça dois números e um operador (+, -, *, /). Realize a operação indicada e exiba o resultado.

package Lista_de_exercicios;

import java.util.Scanner;

public class Atv_01_Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double primeiroNum = sc.nextDouble();

        System.out.println("Digite o segundo número: ");
        double segundoNum = sc.nextDouble();

        System.out.println("Digite o operador (+, - , *, /");
        char opcao = sc.next().charAt(0);

        double resultado = 0;

        switch (opcao) {
            case '+':
                resultado = primeiroNum + segundoNum;
                break;
            case '-':
                resultado = primeiroNum - segundoNum;
                break;
            case '*':
                resultado = primeiroNum * segundoNum;
                break;
            case '/':
                if(primeiroNum != 0) {
                    resultado = primeiroNum / segundoNum;
                } else {
                    System.out.println("Erro: Divisão por zero");
                }
                break;
            default:
                System.out.println("Erro: Operador inválido!");
        }
        System.out.println("O resultado é: " + resultado);
    }
}
