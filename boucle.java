 import javax.swing.*;

 
public class boucle
{
    public static void main(String[] args){
        String oui="non";
        int nb=0;
        while(nb==0){
        String mot=JOptionPane.showInputDialog(null,"un mot =>");
        int cptmot = mot.length();
        System.out.println(cptmot);
        int nbpos=Integer.parseInt(JOptionPane.showInputDialog(null,"tu veux quelle lettre =>"));
        char lettre= mot.charAt(nbpos-1);
        System.out.println(lettre);
        if(oui.equals(mot)==true){
            System.out.println("salut !");
            nb=nb+1;
        }
        else{
            System.out.println("encore");

        }
       }
    }
}
