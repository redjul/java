import javax.swing.*;

public class ex3C
{
    static int[] temp;
    public static void main(String[] args){
    temp = new int[Integer.parseInt(JOptionPane.showInputDialog("Taille de tableau"))];
    
    for(int i = 0 ; i < temp.length ; i++){
        temp[i]= Integer.parseInt(JOptionPane.showInputDialog("Case "+(i+1)+" ?" ));
    }
    int tempo = 0;
    int indice = 0;
    for(int i = 0 ; i < temp.length ; i++){
        
        if(temp[i] >tempo){
        tempo = temp[i];
        indice = i;
        }
        
    }
    JOptionPane.showMessageDialog(null,"Le nombre le plus grand est "+tempo+" son indice est "+indice + " son rang en rang Humain est "+(indice+1));
    }
}
