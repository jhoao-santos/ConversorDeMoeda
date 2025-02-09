import java.util.Scanner;

public class ConversorDolarReal {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        
        System.out.println("Digite o valor em euro:");
        double valorEmEuro = scanner.nextDouble();


        System.out.println("Digite a  cotação do euro : ");
        double cotacaoEuro = scanner.nextDouble();


        double valorEmReal = valorEmEuro * cotacaoEuro;
        System.out.printf("O valor em reais é: %.2f", valorEmReal);  


        
        














        scanner.close();
    }
}
