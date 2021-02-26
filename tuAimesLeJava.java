 import javax.swing.*;

public class tuAimesLeJava{
    public static void main(String[] args){
        String oui="oui";
        int nb=0;
        
        while(nb==0){
        String ouiounon=JOptionPane.showInputDialog(null,"tu aimes le java?");
        int cptmot = ouiounon.length();
        System.out.println(cptmot);
        if(oui.equals(ouiounon)==true){
            System.out.println("bon courage");
            nb=nb+1;
        }
        else{
            System.out.println("recommence");

        }
       }
    }
}