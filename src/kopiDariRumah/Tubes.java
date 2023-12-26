package kopiDariRumah;

import javax.swing.JFrame;

/**
 *
 * @author raihan
 */
public class Tubes {
    public static void main(String[] args){
        boolean tampil = true;
        Login lg = new Login();
        lg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lg.setLocationRelativeTo(null);
        lg.pack();
        lg.setVisible(tampil);    
    }
}
