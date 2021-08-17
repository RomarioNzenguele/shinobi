import java.util.Scanner;

public class App {
    public static void main(String args[]) {

        int numero; 

        //Leitura dos dados 
        System.out.print("\n*** Digita um número:  ");
        numero = new Scanner(System.in).nextInt();

        //Imprimindo o resultado
        System.out.printf("%n*** Factorial = %d%n%n", factorial(numero));

    }

    //*** função para calcular o factorial
    // Obs: Factorial de 0 é igual a 1 
    static int factorial(int n) {
        return n == 0 ? 1 : n * factorial(n - 1);
    }

}

