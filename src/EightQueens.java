
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
public class EightQueens {
    public static void main(String[] args) {
        int x=0, y=1;
        Scanner sc = new Scanner(System.in);
        String[] q = new String[8];
        int[][] ratu = new int [8][2];
        boolean cek=false;
       
        int p=0;
        for(int i=0; i<8; i++){   
            q[i] = sc.nextLine();
            for(int j=0; j<8; j++){
                if (q[i].charAt(j) == '*') {
                    ratu[p][x]=j;
                    ratu[p][y]=i;
                    p++;
                }
            }
        }
       
        for(int i=0; i<8; i++){
            for(int j=i+1; j<8; j++){
                if(ratu[i][x]==ratu[j][x]){ // buat ke kanan
                    cek=true;
                    break;
                }
                else if(ratu[i][y]==ratu[j][y]){ // buat ke bawah     
                    cek=true;
                    break;
                }
                else if((ratu[i][x] - ratu[j][x])==(ratu[i][y] - ratu[j][y])){ // buat ke kanan bawah                   
                    cek=true;
                    break;
                }
                else if((ratu[i][x] - ratu[j][y])==(ratu[j][x] - ratu[i][y])){ // buat ke kiri bawah              
                    cek=true;
                    break;
                }
            }
        }
        if(cek){
            System.out.print("invalid");
        }
        else{
            System.out.print("valid");
        }
    }
}
