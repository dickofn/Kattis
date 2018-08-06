
import java.util.ArrayList;
import java.util.List;
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
public class PasingHex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            List<String> ls = new ArrayList<>();
            String input = sc.nextLine();
            char[] inp = input.toCharArray();
            for (int i = 0; i < inp.length; i++) {
                String temp = "";
                try {
                    if (inp[i] == 48) {
                        if (inp[i + 1] == 'x' || inp[i + 1] == 'X') {

                            temp += "0" + inp[(i + 1)];
                            for (int j = i + 2; j < inp.length; j++) {
                                if ((inp[j] > 47 && inp[j] < 58) || (inp[j] > 64 && inp[j] < 71) || (inp[j] > 96 && inp[j] < 103)) {
                                    temp += inp[j];
                                    i = j;
                                } else {
                                    i = j;
                                    break;
                                }
                            }
                            if (Long.parseLong(temp.substring(2), 16) <= Long.parseLong("ffffffff", 16)) { //supaya gk ngelebihin batas maximal yaitu ffffffff dan cuma terjangkau dengan data long, int kurang banyak
                                System.out.println(temp + " " + Long.parseLong(temp.substring(2), 16));
                            }

                        }
                    }
                } catch (Exception e) {
                }
            }
        } while (sc.hasNextLine());

    }
}
