package exercicio_Fatorial;

import java.util.Scanner;

public class exercicioFatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Numero fatorial: ");
        int numero = scan.nextInt();

        int multiplicacao = 1;

        System.out.print(numero + "! = ");

        for (int i = numero ; i >= 1 ; i--){
            multiplicacao = multiplicacao * i;
        }

        System.out.println(multiplicacao);

    }
}
