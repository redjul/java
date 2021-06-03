import javax.swing.*;

public class Appli extends JFrame{
    public Appli(){
        super("Appli de dessin de base");
        //panneau de contenu
        // /!\ On veut dessiner dans le JPanel, c-à-d on veut
        //       un JPanel qui est amélioré !!! 
        JPanel jp= new belFlag();
        //JPDrawingPanel jpDraw = new JPDrawingPanel();
        //jpDraw.add(new JButton("Test"));
        //Adapter le tout avant de rendre visible
        this.setContentPane(jp);
        this.pack();
        this.setVisible(true);
    }
}