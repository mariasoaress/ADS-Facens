package Aula4;

import java.util.Scanner;

public class Perímetrodeumretangulo {
    
    public static void main(String[] args) {

        // Informa ao usuário o propósito do programa        
         System.out.println("Este programa realiza o cálculo do perímetro de um retângulo. ");

        // Solicita e recebe a medida de um dos lados do retângulo
        System.out.println("Digite a medida de um dos lados do retângulo: ");
        Scanner scanner = new Scanner(System.in);
        int lado1 = scanner.nextInt();

        // Solicita e recebe a medida de outro lado do retângulo
        System.out.println("Digite a outra medida (com valor diferente da primeira) dos lados do retângulo: ");
        int lado2 = scanner.nextInt();

        // Calcula o perímetro do retângulo
        int resultadoperimetro = lado1 + lado1 + lado2 + lado2;

        // Informa ao usuário o resultado do perímetro
        System.out.println("O resultado do perímetro de um retangulo com lados " + lado1 + " e " + lado2 + " é igual a: " + resultadoperimetro);

        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();
    }
}
