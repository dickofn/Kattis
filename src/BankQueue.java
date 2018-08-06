
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
public class BankQueue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int orang, waktu, temp;
        int[] menit = new int[10000];
        int[] uang = new int[10000];

        orang = sc.nextInt();
        waktu = sc.nextInt();

        for (int i = 0; i < orang; i++) {
            uang[i] = sc.nextInt();
            menit[i] = sc.nextInt();
        }

        for (int i = 0; i < orang; i++) {
            for (int j = i + 1; j < orang; j++) {
                if (menit[i] > menit[j]) {
                    temp = menit[j];
                    menit[j] = menit[i];
                    menit[i] = temp;
                    temp = uang[j];
                    uang[j] = uang[i];
                    uang[i] = temp;
                }
            }
        }

        int hasil1 = 0;
        int currTime = 0;
        for (int i = 0; i < orang; i++) {
            if (menit[i] >= currTime) {
                hasil1 += uang[i];
                currTime++;
            }
        }
        if (hasil1 > max) {
            max = hasil1;
        }

        for (int y = 0; y <= 47; y++) {
            for (int i = 0; i < orang; i++) {
                for (int j = i + 1; j < orang; j++) {
                    if (Math.abs(menit[i] - menit[j]) == y) {
                        if (uang[i] < uang[j]) {
                            temp = menit[j];
                            menit[j] = menit[i];
                            menit[i] = temp;
                            temp = uang[j];
                            uang[j] = uang[i];
                            uang[i] = temp;
                        }
                    }
                }
            }

            int hasil3 = 0;
            currTime = 0;
            for (int i = 0; i < orang; i++) {
                if (menit[i] >= currTime) {
                    hasil3 += uang[i];
                    currTime++;
                }
            }
            if (hasil3 > max) {
                max = hasil3;
            }
        }

        for (int i = 0; i < orang; i++) {
            for (int j = i + 1; j < orang; j++) {
                if (uang[i] < uang[j]) {
                    temp = menit[j];
                    menit[j] = menit[i];
                    menit[i] = temp;
                    temp = uang[j];
                    uang[j] = uang[i];
                    uang[i] = temp;
                }
            }
        }

        int hasil2 = 0;
        currTime = 0;
        for (int i = 0; i < orang; i++) {
            if (menit[i] >= currTime) {
                hasil2 += uang[i];
                currTime++;
            }
        }
        if (hasil2 > max) {
            max = hasil2;
        }

        System.out.println(max);
    }
}
