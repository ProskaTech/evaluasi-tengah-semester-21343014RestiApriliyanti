/*
 * Created by 21343014_Resti Apriliyanti
 */

public class soal1_PolaNomor {
    public static void main(String[] args) {
        int a, b;

        for(a = 0; a <= 1; a=+2) {
            System.out.print("  ");

            for(b = 2; b <= 3; b++) {
                System.out.print(b);
            }
            System.out.print(" ");
        
            for(b = 4; b <= 5; b++) {
                System.out.print(b);
            }
            System.out.println();
        
            for(b = 1; b <= 4; b++) {
                System.out.print(b);
            }
            System.out.print(" ");
        
            for(b = 5; b <= 8; b++) {
                System.out.print(b);
            }
            System.out.println();
        }

        for(a = 1; a >= 1; a--) {
            for(b = 1; b <= 9; b++) {
                System.out.print(b);
            }
            System.out.println();
            System.out.print(" ");

            for(b = 1; b <= 7; b++) {
                System.out.print(b);
            }
            System.out.println();
            System.out.print("  ");

            for(b = 1; b <= 5; b++) {
                System.out.print(b);
            }
            System.out.println();
            System.out.print("   ");

            for(b = 1; b <= 3; b++) {
                System.out.print(b);
            }
            System.out.println();
            System.out.print("    ");

            for(b = 1; b <= 1; b++) {
                System.out.print(b);
            }
        }
    }    
}
