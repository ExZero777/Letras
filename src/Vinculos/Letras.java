package Vinculos;


import java.util.ArrayList;
import javax.swing.JTextField;



public class Letras extends JTextField {
   private ArrayList<JTextField> text;
   private char  cont;

    public Letras(ArrayList tL, char c) {
       this.text = tL;
       this.cont = c;
   
    }
   
    
}
