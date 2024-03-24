import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String nome = null;
        int idade = 0;
        double salario = 0;
        char sexo, estadoCivil;

        while (true){
            System.out.print("\nInforme seu nome: ");
            nome = in.nextLine();

            if (nome.length() <= 3)
                System.out.println("Nome inválido. O nome deve possuir mais de 3 caracteres.");
            else
                break;
        }

        while (true){
            System.out.print("\nInforme sua idade: ");
            idade = in.nextInt();

            if (idade < 0 || idade > 150)
                System.out.println("Idade inválida. Informe um valor entre 0 e 150.");
            else
                break;
        }

        while (true){
            System.out.print("\nInforme seu salário: ");
            salario = in.nextDouble();

            if (salario <= 0)
                System.out.println("Salário inválido. Informe um valor maior que R$ 0,00.");
            else
                break;
        }

        while (true){
            System.out.print("\nInforme seu sexo: ");
            sexo = in.next().charAt(0);

            if (sexo != 'f' && sexo != 'm')
                System.out.println("Sexo inválido. Informe um valor 'f' ou 'm'.");

            else
                break;
        }

        while (true){
            System.out.print("\nInforme seu estado civil: ");
            estadoCivil = in.next().charAt(0);

            if (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd')
                System.out.println("Estado civil inválido. Informe um valor 's' 'c' 'v' ou 'd'.");

            else
                break;
        }

        System.out.println("\n\nNome: " + nome + "\nIdade: " + idade + "\nSalário: R$ " + salario + "\nSexo: " + sexo + "\nEstado Civil: " + estadoCivil);


        in.close();
    }
}
