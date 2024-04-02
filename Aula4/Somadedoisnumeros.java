package Aula4;

import java.util.Scanner;

public class Somadedoisnumeros {
    
    public static void main(String[] args) {
        
        // Informa ao usuário o propósito do programa
        System.out.println("Este programa realiza a soma de dois números inteiros.");

        // Solicita e recebe o primeiro número
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();

        // Solicita e recebe o segundo número
        System.out.print("Digite o segundo número: ");
        int segundoNumero = scanner.nextInt();

        // Realiza a soma dos números solicitados
        int resultadoSoma = primeiroNumero + segundoNumero;

        // Informa ao usuário o resultado da soma dos dois números
        System.out.println("A soma de " + primeiroNumero + " e " + segundoNumero + " é: " + resultadoSoma);

        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();
        
    }
    }
