import javax.swing.*;

public class ex1
{   public static void main (String args[]){
     int compteur=0;
     int add=0;
     do{
        compteur++;
        if((compteur%5==0)||(compteur%7==0)){
           add=add+compteur;
           // System.out.println(compteur);
             }
            }while(compteur<2020);
     System.out.println(+add+"rep somme nb 2020");
}    
}
