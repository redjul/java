import javax.swing.*;


public class entier10
{
      static double[] temp;
    public static void main(String[] args){
    temp = new double[Integer.parseInt(JOptionPane.showInputDialog("Taille tableau"))];
    for(int i = 0 ; i < temp.length ; i++){
        temp[i]= Double.parseDouble(JOptionPane.showInputDialog("Case "+(i+1)+" ?" ));
    }
    for(int i = 0 ; i < temp.length ; i++){
        if(temp[i] <= 10){
        System.out.println(temp[i]);
    }
    }
}
}


