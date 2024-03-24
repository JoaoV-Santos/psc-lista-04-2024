import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        String usuario = null;
        String senha = null;

        while (true) {
            System.out.print("\nInforme o usuário: ");
            usuario = leitor.nextLine();
            System.out.print("\nInforme a senha: ");
            senha = leitor.nextLine();

            if (senha.equals(usuario))
                System.out.println("\nA senha e o nome de usuário devem ser diferentes.\n");
            else {
                System.out.println("\nCadastro realizado com sucesso!");
                break;
            }
        }
    }
}
