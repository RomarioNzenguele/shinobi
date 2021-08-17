import java.util.Scanner;

public class App {

    private static final String MSGFORMATADA = "IMC = %.2f \nObS: %s ";

    public static void main(String[] args) throws Exception {

        short peso;
        double altura;
        double imc;
        String msg = null;

        // Leitura
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n*** Valor do Peso: ");
        peso = sc.nextShort();
        System.out.println("\n*** Valor da altura: ");
        String a = sc.next().replace(',', '.'); //Evitando a exception "InputMismatchException & NumberFormatException"
        altura = Double.parseDouble(a);



        //**  Processamento
        imc = (peso / Math.pow(altura, 2));
        
        if (imc < 19) {
            msg = String.format(MSGFORMATADA, imc, EnDescricao.ABAIXO_DO_PESO.descricao);
        } else if (imc >= 19 && imc <= 25) {
            msg = String.format(MSGFORMATADA, imc, EnDescricao.PESO_IDEAL.descricao);
        } else if (imc >= 26 && imc <= 30) {
            msg = String.format(MSGFORMATADA, imc, EnDescricao.SOBREPESO.descricao);
        } else if (imc >= 31 && imc <= 35) {
            msg = String.format(MSGFORMATADA, imc, EnDescricao.OBESIDADE.descricao);
        } else if (imc >= 36 && imc <= 40) {
            msg = String.format(MSGFORMATADA, imc, EnDescricao.OBESIDADE_IIG.descricao);
        } else if (imc > 40) {
            msg = String.format(MSGFORMATADA, imc, EnDescricao.OBESIDADE_IIG.descricao);
        }

        // Saída
        System.out.printf("%n*** %s %n%n**", msg);

    }
}

