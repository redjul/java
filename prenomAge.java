   import javax.swing.*;


public class prenomAge
{
    public static void main (String args[]){
        String prenom;
        prenom= JOptionPane.showInputDialog("quel est ton prenom?");
        String age= JOptionPane.showInputDialog("quel est ton age?");
        int iAge= Integer.parseInt(age);
        System.out.println("Ton prénom est"+prenom+"et ton age est"+iAge);

} 
}
