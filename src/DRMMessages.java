import java.util.Scanner;

public class DRMMessages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.next();
        char[] msgArray = msg.toCharArray();
        String first = "", second = "", last = "";

        //-65 for change the default ascii of 'A' 65 to 0

        int rotate = 0;
        for (int i = 0; i < msgArray.length / 2; i++) {
            rotate += (int) msgArray[i] - 'A';
        }
        for (int i = 0; i < msgArray.length / 2; i++) {
            char temp = (char) ('A' + ((msgArray[i] - 'A' + rotate) % 26));
            first += (char) (temp);
        }

        rotate = 0;
        for (int i = msgArray.length / 2; i < msgArray.length; i++) {
            rotate += (int) msgArray[i] - 'A';
        }
        for (int i = msgArray.length / 2; i < msgArray.length; i++) {
            char temp = (char) ('A' + ((msgArray[i] - 'A' + rotate) % 26));
            second += (char) (temp);
        }

        char[] farray = first.toCharArray();
        char[] sarray = second.toCharArray();

        for (int i = 0; i < farray.length; i++) {
            char temp = (char) ('A' + ((farray[i] - 'A' + sarray[i] - 'A') % 26));
            last += (char) (temp);
        }

        System.out.println(last);
    }
}
