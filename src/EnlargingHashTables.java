
import java.util.HashMap;
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
public class EnlargingHashTables {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long input = 1, output = 0, j;
        int sum = 0;
        HashMap<Long, Boolean> isPrime = new HashMap<>();
        do {
            input = sc.nextInt();
            long inputtemp = input;

            boolean pr = true;

            if (isPrime.get(input) != null) {
                if (isPrime.get(input) == false) {
                    pr = false;
                }
            } else {
                if (input != 2 && input != 5 && input % 10 == 2 && input % 10 == 4 && input % 10 == 5 && input % 10 == 6 && input % 10 == 8 && input % 10 == 0) {
                    isPrime.put(input, false);
                    pr = false;
                } else {
                    while (inputtemp != 0) {
                        int lastdigit = (int) (inputtemp % 10);
                        sum += lastdigit;
                        inputtemp /= 10;
                    }
                    if (sum % 3 == 0 && input != 3) {
                        isPrime.put(input, false);
                        pr = false;
                    } else {
                        for (long i = 2; i <= input / 2; i++) {
                            if (input % i == 0) {
                                isPrime.put(input, false);
                                pr = false;
                                break;
                            } else {
                                isPrime.put(input, true);
                                pr = true;
                            }
                        }
                    }
                }
            }

            for (long i = 2 * input; i < 3 * input; i++) {
                if (isPrime.get(i) != null) {
                    if (isPrime.get(i)) {
                        output = i;
                        break;
                    }
                } else {
                    boolean cek = true;
                    for (j = 2; j < i / 2; j++) {
                        if (i % j == 0) {
                            isPrime.put(i, false);
                            cek = false;
                            break;
                        }
                    }
                    if (cek) {
                        isPrime.put(i, true);
                        output = i;
                        break;
                    }
                }
            }

            if (input != 0) {
                if (pr) {
                    System.out.println(output);
                } else {
                    System.out.println(output + " (" + input + " is not prime)");
                }
            }
        } while (input != 0);

    }

}
