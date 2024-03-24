import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        int a = in.nextInt();
        System.out.print("Informe o segundo valor: ");
        int b = in.nextInt();

        for (int i = a; i < b; i++)
            System.out.println(i);

        in.close();
    }
}
