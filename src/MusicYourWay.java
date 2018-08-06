
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lenovo
 */
public class MusicYourWay {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String atribut = in.nextLine();
        String splitAtribut[] = atribut.split(" ");

        int jumlahLagu = in.nextInt();

        String data[][] = new String[jumlahLagu][splitAtribut.length];

        in.nextLine();

        for (int i = 0; i < jumlahLagu; i++) {
            String list = in.nextLine();
            String tmp[] = list.split(" ");

            for (int j = 0; j < tmp.length; j++) {
                data[i][j] = tmp[j];
            }
        }

        int jumlahSort = in.nextInt();

        int sort[] = new int[jumlahSort];

        in.nextLine();

        for (int i = 0; i < jumlahSort; i++) {
            String tmp = in.nextLine();
            for (int j = 0; j < splitAtribut.length; j++) {
                if (tmp.equals(splitAtribut[j])) {
                    sort[i] = j;
                }
            }
        }

        final HashMap map = new HashMap();
        int init = 0;
        map.put(init, sort[init]);
        while (init < sort.length) {
            System.out.println(atribut);

            Arrays.sort(data, new Comparator<String[]>() {
                @Override
                public int compare(final String[] entry1, final String[] entry2) {
                    final String atribut1 = entry1[(int) map.get(0)];
                    final String atribut2 = entry2[(int) map.get(0)];
                    return atribut1.compareTo(atribut2);
                }
            });
            
            for (int i = 0; i < jumlahLagu; i++) {
                for (int j = 0; j < splitAtribut.length; j++) {
                    System.out.print(data[i][j] + " ");
                }
                System.out.println("");
            }
            
            if (init == (jumlahSort - 1)) {
                
            } else {
                System.out.println("");
            }
            
            init++;
            if (init == sort.length) {
                map.put(0, sort[init - 1]);
            } else {
                map.put(0, sort[init]);
            }
        }
    }

}
