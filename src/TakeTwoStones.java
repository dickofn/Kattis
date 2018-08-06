
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
public class TakeTwoStones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input%2==0) {
            System.out.println("Bob");
        } else {
            System.out.println("Alice");
        }
    }
}
