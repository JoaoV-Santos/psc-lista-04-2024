public class Questao04 {
    public static void main(String[] args){
        double a = 80000;
        double b = 200000;
        int anos = 0;

        while (a < b) {
            a = a * 1.03;
            b = b * 1.015;
            anos++;
        }

        System.out.println("\nSerão necessários " + anos + " anos para a população do país A ultrapasse ou iguale a população do país B.");
    }
}
