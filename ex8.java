import javax.swing.*;

public class ex8
{
    public static void main (String args[]){
     String s=JOptionPane.showInputDialog("ton texte");
     System.out.println(s);
     System.out.println(s.charAt(0));
     int a=(s.length());
     a = a-1;
     System.out.println(s.charAt(a));
    
}
}
