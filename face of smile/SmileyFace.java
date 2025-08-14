import java.awt.*;
import javax.swing.*;
public class SmileyFace extends JFrame {
    public SmileyFace(){
        setTitle("Smiley Face");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250,220);
        setLocation(300,300);
        getContentPane().setBackground(Color.yellow);
        setVisible(true);
    }

    public void paint(Graphics g){
        super.paint(g);//call the paint method of the superclass
        g.setColor(Color.red);
        g.drawOval(85, 75, 75,75);
        g.setColor(Color.blue);
        g.drawOval(100,95,10,10);
        g.drawOval(135,95,10,10);
        g.drawArc(102,115,40,25,0,-180);
        g.drawString("Smiley Face", 90,175);
    }
}
