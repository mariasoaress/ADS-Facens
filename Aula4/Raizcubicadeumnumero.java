package Aula4;

import java.util.Scanner;

public class Raizcubicadeumnumero {
    
    public static void main(String[] args) {
        
        // Informa ao usuário o propósito do programa
          System.out.println("Este programa realiza o cálculo da raiz cúbica de um número: ");

          // Solicita e recebe o número para calcular a raiz cúbica
        System.out.println("Digite o número que deseja calcular a raiz cúbica: ");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        // Calcula a raiz cúbica do número solicitado
        double raizcubica = Math.cbrt(numero);

        // Informa ao usuário o resultado da raiz cúbica
        System.out.println("A raiz cúbica de " + numero + " é: " + raizcubica);

        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();
        
    }
}
