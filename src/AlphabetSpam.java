import java.util.Scanner;

public class AlphabetSpam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.next().split("_");
        double tUpCase = 0;
        double tLoCase = 0;
        double tSymbol = 0;
        double tWhiteSpace = input.length - 1;
        double total = tWhiteSpace;
        for (int i = 0; i < input.length; i++) {
            char[] temp = input[i].toCharArray();
            for (int j = 0; j < temp.length; j++) {
                total++;
                if (temp[j] >= 'A' && temp[j] <= 'Z') {
                    tUpCase++;
                } else if (temp[j] >= 'a' && temp[j] <= 'z') {
                    tLoCase++;
                } else {
                    tSymbol++;
                }
            }
        }
        System.out.println(tWhiteSpace / total);
        System.out.println(tLoCase / total);
        System.out.println(tUpCase / total);
        System.out.println(tSymbol / total);
    }
}
