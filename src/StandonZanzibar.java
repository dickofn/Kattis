
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
public class StandonZanzibar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int importTurtle = 0;
            int curTurtle = sc.nextInt(); //inputan paling awal
            int in = sc.nextInt();//inputan keselanjutannya
            while (in != 0) {
                if (in > (2 * curTurtle)) { //karena hanya ada importTurtle kalau jumlah lebih besar dari 2x curTurtle
                    importTurtle += in - (2 * curTurtle);
                }
                curTurtle=in; //jumlah yang baru selalu dianggap curTurtle lagi
                in = sc.nextInt();
            }
            System.out.println(importTurtle);
        }
    }
}
