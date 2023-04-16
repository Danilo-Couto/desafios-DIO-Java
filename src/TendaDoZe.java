import java.util.Scanner;

public class TendaDoZe {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int morangos = input.nextInt();
        int macas = input.nextInt();

        int comprasEmKg = morangos + macas;

        double amount = calcPrice(morangos, macas);

        if (comprasEmKg > 8 || amount > 25 ) {
            amount *= 0.9;
        }
        System.out.println(amount);
    }

    public static double calcPrice(int morangos, int macas) {
        double amount = 0;
        if (morangos <= 5) {
            amount += 2.5 * morangos;
        } else {
            amount += 2.2 * morangos;
        }
        if (macas <= 5) {
            amount += 1.8 * macas;
        } else {
            amount += 1.5 * macas;
        }
        return amount;
    };
}


