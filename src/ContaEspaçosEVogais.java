import java.util.Scanner;

public class ContaEspaçosEVogais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strSplit = str.split(" ");
        String[] strArray = str.split("");

        char[] arrVogais = {'a', 'e', 'i', 'o', 'u'};
        int espacosEmBranco = strSplit.length - 1, quantVogais = 0;

        for (String s : strArray) {
            for (char vogal : arrVogais) {
                  if (s.toLowerCase().equals(Character.toString(vogal))) quantVogais++;
            }
        }
        System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
    }
}


//public class ContaEspaçosEVogais {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//
//        String[] strSplit = str.split(" ");
//        char[] arrVogais = {'a', 'e', 'i', 'o', 'u'};
//        int espacosEmBranco = strSplit.length - 1, quantVogais = 0;
//
//        for (String item : strSplit) {
//            // Count the number of vowels in the current item (word)
//            for (char c : item.toLowerCase().toCharArray()) {
//                if (isVowel(c)) {
//                    quantVogais++;
//                }
//            }
//        }
//
//        System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
//    }
//
//    public static boolean isVowel(char c) {
//        c = Character.toLowerCase(c);
//        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
//    }
//}
