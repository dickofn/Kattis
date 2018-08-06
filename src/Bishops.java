
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
public class Bishops {

    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            i = sc.nextInt();
            if (i == 1) {
                System.out.println("1");
            } else {
                System.out.println(((i * 2) - 2));
            }
        }

    }

}
