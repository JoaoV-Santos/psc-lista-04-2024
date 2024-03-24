import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            int anos = 0;

            System.out.print("\n\nInforme a população do país A: ");
            double a = in.nextDouble();
            System.out.print("\nInforme a porcentagem do crescimento populacional anual do país A: ");
            double crescimentoA = in.nextDouble();
            crescimentoA = (crescimentoA / 100) + 1;

            System.out.print("\nInforme a população do país B: ");
            double b = in.nextDouble();
            System.out.print("\nInforme a porcentagem do crescimento populacional anual do país B: ");
            double crescimentoB = in.nextDouble();
            crescimentoB = (crescimentoB / 100) + 1;

            while (a < b) {
                a = a * crescimentoA;
                b = b * crescimentoB;
                anos++;

            }

            System.out.println("\nSerão necessários " + anos + " anos para a população do país A ultrapasse ou iguale a população do país B.");


            System.out.print("\n\nCaso deseje encerrar o programa digite 's': ");
            char repetir = in.next().charAt(0);

            if (repetir == 's') {
                System.out.println("\nFim do programa");
                break;
            }



        }

    }

}

