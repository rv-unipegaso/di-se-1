package it.unipegaso;

public class MathUtil {

    private int a;
    private int b;

    public MathUtil(){
        this.a = 0;
        this.b = 0;
    }

    public MathUtil(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void somma() {
        try {
            int somma = a + b;
            System.out.println("La somma è " + somma);

            switch(somma) {
                case 20: System.out.println("Sei nel primo caso"); break;
                case 30: System.out.println("Sei nel secondo caso"); break;
                case 40: System.out.println("Sei nel terzo caso"); break;
                case 50: System.out.println("Sei nel quarto caso"); break;
                default: System.out.println("Nessuno dei precedenti");
            }

        } catch(java.lang.NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Non hai inserito 2 interi!");
        }
    }
}
