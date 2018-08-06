
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
public class Skener {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int zr = sc.nextInt();
        int zc = sc.nextInt();
        char arr[][] = new char[r][c];
        for (int i = 0; i < r; i++) {
            String input = sc.next();
            arr[i] = input.toCharArray();
        }
        for (int i = 0; i < r; i++) {
            for (int y = 0; y < zr; y++) {           
                for (int j = 0; j < c; j++) {
                    for (int x = 0; x < zc; x++) {
                        System.out.print(arr[i][j]);
                    }
                }
                System.out.println("");
            }
        }
    }
}
