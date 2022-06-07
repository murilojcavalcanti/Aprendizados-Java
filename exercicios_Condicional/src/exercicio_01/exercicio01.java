package exercicio_01;

public class exercicio01 {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 20;

        float f1 = 5.6f;
        float f2 = 6.9f;

        double d1 = 9.75;
        double d2 = 10.95;

        char C1 = 'c';
        char C2 ='k';

        String s1 = "moço";
        String s2 ="moça";
        String s3 ="cara";

        boolean b1 = true;
        boolean b2 = false;

        long l1 = 1568L;
        long l2 = 16548L;

        byte by1 = 1;

        short sh1 = 29;

        System.out.println("i1 == i2 " + (i1 == i2));
        System.out.println("i1 != i2 "+ (i1 != i2));
        System.out.println("i1 > i2" + (i1 > i2));
        System.out.println("i1 < i2" + (i1 <= i2));

        System.out.println("f1 == f2 " + (f1 == f2));
        System.out.println("f1 != f2 "+ (f1 != f2));
        System.out.println("f1 > f2" + (f1 > f2));
        System.out.println("f1 < f2" + (f1 <= f2));

        System.out.println("s1 == s2 " + (s1 == s2));
        System.out.println("s3 != s2 "+ (s3 != s2));
        System.out.println("l1 > l2" + (l1 > l2));
        System.out.println("c1 < c2" + (C1 <= C2));

        System.out.println("d1 == d2 " + (d1 == d2));
        System.out.println("d1 != d2 "+ (d1 != d2));
        System.out.println("sh1 > by1" + (sh1 > by1));
        System.out.println("sh1 < by1" + (sh1 <= by1));

    }
}
