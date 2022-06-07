package exercicio_02;

public class operadores_logicos {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        int i1 = 25;
        int i2 = 95;

        float f1 = 37f;
        float f2 = 49f;

        System.out.println("b1 && b2 " + (b1 && b2));
        System.out.println("b1 && b3 " + (b1 && b3));
        System.out.println("b2 || b3 " + (b2 || b3));
        System.out.println("b2 || b4 " + (b2 || b4));
        System.out.println("b1 ^ b3 " + (b1 ^ b3));
        System.out.println("b2 ^ b4 " + (b1 ^ b4));
        System.out.println("!b1 " + (!b1 ));
        System.out.println("!b2 " + (!b2 ));

        System.out.println("(i1<i2) || (f1>f2)" + ((i1<i2)||(f1>f2)));


        double salarioMensal = 11300;
        double mediaSalario = 10200;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        System.out.println((salarioMensal < mediaSalario ) && (quantidadeDependentes >= mediaDependentes));


        boolean salariobaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        System.out.println((salariobaixo) && (muitosDependentes));

        boolean recebeAuxilio = (salariobaixo) && (muitosDependentes);

        System.out.println("recebe auxilio " + recebeAuxilio);


    }
}
