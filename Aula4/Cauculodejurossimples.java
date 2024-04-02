package Aula4;

import java.util.Scanner;

public class Cauculodejurossimples {
        public static void main(String[] args) {
            
        // Informa ao usuário o propósito do programa
        System.out.println("Este programa realiza o cálculo de juros simples. ");
    
        // Solicita e recebe o valor inicial
        System.out.println("Digite o valor inicial (capital inicial): ");
        Scanner scanner = new Scanner(System.in);
        int capitalinicial = scanner.nextInt();
    
        // Solicita e recebe a taxa de juros em porcentagem
        System.out.println("Digite a taxa de juros (em porcentagem): ");
        int taxadejuros = scanner.nextInt();

        // Solicita e recebe o tempo em meses    
        System.out.println("Digite o tempo (em meses): ");
        int tempodojuros = scanner.nextInt();
    
        // Calcula o valor dos juros simples
        int jurosvalor = (int) (capitalinicial * taxadejuros* tempodojuros) / 100;
    
        // Informa ao usuário o resultado dos juros simples
        System.out.println("O valor dos juros é a: " + jurosvalor);
    
        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();
        }
    }
    
