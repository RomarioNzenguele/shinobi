import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // declaracao das variaveis
        int numero;
        String agencia, nomeCliente;
        double saldo;

        Scanner sc = new Scanner(System.in);

        // Leitura dos dados

        System.out.print("\n\nNumero da agencia: ");
        numero = sc.nextInt();
        sc.nextLine();

        System.out.print("Agencia: ");
        agencia = sc.nextLine();

        System.out.print("Nome do cliente: ");
        nomeCliente = sc.nextLine();

        System.out.print("Saldo: ");
        saldo = sc.nextDouble();

        // Saida

        System.out.println(String.format("""
                \n\n
                Olah %s, obrigado por criar uma conta em nosso banco, sua agencia eh %s,
                conta %d e seu saldo %.2f jah esta9393 disponivel para saque.
                """, nomeCliente, agencia, numero, saldo));
    }
}
