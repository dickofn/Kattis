
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
public class Bela {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char b = sc.next().charAt(0);
        int jumlah = 0; 
       for (int i = 0; i < a*4; i++) {
            String input = sc.next();
            char inp[] = input.toCharArray();
            if (((int)inp[1])==((int)b)){
                //System.out.println(((int)inp[1])+" -- "+((int)b));
                if (inp[0]=='A') {
                    jumlah+=11;
                } else if (inp[0]=='K') {
                    jumlah+=4;
                } else if (inp[0]=='Q') {
                    jumlah+=3;
                } else if (inp[0]=='J') {
                    jumlah+=20;
                } else if (inp[0]=='T') {
                    jumlah+=10;
                } else if (inp[0]=='9') {
                    jumlah+=14;
                } else if (inp[0]=='8') {
                    jumlah+=0;
                } else if (inp[0]=='7') {
                    jumlah+=0;
                }
            } else {
                if (inp[0]=='A') {
                    jumlah+=11;
                } else if (inp[0]=='K') {
                    jumlah+=4;
                } else if (inp[0]=='Q') {
                    jumlah+=3;
                } else if (inp[0]=='J') {
                    jumlah+=2;
                } else if (inp[0]=='T') {
                    jumlah+=10;
                } else if (inp[0]=='9') {
                    jumlah+=0;
                } else if (inp[0]=='8') {
                    jumlah+=0;
                } else if (inp[0]=='7') {
                    jumlah+=0;
                }
            }
        }
        System.out.println(jumlah);
    }

}
