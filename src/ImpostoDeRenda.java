import java.io.IOException;
import java.util.*;

public class ImpostoDeRenda {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        // double renda = leitor.nextDouble();
        double renda = 3002;
        double imposto;

        LinkedHashMap<Integer, Double> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(0, 0.00);
        linkedHashMap.put(2000, 0.08);
        linkedHashMap.put(3000, 0.18);
        linkedHashMap.put(4500, 0.28);

        System.out.println(linkedHashMap);

        Iterator<Map.Entry<Integer, Double>> iterator = linkedHashMap.entrySet().iterator();
        Map.Entry<Integer, Double> previousEntry = null;

        while (iterator.hasNext()) {
            Map.Entry<Integer, Double> entry = iterator.next(); // key: value
            int faixaDeRenda = entry.getKey(); // key
            double IR = entry.getValue(); // value

            if (faixaDeRenda > renda) {
                int previousFaixaDeRenda = previousEntry.getKey();
                double previousIR = previousEntry.getValue();

//                System.out.println("previousFaixaDeRenda " + previousFaixaDeRenda + " e previousIR: " + previousIR);
//                System.out.println("baseDeCalculo " + baseDeCalculo);
//                System.out.println("ImpostoPago " + ImpostoPago);
                break;
            }
            previousEntry = entry;
        }
    }
}
