
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
public class FizzBuzz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            boolean sensor = true;
            if (i % x == 0) {
                System.out.print("Fizz");
                sensor = false;
            }
            if (i % y == 0) {
                System.out.print("Buzz");
                sensor = false;
            }
            if (sensor) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }

}
