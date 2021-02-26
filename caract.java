 import javax.swing.*;


public class caract
{
    public static void main(String[] args){
        String oui="non";
        int nb=0;
        while(nb==0){
        String mot=JOptionPane.showInputDialog(null,"un mot =>");
        int cptmot = mot.length();
        System.out.println(cptmot);
        char lettre= mot.charAt(cptmot-2);
        String LETTRE= String.valueOf(lettre);
        System.out.println(LETTRE.toUpperCase());
        String nbpos=JOptionPane.showInputDialog(null,"donne la position =>");
        int pos=mot.indexOf( nbpos);
        nbpos= nbpos+1;
        System.out.println(nbpos);
        String a=new StringBuilder(mot).reverse().toString();
        System.out.println(a);
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
