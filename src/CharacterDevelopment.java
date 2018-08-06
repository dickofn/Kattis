
import java.math.BigInteger;
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
public class CharacterDevelopment {

    public static BigInteger combination(int n, int k) {
        return fact(n).divide(fact(k).multiply(fact(n - k)));
    }

    public static BigInteger fact(int a) {
        BigInteger factorial = BigInteger.ONE;

        BigInteger factz = BigInteger.valueOf(a);

        if (a == 1) {
            return factorial;
        } else {
            return factz.multiply(fact(a - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger jumlah = BigInteger.ZERO;
        int x = sc.nextInt();
        for (int i = 2; i <= x; i++) {
            jumlah.add(combination(x, 2));
        }
        System.out.println(jumlah);
    }
}
//public class CharacterDevelopment {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        long x = sc.nextInt();
//        long jumlah = 0;
//        for (long i = 2; i <= x; i++) {
//            long temp = 1;
//            for (long j = 0; j <= i; j++) {
//                temp *= (x - j);
//            }
//            temp /= i;
//            jumlah += temp;
//        }
//        System.out.println(jumlah);
//    }
//}
