
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
public class ImageDecoding {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        sc.nextLine();
        while (limit != 0) {
            int first = 0;
            boolean err = false;
            for (int i = 0; i < limit; i++) {
                int second = 0;
                String input = sc.nextLine();
                String[] in = input.split("\\s+");
                if (input.charAt(0) == '#') {
                    for (int j = 1; j < in.length; j++) {
                        if (i == 0) {
                            first += Integer.parseInt(in[j]);
                        }
                        second += Integer.parseInt(in[j]);
                        if (j % 2 != 0) {
                            for (int k = 0; k < Integer.parseInt(in[j]); k++) {
                                System.out.print("#");
                            }
                        } else {
                            for (int k = 0; k < Integer.parseInt(in[j]); k++) {
                                System.out.print(".");
                            }
                        }
                    }
                    //System.out.print(first + " " + second);
                    if (first != second) {
                        err = true;
                    }
                } else {
                    for (int j = 1; j < in.length; j++) {
                        if (i == 0) {
                            first += Integer.parseInt(in[j]);
                        }
                        second += Integer.parseInt(in[j]);
                        if (j % 2 != 0) {
                            for (int k = 0; k < Integer.parseInt(in[j]); k++) {
                                System.out.print(".");
                            }
                        } else {
                            for (int k = 0; k < Integer.parseInt(in[j]); k++) {
                                System.out.print("#");
                            }
                        }
                    }
                    //System.out.print(first + " " + second);
                    if (first != second) {
                        err = true;
                    }
                }
                System.out.println("");
            }
            limit = sc.nextInt();
            sc.nextLine();
            if (err) {
                System.out.println("Error decoding image");
            }
            if (limit != 0) {
                System.out.println("");
            }
            
        }
    }

}
