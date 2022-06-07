package exercicio_05;

import java.util.Scanner;

public class exercicio_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soma = 0;

        System.out.println("Digite o numero que voce quer a tabuada: ");
        int numero = scan.nextInt();

        System.out.println("A tabuada de " + numero);

        for(int i = 0; i <= 10; i++){
            soma = soma + (numero * i);
            System.out.println(numero + "X" + i + "= " + (numero * i));
            System.out.println("A soma dos resultados é :" + soma );
        }

    }
}
