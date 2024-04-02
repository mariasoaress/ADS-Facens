package Aula4;

import java.util.Scanner;

public class Horasparaminutos {
    
    public static void main(String[] args) {

        // Informa ao usuário o propósito do programa        
        System.out.println("Este programa realiza a conversão de horas para minutos.");

        // Solicita e recebe a medida em horas
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a hora que deseja converter:");
        int horaconverter = scanner.nextInt();

        // Converte a hora para minutos
        int resultado = horaconverter * 60;

        // Informa ao usuário o resultado da conversão
        System.out.println("O resultado de " + horaconverter + " horas em minutos é: " + resultado + " minutos");

        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();
        }
}
