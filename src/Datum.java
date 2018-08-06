import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Datum {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int m = sc.nextInt();
        getDate(d, m);
    }

    public static void getDate(int d, int m) throws ParseException {
        String myDate = d + "/" + m + "/2009";
        Date formattedDate = new SimpleDateFormat("dd/MM/yyyy").parse(myDate);
        String dayOfWeek = new SimpleDateFormat("EEEEEEEEE").format(formattedDate);
        System.out.println(dayOfWeek);
    }
}
