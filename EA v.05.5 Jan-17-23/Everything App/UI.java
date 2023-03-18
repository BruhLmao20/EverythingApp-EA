import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame; 

public class UI {

    // TITLE: JFrame constructed in the main
    // Version 0.5.1. ==== 11-27-22 : 2:18am 
    // UI Video: https://www.youtube.com/watch?v=Kmgo00avvEw
    public static void main(String[] args) {
        
        // JFrame = a GUI window to add components to 

        JFrame frame = new JFrame(); // 1. creates a frame 

        frame.setTitle("The Everything App"); //sets title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 4. exit out of application 
        //EXIT ON CLOSE, HIDE ON CLOSE, and DO NOTHING ON CLOSE 
        frame.setResizable(false); // 5. prevent frame from being resized
        frame.setSize(420,420); // 2. x and y of frame
        frame.setVisible(true); // 3. make frame visible 


        ImageIcon image = new ImageIcon(""); // since pic is in folder, just name file name (other wise do file path)
        // import javax.swing.ImageIcon 
        // 6. create an image 
        frame.setIconImage(image.getImage()); // 7. change icon of frame
        frame.getContentPane().setBackground(new Color(112,177,245)); //https://htmlcolorcodes.components



        // ==================================================== [ WORK IN PROGRESS 7:27 ] ==============================================================
    }
}
