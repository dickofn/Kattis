
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
public class WordforNumbers {

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            String input = sc.nextLine();
            String[] splited = input.split("\\s+");
            String hasil = "";
            for (int i = 0; i < splited.length; i++) {
                if (isInteger(splited[i])) {
                    if (Integer.parseInt(splited[i]) < 20) {
                        if (Integer.parseInt(splited[i]) == 0) {
                            hasil += "zero ";
                        } else if (Integer.parseInt(splited[i]) == 1) {
                            hasil += "one ";
                        } else if (Integer.parseInt(splited[i]) == 2) {
                            hasil += "two ";
                        } else if (Integer.parseInt(splited[i]) == 3) {
                            hasil += "three ";
                        } else if (Integer.parseInt(splited[i]) == 4) {
                            hasil += "four ";
                        } else if (Integer.parseInt(splited[i]) == 5) {
                            hasil += "five ";
                        } else if (Integer.parseInt(splited[i]) == 6) {
                            hasil += "six ";
                        } else if (Integer.parseInt(splited[i]) == 7) {
                            hasil += "seven ";
                        } else if (Integer.parseInt(splited[i]) == 8) {
                            hasil += "eight ";
                        } else if (Integer.parseInt(splited[i]) == 9) {
                            hasil += "nine ";
                        } else if (Integer.parseInt(splited[i]) == 10) {
                            hasil += "ten ";
                        } else if (Integer.parseInt(splited[i]) == 11) {
                            hasil += "eleven ";
                        } else if (Integer.parseInt(splited[i]) == 12) {
                            hasil += "twelve ";
                        } else if (Integer.parseInt(splited[i]) == 13) {
                            hasil += "thirteen ";
                        } else if (Integer.parseInt(splited[i]) == 14) {
                            hasil += "fourteen ";
                        } else if (Integer.parseInt(splited[i]) == 15) {
                            hasil += "fifteen ";
                        } else if (Integer.parseInt(splited[i]) == 16) {
                            hasil += "sixteen ";
                        } else if (Integer.parseInt(splited[i]) == 17) {
                            hasil += "seventeen ";
                        } else if (Integer.parseInt(splited[i]) == 18) {
                            hasil += "eighteen ";
                        } else if (Integer.parseInt(splited[i]) == 19) {
                            hasil += "nineteen ";
                        }
                    } else {
                        if (Integer.parseInt(splited[i]) / 10 == 2) {
                            hasil+="twenty";
                        } else if (Integer.parseInt(splited[i]) / 10 == 3) {
                            hasil+="thirty";
                        } else if (Integer.parseInt(splited[i]) / 10 == 4) {
                            hasil+="forty";
                        } else if (Integer.parseInt(splited[i]) / 10 == 5) {
                            hasil+="fifty";
                        } else if (Integer.parseInt(splited[i]) / 10 == 6) {
                            hasil+="sixty";
                        } else if (Integer.parseInt(splited[i]) / 10 == 7) {
                            hasil+="seventy";
                        } else if (Integer.parseInt(splited[i]) / 10 == 8) {
                            hasil+="eighty";
                        } else if (Integer.parseInt(splited[i]) / 10 == 9) {
                            hasil+="ninety";
                        }
                        if (Integer.parseInt(splited[i]) % 10 == 0) {
                            hasil+=" ";
                        } else if (Integer.parseInt(splited[i]) % 10 == 1) {
                            hasil+="-one ";
                        } else if (Integer.parseInt(splited[i]) % 10 == 2) {
                            hasil+="-two ";
                        } else if (Integer.parseInt(splited[i]) % 10 == 3) {
                            hasil+="-three ";
                        } else if (Integer.parseInt(splited[i]) % 10 == 4) {
                            hasil+="-four ";
                        } else if (Integer.parseInt(splited[i]) % 10 == 5) {
                            hasil+="-five ";
                        } else if (Integer.parseInt(splited[i]) % 10 == 6) {
                            hasil+="-six ";
                        } else if (Integer.parseInt(splited[i]) % 10 == 7) {
                            hasil+="-seven ";
                        } else if (Integer.parseInt(splited[i]) % 10 == 8) {
                            hasil+="-eight ";
                        } else if (Integer.parseInt(splited[i]) % 10 == 9) {
                            hasil+="-nine ";
                        }
                    }
                } else {
                    hasil += splited[i] + " ";
                }
            }
            hasil = hasil.substring(0, 1).toUpperCase() + hasil.substring(1);
            System.out.println(hasil);
        } while (sc.hasNextLine());

    }
}
