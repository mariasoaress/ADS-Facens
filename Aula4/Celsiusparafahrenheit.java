package Aula4;

import java.util.Scanner;

public class Celsiusparafahrenheit {

    public static void main(String[] args) {
        
        // Informa ao usuário o propósito do programa
        System.out.println("Este programa realiza a conversão de Celsius para Fahrenheit. ");

        // Solicita e recebe a temperatura em Celsius
        System.out.println("Digite a temperatura em celsius que deseja converter: ");
        Scanner scanner = new Scanner(System.in);
        int tempemcelsius = scanner.nextInt();

        // Converte a temperatura para fahrenheit
        int resultadoemfahrenheit = (int) ((tempemcelsius * 1.8) + 32);

        // Informa ao usuário o resultado da conversão
        System.out.println("O resultado de " + tempemcelsius + " °C em Fahrenheit é igual a: " + resultadoemfahrenheit + "°F.");

        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();

    }
}
