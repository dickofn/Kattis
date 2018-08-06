
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
public class Oktalini {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.next();
        String str = "";
        while (in.length() % 3 != 0) {
            in = "0" + in;
        }
        for (int i = 0; i < in.length() / 3; i++) {
            if (in.substring((i * 3), ((i * 3) + 3)).equals("000")) {
                str += "0";
            } else if (in.substring((i * 3), ((i * 3) + 3)).equals("001")) {
                str += "1";
            } else if (in.substring((i * 3), ((i * 3) + 3)).equals("010")) {
                str += "2";
            } else if (in.substring((i * 3), ((i * 3) + 3)).equals("011")) {
                str += "3";
            } else if (in.substring((i * 3), ((i * 3) + 3)).equals("100")) {
                str += "4";
            } else if (in.substring((i * 3), ((i * 3) + 3)).equals("101")) {
                str += "5";
            } else if (in.substring((i * 3), ((i * 3) + 3)).equals("110")) {
                str += "6";
            } else if (in.substring((i * 3), ((i * 3) + 3)).equals("111")) {
                str += "7";
            }
        }
        System.out.println(str);
    }
}
