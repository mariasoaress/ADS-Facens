package Aula4;

import java.util.Scanner;

public class Quadradodeumnumero {
    
    public static void main(String[] args) {
        
     // Informa ao usuário o propósito do programa
     System.out.println("Este programa realiza o cálculo do quadrado de um número.");

     // Solicita e recebe o número para calculo do quadrado
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o número que deseja caulcular o quadrado:");
    int numeroacalcular = scanner.nextInt();

    // Calcula o quadrado do número solicitado
    int quadradodonumero = numeroacalcular * numeroacalcular;

    // Informa ao usuário o resultado do quadrado
    System.out.println("O quadrado de " + numeroacalcular + " é: " + quadradodonumero);

    // Fecha o scanner para evitar vazamento de recursos
    scanner.close();
    
    }
}
