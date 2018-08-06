import java.util.Scanner;

public class Autori {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String[] inputArr = input.split("-");
        for (int i = 0; i < inputArr.length; i++) {
            System.out.print(inputArr[i].charAt(0));
        }
    }
}
