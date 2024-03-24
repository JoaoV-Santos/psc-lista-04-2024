import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a = 0, soma = 0;

        for (int x = 0; x < 5; x++){

            System.out.print("Informe um número: ");
            a = scn.nextInt();
            soma = soma + a;
        }

        System.out.println("\nSoma: " + soma + "\nMédia: " + soma / 5);


        scn.close();
    }
}
