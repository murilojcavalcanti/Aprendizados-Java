package exercicio_01;

import java.util.Scanner;

public class exercicio_nome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;
        while( true ){
            System.out.println("nome: ");
            nome = scan.next();

            System.out.println("Idade: ");
            idade = scan.nextInt();
            if( idade > 35 ) break;

        }

        System.out.println("");


    }


}
