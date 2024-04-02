package Aula4;

import java.util.Scanner;

public class Areadeumquadrado {
   
   public static void main(String[] args) {

    // Informa ao usuário o propósito do programa   
       System.out.println("Este programa realiza o cálculo da área de um quadrado. ");

     // Solicita e recebe a medida de um dos lados do quadrado
       System.out.println("Digite a medida de um dos lados do quadrado: ");
       Scanner scanner = new Scanner(System.in);
       int ladodoquadrado = scanner.nextInt();

       // Caulcula a área do quadrado
       int areadoquadrado = ladodoquadrado * ladodoquadrado;

       // Informa ao usuário o resultado da área
       System.out.println("A área de um quadrado com lado " + ladodoquadrado + " é igual a " + areadoquadrado + ".");
       
       scanner.close();

   }
}

