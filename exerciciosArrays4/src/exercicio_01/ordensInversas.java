package exercicio_01;

import java.util.Scanner;

public class ordensInversas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetor = {32, 12, 16, 79, 72, 10, 93};
        int count = 0;
        System.out.print("vetor: ");
        while(count < (vetor.length)){
            System.out.print(vetor[count] + " ");
            count++;
        }
        System.out.print( "\n vetor inverso: ");
        for (int i = (vetor.length-1); i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }
    }
}
