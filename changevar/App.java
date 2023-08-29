import java.util.Scanner;

public class App {
    public static void main(String args[]) {
        // Declaração das variáveis
        int x, y;

        // Leitura dos dados
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor de x:  ");
        x = sc.nextInt();
        System.out.print("Valor de y:  ");
        y = sc.nextInt();

        // *** Trocar os valores
        x = x + y; // criando um total
        y = x - y; // Valor de y = total - y (introduzido)
        x = x - y; // Valor de y = total - y (anterior)

        // Imprimindo o resultado
        System.out.printf("\n**** Valores trocados\n" +
                "x: %d, y: %d\n", x, y);
    }
}
