import java.util.Scanner;

public class App {
    public static void main(String args[]) {
        // Declaração das variáveis
        int x;
        int y;

        // Leitura dos dados
        System.out.println("Leitura \n ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor de x:  ");
        x = sc.nextInt();
        System.out.println("Valor de y:  ");
        y = sc.nextInt();

        // *** Trocar os valores
        x = x + y; // criando um total
        y = x - y; // Valor de y = total - y (introduzido)
        x = x - y; // Valor de y = total - y (anterior)

        // Imprimindo o resultado
        System.out.println("\n**** Valores trocados\nx: " + x + "\ny: " + y);
    }
}
