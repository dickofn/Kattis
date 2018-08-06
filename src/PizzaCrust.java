
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
public class PizzaCrust {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        double r = sc.nextDouble();
        double c = sc.nextDouble();
        double total = (Math.PI*r*r);
        double cheese = (Math.PI*(r-c)*(r-c));
        double persen = (cheese/total)*100;
        System.out.println(persen);
    }
}
