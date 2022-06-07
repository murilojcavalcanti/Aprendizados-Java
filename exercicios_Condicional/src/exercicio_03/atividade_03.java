package exercicio_03;

public class atividade_03 {
    public static void main(String[] args) {
        switchSemana ();
        switchNumero ();
        switchferias ();
    }

    private static void switchSemana(){
        String dia = "terça";
        switch (dia){
            case "segunda":
                System.out.println(2);
                break;
            case "terça":
                System.out.println(3);
                break;
            case "quarta":
                System.out.println(4);
                break;
            case "quinta":
                System.out.println(5);
                break;
            case "sexta":
                System.out.println(6);
                break;
            case "sabado":
                System.out.println(7);
                break;
            case "domingo":
                System.out.println(1);
                break;
            default:
                System.out.println("dia invalido");
                break;
        }
    }

    private static void switchNumero(){
        int numero = 4;
        switch (numero) {
            case 1:
            case 2:
            case 3:
                System.out.println("correto");
                break;
            case 4:
                System.out.println("errado");
                break;
            case 5:
                System.out.println("talvez");
                break;
            case 6:
                System.out.println("valor indefinido");
                break;
            }
        }

        private static void switchferias(){
        String mes  = "setembro" ;
        switch (mes) {
            case "dezembro":
            case "janeiro":
            case "julho":
                System.out.println("ferias");
                break;
            default:
                System.out.println("mes de trabalho");
                break;
        }

    }


    }