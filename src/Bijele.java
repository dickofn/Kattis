
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
public class Bijele {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int king = sc.nextInt();
        int queen = sc.nextInt();
        int rook = sc.nextInt();
        int bishop = sc.nextInt();
        int knight = sc.nextInt();
        int pawn = sc.nextInt();
        System.out.println((1 - king) + " " + (1 - queen) + " " + (2 - rook) + " " + (2 - bishop) + " " + (2 - knight) + " " + (8 - pawn));
    }

}
