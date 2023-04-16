import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();
        String result = (checkTriangle(A, B, C));
        System.out.println(result);
    }

    private static String checkTriangle(double a, double b, double c) {
        boolean condicao1 = (a + b) > c;
        boolean condicao2 = (a + c) > b;
        boolean condicao3 = (b + c) > a;

        if (condicao1 && condicao2 && condicao3) {
            double perimetro = a + b + c;
            return "Perimetro = " + String.format("%.1f", perimetro);
        } else {
            double area = ((a + b) * c) / 2;
            return "Area = " + String.format("%.1f", area);
        }
    }
}

