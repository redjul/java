import javax.swing.*;

public class affiTemp
{
     static double[] temp;
     public static void main(String[] args){
        ex1();
        afficheTout();
        System.out.println("Ajustement de 2.5 degrés") ;
        ajuste(2.5);
        afficheTemp();
        System.out.printl("Il y a eu"+nbJours1(19.2)+" jours à 19.2 degrés");
       }
     public static void ex1(){
       temp= new double[Integer.parseInt(JOptionPane.showInputDialog("Combien de jours?"))];
       for(int i=0; i<temp.length ; i++){
           temp[i] = Double.parseDouble(JOptionPane.showInputdialog("Température le jour"+i+"?"));
        }
      }
     public static void afficheTemp(){
        for(int i =0; i < temp.length; i++){
            System.out.println("température jour \t"+i+"\t:\t"+temp[i]);
        }
        }
      public static double donneMax(){
        double rep = temp[0];
        for(int i=1 ; 1< temp.length; i++){
         if(rep>temp[i]){
            rep= temp[i];
            }
        }
        return rep;
        }
        public static double donneMin(){
         double rep = temp [0];
         for(int i =1; 1 < temp.length ; i++){
            if(rep>temp[i]){
                rep= temp[i];
            }
            }
            return rep;
        }
     public static double donneMoyenne(){
        double somme= temp[0];
        for(int i = 1; i < temp.length ; i++){
            somme = somme + temp[i];
        }
        return somme/temp.length;
        }
     public static void afficheTout(){
        afficheTemp();
        System.out.println("la température maximale était de:"+donneMax());
        System.out.println("la température minimale était de:"+donneMin());
        System.out.println("la température moyenne était de:"+donneMoyenne());
        }
     public static void ajuste(double t){
        for (int i= 0; i < temp.length; i++){
            temp[i] = temp[i] + t;
        }
        }
     public static int nbJoursA(double t){
        int rep= 0;
        for(int i = 0; i < temp.length ; i++){
            if(temp[i]==t){rep++};
        }
        }
}

