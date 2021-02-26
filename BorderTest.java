import javax.swing.*;
import java.awt.*;

public class BorderTest extends JFrame{
    public BorderTest(){
        super("borderLayout : Test");
        JPanel jp= new JPanel();
        BorderLayout bl = new BorderLayout ();
        jp.setLayout(bl);
        jp.add(new JButton("North"), BorderLayout.NORTH);
        jp.add(new JButton("south"), BorderLayout.SOUTH);
        jp.add(new JButton("center"), BorderLayout.CENTER);
        jp.add(new JButton("east"), BorderLayout.EAST);
        jp.add(new JButton("west"), BorderLayout.WEST);
        this.setContentPane(jp);
        this.pack();
        this.setVisible(true);
    }
}
