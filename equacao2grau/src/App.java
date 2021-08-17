import java.util.Scanner;
public class App {
 
     /* ------------------- Fórmula
            delta = b*b - 4*a*c
            x1 = (- b + √delta)/2*a
            x2 = (- b - √delta)/2*a
         */
 
    public static void main(String args[]) {
    
        int a;
        int b;
        int c;
        double delta;
        double x1;
        double x2;
        String msg = null;

        //Leitura dos dados
        Scanner sc = new Scanner(System.in);
        //***
        System.out.println("\n========= Equação do IIº Grau ==========\n ");
        System.out.print("Valor de a:  ");
        a = sc.nextInt();
        System.out.print("Valor de b:  ");
        b = sc.nextInt();
        System.out.print("Valor de c:  ");
        c = sc.nextInt();

        //*** calcular o valor do delta
        delta = Math.pow(b, 2) - 4 * a * c;

        // 1) Se delta for menor que zero; 
        if (delta < 0) {
            msg =  String.format("%n*** Delta = %.2f -> logo a equação não possui resultados reais.%n%n", delta);
        } else if (delta >= 0) { //2) Se delta for igual ou maior do que zero.
            x1 = (-b + Math.sqrt(delta)) / 2 * a;
            x2 = (-b - Math.sqrt(delta)) / 2 * a;
            msg = String.format("%n*** Delta = %.2f -> logo a equação possui resultados reais:%n"
            + "%n[(-b + √delta)/2.a]   X1 = %.2f" 
            + "%n[(-b - √delta)/2.a]   X2 = %.2f %n", delta, x1, x2);
        }

        //Imprimindo o resultado
        System.out.println(msg);

    }

}
