import javax.swing.*;


public class square{
       public static void main (String args[]){
           int a= Integer.parseInt(JOptionPane.showInputDialog("un nombre"));
           int b= Integer.parseInt(JOptionPane.showInputDialog("un autre nombre"));
           int resultat= a+b;
           double c=Math.sqrt(resultat);
           double d= Math. pow (c, 2);
           System.out.println(a+"+"+b+"= "+resultat);
           System.out.println(c);
           System.out.println(d);

       }
}
