package pp03_abella_torregosa;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Slider extends JFrame implements ActionListener{
    
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel ras1 = new JLabel();
    JLabel ras2 = new JLabel();
    JLabel iconL1 = new JLabel();
    JLabel time = new JLabel();
    JLabel rl1 = new JLabel();
    JLabel rl2 = new JLabel();
    JLabel iconL2 = new JLabel();
    JButton piano = new JButton();
    JButton flute = new JButton();
    JButton organ = new JButton();
    JButton guitar = new JButton();
    JLabel settings = new JLabel();
    JLabel control = new JLabel();
    JComboBox music;
    JButton play = new JButton();
    JLabel notes = new JLabel();
    JButton C = new JButton();
    JButton Do = new JButton();
    JButton none = new JButton();
    JLabel iconL3 = new JLabel();
    JPanel bottom = new JPanel();
    JLabel real = new JLabel();
    
    Slider(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,600);
        this.setLayout(null);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.darkGray);
        
        panel.setBounds(0,0,1000,70);
        panel.setBackground(new Color(78,22,9));
        panel.setLayout(null);
        this.add(panel);
        
        ras1.setText("Record");
        ras1.setBounds(7,0,50,15);
        ras1.setFont(new Font("Arial Narrow",Font.PLAIN,15));
        ras1.setForeground(Color.white);
        panel.add(ras1);
        
        ras2.setText("As Sound");
        ras2.setBounds(0,15,70,15);
        ras2.setFont(new Font("Arial Narrow",Font.PLAIN,15));
        ras2.setForeground(Color.white);
        panel.add(ras2);
        
        ImageIcon icon = new ImageIcon(new ImageIcon("sound.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
        iconL1.setIcon(icon);
        iconL1.setHorizontalAlignment(JLabel.CENTER);
        iconL1.setVerticalAlignment(JLabel.CENTER);
        iconL1.setBounds(60, 0, 30, 30);
        panel.add(iconL1);
        
        time.setText("00:00:00");
        time.setBounds(100,10,70,15);
        time.setFont(new Font("Arial",Font.PLAIN,12));
        time.setForeground(Color.white);
        panel.add(time);
        
        rl1.setText("Record");
        rl1.setBounds(160,0,50,15);
        rl1.setFont(new Font("Arial Narrow",Font.PLAIN,15));
        rl1.setForeground(Color.white);
        panel.add(rl1);
        
        rl2.setText("List");
        rl2.setBounds(170,15,70,15);
        rl2.setFont(new Font("Arial Narrow",Font.PLAIN,15));
        rl2.setForeground(Color.white);
        panel.add(rl2);
        
        ImageIcon icon1 = new ImageIcon(new ImageIcon("list.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
        iconL2.setIcon(icon1);
        iconL2.setHorizontalAlignment(JLabel.CENTER);
        iconL2.setVerticalAlignment(JLabel.CENTER);
        iconL2.setBounds(210, 0, 30, 30);
        panel.add(iconL2);
        
        ImageIcon icon2 = new ImageIcon(new ImageIcon("piano.png").getImage().getScaledInstance(62, 35, Image.SCALE_DEFAULT));
        piano.setIcon(icon2);
        piano.setHorizontalAlignment(JLabel.CENTER);
        piano.setVerticalAlignment(JLabel.CENTER);
        piano.setBounds(2, 35, 55, 30);
        panel.add(piano);
        
        ImageIcon icon3 = new ImageIcon(new ImageIcon("flute.png").getImage().getScaledInstance(62, 35, Image.SCALE_DEFAULT));
        flute.setIcon(icon3);
        flute.setHorizontalAlignment(JLabel.CENTER);
        flute.setVerticalAlignment(JLabel.CENTER);
        flute.setBounds(60, 35, 55, 30);
        panel.add(flute);
        
        ImageIcon icon4 = new ImageIcon(new ImageIcon("organ.png").getImage().getScaledInstance(62, 35, Image.SCALE_DEFAULT));
        organ.setIcon(icon4);
        organ.setHorizontalAlignment(JLabel.CENTER);
        organ.setVerticalAlignment(JLabel.CENTER);
        organ.setBounds(119, 35, 55, 30);
        panel.add(organ);
        
        ImageIcon icon5 = new ImageIcon(new ImageIcon("guitar.png").getImage().getScaledInstance(62, 35, Image.SCALE_DEFAULT));
        guitar.setIcon(icon5);
        guitar.setHorizontalAlignment(JLabel.CENTER);
        guitar.setVerticalAlignment(JLabel.CENTER);
        guitar.setBounds(177, 35, 55, 30);
        panel.add(guitar);
        
        settings.setText("Music Settings");
        settings.setBounds(450,0,100,15);
        settings.setFont(new Font("Arial Narrow",Font.PLAIN,15));
        settings.setForeground(Color.white);
        panel.add(settings);
        
        control.setText("Music Control");
        control.setBounds(800,0,100,15);
        control.setFont(new Font("Arial Narrow",Font.PLAIN,15));
        control.setForeground(Color.white);
        panel.add(control);
        
        String[] choices = {"Happy Birthday","A long Time","If you're Happy","Jingle Bells","Merry Christmas","Movie cycle","Twinkle Twinkle"}; 
        music = new JComboBox(choices);
        music.setBounds(730, 17, 200, 25);
        music.setFont(new Font("Arial",Font.PLAIN,12));
        music.setBackground(Color.gray);
        music.setForeground(Color.white);
        music.setFocusable(false);
        panel.add(music);
        
        ImageIcon icon6 = new ImageIcon(new ImageIcon("play.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
        play.setIcon(icon6);
        play.setHorizontalAlignment(JLabel.CENTER);
        play.setVerticalAlignment(JLabel.CENTER);
        play.setBounds(945, 16, 30, 30);
        play.setBackground(new Color(78,22,9));
        play.setFocusable(false);
        panel.add(play);
        
        notes.setText("Show Notes");
        notes.setBounds(730,50,80,15);
        notes.setFont(new Font("Arial Narrow",Font.PLAIN,15));
        notes.setForeground(Color.white);
        panel.add(notes);
        
        ImageIcon icon7 = new ImageIcon(new ImageIcon("C.png").getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT));
        C.setIcon(icon7);
        C.setHorizontalAlignment(JLabel.CENTER);
        C.setVerticalAlignment(JLabel.CENTER);
        C.setBounds(810, 45, 25, 25);
        C.setBackground(new Color(78,22,9));
        C.setFocusable(false);
        panel.add(C);
        
        ImageIcon icon8 = new ImageIcon(new ImageIcon("Do.png").getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT));
        Do.setIcon(icon8);
        Do.setHorizontalAlignment(JLabel.CENTER);
        Do.setVerticalAlignment(JLabel.CENTER);
        Do.setBounds(860, 45, 25, 25);
        Do.setBackground(new Color(78,22,9));
        Do.setFocusable(false);
        panel.add(Do);
        
        ImageIcon icon9 = new ImageIcon(new ImageIcon("none.png").getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT));
        none.setIcon(icon9);
        none.setHorizontalAlignment(JLabel.CENTER);
        none.setVerticalAlignment(JLabel.CENTER);
        none.setBounds(900, 45, 25, 25);
        none.setBackground(new Color(78,22,9));
        none.setFocusable(false);
        panel.add(none);
        
        ImageIcon icon10 = new ImageIcon(new ImageIcon("keyboard.png").getImage().getScaledInstance(1000, 400, Image.SCALE_DEFAULT));
        iconL3.setIcon(icon10);
        iconL3.setHorizontalAlignment(JLabel.CENTER);
        iconL3.setVerticalAlignment(JLabel.CENTER);
        iconL3.setBounds(0, 73, 1000, 400);
        this.add(iconL3);
        
        bottom.setBounds(0,475,1000,90);
        bottom.setBackground(Color.red);
        this.add(bottom);
        
        real.setText("Real Piano");
        real.setSize(620,60);
        real.setVerticalAlignment(JLabel.CENTER);
        real.setHorizontalAlignment(JLabel.CENTER);
        real.setFont(new Font("Arial Black",Font.ITALIC,50));
        real.setForeground(Color.white);
        bottom.add(real);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
