
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
public class Apaxiaaaaaaaaaaaans {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char inp[] = input.toCharArray();
        String jawaban = "";
        jawaban += inp[0];
        for (int i = 1; i < inp.length; i++) {
            if (inp[i] != inp[i - 1]) {
                jawaban += inp[i];
            }
        }
        System.out.println(jawaban);
    }
}
