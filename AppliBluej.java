import javax.swing.*;
import java.awt.*;

public class AppliBluej extends JFrame{
    public AppliBluej(){
        super("Mon Bluej");
        
        JPanel jpCP = new JPanel();
        jpCP.setLayout(new BorderLayout());
        
        //zone ouest
        JPanel jpWest= new JPanel();
        jpWest.setBackground(Color.GREEN);
        jpWest.setPreferredSize(new Dimension(60,120));
        jpCP.add(jpWest , BorderLayout.WEST);
        //zone centre
        JPanel jpCenter= new JPanel();
        jpCenter.setBackground(Color.BLUE);
        jpCenter.setPreferredSize(new Dimension(200,200));
        jpCenter.add(jpWest , BorderLayout.CENTER);
        //zone Sud 1
        JPanel jpSouth= new JPanel();
        jpSouth.setBackground(Color.BLACK);
        jpSouth.setPreferredSize(new Dimension(300,80));
        jpSouth.add(jpWest , BorderLayout.SOUTH);
        //ajout 2 sous zone
        JPanel jpSWest = new JPanel();
        jpSWest.setBackground(Color.BLACK);
        jpSWest.setPreferredSize(new Dimension(145,75));
        this.setContentPane(jpCP);
        this.pack();
        this.setVisible(true);
    
    }
}
