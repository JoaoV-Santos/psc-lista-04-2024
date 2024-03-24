import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int c = 0;

        System.out.print("Informe o primeiro valor: ");
        int a = in.nextInt();
        System.out.print("Informe o segundo valor: ");
        int b = in.nextInt();

        if (b < a){
            c = a;
            a = b;
            b = c;
        }

        for (int i = a; i < b; i++)
            System.out.println(i);

        in.close();
    }
}
