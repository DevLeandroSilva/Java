package fundamentos;
import jdk.nashorn.internal.scripts.JO;

import javax.swing.JOptionPane;
import java.sql.SQLOutput;

public class ConversaoTiposPrimitivos {
    public static void main (String[]args){
       String a = JOptionPane.showInputDialog("Digite um numero");
       String b = JOptionPane.showInputDialog("Digite um outro numero");
       String soma = a + b;
       System.out.println("O resultado da soma é:"+ soma);
    }

}
