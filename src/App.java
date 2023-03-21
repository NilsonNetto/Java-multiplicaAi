import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira um número inteiro para visualizar a tabuada:");
        final int baseNumber = scan.nextInt();

        System.out.println("Tabela de multiplicação de " + baseNumber);

        for (int i = 1; i < 11; i++) {
            System.out.println(baseNumber + " x " + i + " = " + baseNumber * i);
        }
    }
}
