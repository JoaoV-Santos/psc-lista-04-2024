import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double nota = 11;



        while (nota < 0 || nota > 10) {
            System.out.print("\nInforme uma nota entre 0 e 10: ");
            nota = scanner.nextDouble();
            if (nota >= 0 && nota <= 10) {
                System.out.println("\nFim do Programa!");
                break;
            }
        }


        scanner.close();
    }
}
