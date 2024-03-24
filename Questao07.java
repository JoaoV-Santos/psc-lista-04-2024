import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a = 0;
        int maiorNumero = 0;
        int menorNumero = 0;

        for(int x = 0; x < 5; x++) {

            System.out.print("Informe um valor: ");
            a = scn.nextInt();

            if (x == 0) {

                maiorNumero = a;
                menorNumero = a;
            }
            if (a > maiorNumero)
                maiorNumero = a;
            if (a < menorNumero)
                menorNumero = a;
        }

        System.out.println("Menor número: " + menorNumero + "\nMaior Número: " + maiorNumero);


        scn.close();
    }
}
