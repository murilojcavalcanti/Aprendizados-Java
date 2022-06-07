package exercicio_03;

import java.util.Scanner;

public class exercicio_maior_media {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero;
        int maior = 0;
        int soma = 0;
        int media;
        int contador = 0;

        do{
            System.out.println("Número:  ");
            numero = scan.nextInt();
            soma = soma + numero;
            media = soma / 5;
            if (numero > maior) maior = numero;

            contador = ++contador;

        }while (contador < 5);

        System.out.println(" O maior numero é :" + maior);
        System.out.println("A soma é : " + soma);
        System.out.println(" A media é igual a:" + media);


    }

}

