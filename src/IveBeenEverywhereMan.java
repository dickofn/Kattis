
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dickofn
 */
public class IveBeenEverywhereMan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        for (int i = 0; i < limit; i++) {
            int limit2 = sc.nextInt();
            int count = 0;
            String input[] = new String[limit2];
            for (int j = 0; j < limit2; j++) {
                input[j] = sc.next();
                for (int k = 0; k < j; k++) {
                    if (input[j].equals(input[k])) {
                        count--;
                        break;
                    }
                }
                count++;
            }
            System.out.println(count);
        }
    }

}
