package exercicio_02;

import java.util.Scanner;

public class exercicioConsoante {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] consoantes = new String[6];
        int quantidadeConsoante = 0;

        int count = 0;

        do {
            System.out.println("Digite a letra aqui:");
            String letra = scan.next();

            if(!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))){
                consoantes[count] = letra;
                quantidadeConsoante++;
            }
            count++;

        }while (count < consoantes.length);


        System.out.println("Consoantes: ");
        for ( String consoante: consoantes){
            if (consoante != null)
                System.out.print(consoante + " ");
        }
        System.out.println("A quantidade de consoantes é:" + quantidadeConsoante);
    }
}
