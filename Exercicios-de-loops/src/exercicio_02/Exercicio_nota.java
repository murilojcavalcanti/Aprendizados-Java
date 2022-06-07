package exercicio_02;

import java.util.Scanner;

public class Exercicio_nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Digite a nota: ");
        nota = scan.nextInt();
        while (nota < 0 | nota > 10){
            System.out.println("nota invalida! Digite a nota novamente: ");
            nota = scan.nextInt();
        }


    }
}
