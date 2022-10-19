//Created by 21343077_Glody Syah Rabbynawa

import javax.swing.JOptionPane;
public class tiga {
    public static void main(String[] args){
        int number2;
        String number;

        number = JOptionPane.showInputDialog("Masukkan angka = ");
        number2 = Integer.parseInt(number);

        if (number2 >= 0){
             String msg = " Angka"+number2+" Tersebut bernilai positif";
             JOptionPane.showMessageDialog(null, msg);
        }
        else {
            String msg = "Angka "+number2+" tersebut bernilai negatif";
            JOptionPane.showMessageDialog(null, msg);
        }

        
    }
}

