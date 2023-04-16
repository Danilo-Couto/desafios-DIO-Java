import java.util.Scanner;

public class ImpostoDeRenda2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double renda = leitor.nextDouble();
        double imposto;

        if (renda <= 2000.00) {
            System.out.println("Isento");
        } else {
            if (renda <= 3000.00) {
                imposto = (renda - 2000.00) * 0.08;
            } else if (renda <= 4500.00) {
                imposto = (renda - 3000.00) * 0.18 + 1000.00 * 0.08;
            } else {
                imposto = (renda - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
            }

            System.out.printf("R$ %.2f%n", imposto);
        }

        leitor.close();
    }
}
