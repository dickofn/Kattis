
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dickofn
 */
public class UnBearAbleZoo {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int index = 1;
        sc.nextLine();
        while (limit != 0) {
            map = new HashMap<>();
            for (int i = 0; i < limit; i++) {
                String input = sc.nextLine();
                String lastword = input.substring(input.lastIndexOf(" ") + 1).toLowerCase();
                //System.out.println(lastword);
                if (map.get(lastword) == null) {
                    map.put(lastword, 1);
                } else {
                    map.put(lastword, map.get(lastword) + 1);
                }
            }
            System.out.println("List " + index+":");
            Map<String, Integer> map2 = new TreeMap<String, Integer>(map);
            for (HashMap.Entry<String, Integer> entry : map2.entrySet()) {
                String key = entry.getKey();
                int value = entry.getValue();
                System.out.println(key + " | " + value);
            }
            limit = sc.nextInt();
            index++;
            sc.nextLine();
        }
    }
}
