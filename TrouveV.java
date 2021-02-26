import javax.swing.*;


public class TrouveV
{
   static double[] temp;
    public static void main(String[] args){
    int V = Integer.parseInt(JOptionPane.showInputDialog("Donne un nombre"));
    temp = new double[Integer.parseInt(JOptionPane.showInputDialog("Taille tableau"))];
    for(int i = 0 ; i < temp.length ; i++){
        temp[i]= Double.parseDouble(JOptionPane.showInputDialog("Case "+(i+1)+" ?" ));
    }
    for(int i =0 ; i < temp.length ; i++){
        if(temp[i]== V){
            System.out.println("v se trouve dans le Tableau");
    }
        else{ 
            System.out.println(" y a pas v");
        }
    }
}
}

