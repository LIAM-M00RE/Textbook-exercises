import javax.swing.*;
import java.awt.*;
import java.awt.event.*;;

public class ChangingFace extends JFrame implements ActionListener{
    private boolean isHappy = true; //determine face preset
    private JButton happyButton = new JButton("smile");
    private JButton sadButton = new JButton("Frown");

    public ChangingFace(){
        setTitle("Changing face");
        setLayout(new FlowLayout());
        add(happyButton);
        add(sadButton);

        getContentPane().setBackground(Color.yellow);

        //enable button to listen for a mouse click
        happyButton.addActionListener(this);
        sadButton.addActionListener(this);

        //configure the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize (250,250);
        setLocation(300,300);
        setVisible(true);
    }
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.red);
        g.drawOval(85, 75, 75,75);
        g.setColor(Color.blue);
        g.drawOval(100,95,10,10);
        g.drawOval(135,95,10,10);
        g.drawString("changing face", 80 ,185);
        if(isHappy==true){
            g.drawArc(102,115,40,25,0,-180);
        }else{
            g.drawArc(102,115,40,25,0,180);
            }
        }
        //code event handling routine
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == happyButton){
                isHappy = true;
                repaint();
            }
            if(e.getSource()== sadButton){
                isHappy = false;
                repaint();
            }
    }
}