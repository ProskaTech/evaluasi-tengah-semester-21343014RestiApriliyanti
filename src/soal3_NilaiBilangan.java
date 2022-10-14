/*
 * Created by 21343014_Resti Apriliyanti
 */

import javax.swing.JOptionPane;

public class soal3_NilaiBilangan {
    public static void main(String[] args) {
        
        int a=0;
        String input="";
        String keterangan="";

        input=JOptionPane.showInputDialog("Input Nilai Yang Akan Diuji : " );

        a=Integer.parseInt(input);

        if(a >= 0) {
            keterangan="Bilangan Positif";
        }
        
        else if(a <= 0) {
            keterangan="Bilangan Negatif";
        }

        else {
            keterangan="Error";
        }
            JOptionPane.showMessageDialog(null, a+ " merupakan : " +keterangan);
    }
}
