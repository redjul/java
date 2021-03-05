
















import java.awt.event.*;
import javax.swing.*;
// code boutton + compteur
public class Test1 implements ActionListener{
    
    JFrame jf;
    JPanel jp;
    JLabel jl1 , jl2 ; 
    int i , j ;
    
    public Test1(){
        i = 0 ;
        jl1 = new JLabel(""+i);
        jl2 = new JLabel(""+j);
        jf = new JFrame("Compteur");
        jp = new JPanel();
        
        //1er compteur
        JButton jb1 = new JButton(" C1 + ");
        jb1.addActionListener(this);
        jp.add(jb1);
        jp.add(jl1);
        
        //2eme compteur
        JButton jb2 = new JButton(" C2 + ");
        jb2.addActionListener(this);
        jp.add(jb2);
        jp.add(jl2);
        
        jf.setContentPane(jp);
        jf.pack();
        jf.setVisible(true);
    }
    
    //Méthode appelée lorsqu'on clique sur un bouton écouté
    public void actionPerformed(ActionEvent ae){
//      System.out.println("Entree dans actionPerformed()");
        JButton jb = (JButton)ae.getSource();//renvoie qui a généré ae
        String t = jb.getText();
        if(t.equals(" C1 + ")){
            i++;
            jl1.setText(""+i);
        }
        else{
            j++;
            jl2.setText(""+j);
        }
        jf.pack();
    }
}