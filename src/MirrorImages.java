
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
public class MirrorImages {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        

        for (int x = 0; x < t; x++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            char arr[][] = new char[r][c];
            for (int i = 0; i < r; i++) {
                String input = sc.next();
                arr[i] = input.toCharArray();
            }
            System.out.println("Test " + (x + 1));
            for (int i = r - 1; i >= 0; i--) {

                for (int j = c - 1; j >= 0; j--) {
                    System.out.print(arr[i][j]);
                }
                System.out.println("");
            }
        }
       

    }
}
