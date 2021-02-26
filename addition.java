import javax.swing.*;


public class addition
{
       public static void main (String args[]){
           
           int a= Integer.parseInt(JOptionPane.showInputDialog("un nombre"));
           int b= Integer.parseInt(JOptionPane.showInputDialog("un autre nombre"));
           int resultat= a+b;
           System.out.println(a+"+"+b+"= "+resultat);
       }
}
