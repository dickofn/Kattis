import java.util.Scanner;

public class DeathKnightHero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt(), total=0;
        for (int i = 0; i < cases; i++) {
            String skill = sc.next();
            if (skill.contains("CD") == false){
                total++;
            }
        }
        System.out.println(total);
    }
}
