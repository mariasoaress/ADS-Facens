package Aula4;

import java.util.Scanner;

public class Perimetrodeumquadrado {
    
    public static void main(String[] args) {

        // Informa ao usuário o propósito do programa        
        System.out.println("Este programa realiza o cálculo do perímetro de um quadrado.");

        // Solicita e recebe a medida de um dos lados do quadrado
        System.out.println("Digite a medida de um dos lados do quadrado: ");
        Scanner scanner = new Scanner(System.in);
        int ladodoquadrado = scanner.nextInt();

        // Caucula o perímetro do quadrado
        int resultadoperimetro = ladodoquadrado * 4;

        // Informa ao usuário o resultado do perímetro
        System.out.println("O perimetro de um quadrado com lado " + ladodoquadrado + " é igual: " + resultadoperimetro);

        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();
        
    }
}
