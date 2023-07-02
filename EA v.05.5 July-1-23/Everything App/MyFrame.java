import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{
    
    // TITLE: JFrame instance constructed in its own class 
    // Version 0.5.2. ==== 11-27-22 : 4:05pm 
    // UI Video: https://www.youtube.com/watch?v=Kmgo00avvEw

    MyFrame(){
        
        this.setTitle("The Everything App");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(420,420);
        this.setVisible(true); 


        ImageIcon image = new ImageIcon("");

        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(112,177,245));
    }

}
