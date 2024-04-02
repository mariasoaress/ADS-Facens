package Aula4;

import java.util.Scanner;

public class Caulculomodulo {

    public static void main(String[] args) {

        // Informa ao usuário o propósito do programa        
        System.out.println("Este programa realiza o cálculo do módulo de dois números. ");

        // Solicita e recebe o primeiro número
        System.out.println("Digite o primeiro número: ");
        Scanner scanner = new Scanner(System.in);
        int primeironumero = scanner.nextInt();

        // Solicita e recebe o segundo número
        System.out.println("Digite o segundo número: ");
        int segundonumero = scanner.nextInt();

        // Caucula o módulo dos dois números
        int modulodosnumeros = (primeironumero % segundonumero);

        // Informa ao usuário o resultado do módulo dos dois números
        System.out.println("O módulo de " + primeironumero + " e " + segundonumero + " é igual a: " + modulodosnumeros);

        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();
    }
}