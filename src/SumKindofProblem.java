
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dicko
 */
public class SumKindofProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        for (int i = 0; i < p; i++) {
            int s1 = 0;

            int index = 1;
            int unused = sc.nextInt();
            int in = sc.nextInt();
            int temp=in;
            while (temp > 0) {
                s1 += index;
                index++;
                temp--;
            }
            System.out.println(unused + " " + s1 + " " + ((s1 * 2) - in) + " " + s1 * 2);
        }
    }
}
