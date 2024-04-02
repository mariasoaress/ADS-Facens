package Aula4;

import java.util.Scanner;

public class Idadeparadias {

    public static void main(String[] args) {
        
        // Informa ao usuário o propósito do programa
        System.out.println("Este programa realiza a conversão de idade em dias. ");

        // Solicita e recebe a idade a converter
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a idade que deseja converter: ");
        int idadeaconverter = scanner.nextInt();

        // Realiza a conversão a idade para dias
        int resultadoemdias = idadeaconverter * 365;

        // Informa ao usuário o resultado da conversão
        System.out.println("O resultado de " + idadeaconverter + " anos em dias é: " + resultadoemdias + " dias." );

        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();

    }
    
}
