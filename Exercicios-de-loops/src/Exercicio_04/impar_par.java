package Exercicio_04;

import java.util.Scanner;

public class impar_par {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeNumero;
        int numero;
        int qtdpares = 0, qtdimpares = 0;
        int pares;


    System.out.println("qunatidade de numeros: ");
    quantidadeNumero = scan.nextInt();

    int count = 0;
    do {
        System.out.println("Digite um Numero: ");
        numero = scan.nextInt();
        if (numero % 2 == 0 ) qtdpares++;
        else  qtdimpares++;
        count++;
    }while (count < quantidadeNumero);
    do {
        pares = numero;
        System.out.println("numeros pares: " + pares);

    }while (numero % 2 != 0);

        System.out.println("Quantidade de numeros pares : " + qtdpares);
        System.out.println("Quantidade de numeros impares : " + qtdimpares);

    }
}
