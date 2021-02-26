import javax.swing.*;


public class Ex2MesVals
{
    public static void main(String[]args){
        cree();
        menu();
    }
    public static void cree(){
        System.out.println("cree()");
        int n= integer.parseInt(JOptionPane.showInputDialog("Nombre de valeurs?"));
        t = new int [n];
        for(int i = 0; i<t.length;i++){
        
        }
    }
   
    public static void menu(){
        int choix;
        do{
            choix = Integer.parseInt(JOptionPane.showInputDialog(
            "1.méthode affiche();\n"+
            "2 méthode supprimelesZéro();\n"+
            "3 méthode afficher();\n"+
            "0 quitter.\n"+
            "\nVotre choix??"));
            switch(choix){
                case 1: affiche();break;
                case 2: supprimeLesZeros();break;
                case 3: afficher();break;
                default: choix = 0;
            }
        }while(choix!=0);
    }
    public static void affiche(){
        System.out.println("affiche()");
        for(int i=0;i<t.length;i++){
            System.out.println(t[i]+"\t");
        }
    }
    public static void supprimeLesZeros(){
        System.out.println("Supprime les zéro ()");
        int [] temp = new int[t.length];
        int j= 0;
        for(int i=0; i< t.length; i++){
            if(t[i] !=0){
                temp[j]=t[i];
                j++;
            }
        }
        while(j<t.lenth){
            temp[j]=0;
            j++;
        }
        t =temp;
    }
    public static void afficher(){
        System.out.println("afficher()");
    }
    }

