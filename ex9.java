import javax.swing.*;


public class ex9{  
    public static void main (String args[]){
     String s=JOptionPane.showInputDialog("ton texte:");
     System.out.println(s);
     int a=(s.length());
     int cpt=0;
     while(cpt<a){
        System.out.println(s.charAt(0+cpt));
        cpt++; 
     }
     
     System.out.println();
     int i=s.length()-1;
     while(i>=0){
        System.out.println(s.charAt(i));
        i--;
     }
     
     System.out.println(s);
     System.out.println(s.charAt(0));
     int b=(s.length());
     b = b-1;
     int j=0;
     while(j>b)
     System.out.println(s.charAt(b));
}
}
     
    
