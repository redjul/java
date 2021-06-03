import javax.swing.*;
import java.awt.*;

public class belFlag extends JPanel{
    public belFlag(){
        super();
        Color skyblue = new Color(135,206,235);
        this.setBackground(skyblue);
        this.setPreferredSize(new Dimension(640,480));
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(20,20,10,460);
        g.fillRect(30,20,100,200);
        g.setColor(Color.YELLOW);
        g.fillRect(130,20,100,200);
        g.setColor(Color.RED);
        g.fillRect(230,20,100,200);
    }
}