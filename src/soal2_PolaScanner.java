/*
 * Created by 21343014_Resti Apriliyanti
 */

import java.util.Scanner;

public class soal2_PolaScanner {
    public static void main(String[] args) {
        int a, b, c;
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Batas : ");
        int input = in.nextInt();

        for(a = 1; a <= input; a++) {
            for(b = 1; b < a; b++) {
                System.out.print(" ");
            }
            for(c = a; c <= input; c++) {
                System.out.print("# ");
            }
            System.out.println(" ");
        }

        for(a = input; a >= 1; a--) {
            for(b = 1; b < a; b++) {
                System.out.print(" ");
            }
            for(c = a; c <= input; c++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }  
}
