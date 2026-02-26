package it.unipegaso;

public class Main {

    public static void main(String args[]) {
        System.out.println("Hello world!");

        if(args!=null && args.length>1) {
            System.out.println("Primo parametro = "+args[0]);
            System.out.println("Secondo parametro = "+args[1]);

            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            MathUtil mathUtil = new MathUtil(a, b);
            mathUtil.somma();

            MathUtil mathUtil2 = new MathUtil();
        }
    }

}
