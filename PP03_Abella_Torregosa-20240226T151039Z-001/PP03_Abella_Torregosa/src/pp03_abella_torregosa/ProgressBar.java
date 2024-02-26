package pp03_abella_torregosa;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class ProgressBar extends JFrame{

    JFrame frame = new JFrame();
    JProgressBar pb = new JProgressBar();
    JLabel l1 = new JLabel();
    JLabel iconL = new JLabel();
    JLabel l2 = new JLabel();
    
    ProgressBar (){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,600);
        this.setLayout(null);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.darkGray);
        
        ImageIcon icon = new ImageIcon(new ImageIcon("logo.png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
        iconL.setIcon(icon);
        iconL.setHorizontalAlignment(JLabel.CENTER);
        iconL.setVerticalAlignment(JLabel.CENTER);
        iconL.setBounds(413, 30, 200, 200);
        this.add(iconL);
        
        l1.setText("Real Piano");
        l1.setBounds(360,170,500,200);
        l1.setFont(new Font("Arial Black",Font.ITALIC,50));
        l1.setForeground(Color.red);
        this.add(l1);
        
        l2.setText("Loading Sounds ...");
        l2.setBounds(420,400,200,30);
        l2.setFont(new Font("Arial Narrow",Font.ITALIC,25));
        l2.setForeground(Color.blue);
        this.add(l2);
        
        pb.setValue(0);
        pb.setBounds(145,440,700,10);
        pb.setStringPainted(true);
        pb.setFont(new Font("MV Boli",Font.BOLD,10));
        pb.setForeground(Color.green);
        this.add(pb);
        
        fill();
    }
    
    public void fill(){
        int counter = 0;
        
        while(counter<=100){
            pb.setValue(counter);
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProgressBar.class.getName()).log(Level.SEVERE, null, ex);
            }
            counter +=1;
            
            if (counter == 100){
                this.dispose();
                Slider slider = new Slider();
            }
        }
    }
}
