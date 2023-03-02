package main;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.GroupLayout;import javax.swing.WindowConstants;

public class GameWindow {
    private JFrame jframe;

    public GameWindow(GamePanel gamePanel){
        jframe = new JFrame();
        jframe.setSize(1500, 1500);
        jframe.setDefaultCloseOperation(3);
        
        jframe.setLocationRelativeTo(null);
        
        jframe.add(gamePanel.textField);
        gamePanel.textField.setText("test");
        gamePanel.setPreferredSize(new Dimension(1000,1000));
        jframe.add(gamePanel, BorderLayout.NORTH);
        jframe.setVisible(true);
        

    }

}
