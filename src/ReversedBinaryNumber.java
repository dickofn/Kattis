
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
public class ReversedBinaryNumber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] binary = new int[100];
        int index = 0;
        while (input > 0) {
            binary[index++] = input % 2;
            input = input / 2;
        }
        String bin = "";
        for (int i = 0; i < index; i++) {
            bin += binary[i];
        }
        System.out.println(Integer.parseInt(bin, 2));
    }
}
