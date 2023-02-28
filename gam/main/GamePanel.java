package main;


import javax.swing.JPanel;

import javafx.scene.shape.Rectangle;
import main.inputs.KeyboardInputs;
import main.inputs.MouseInputs;

import java.awt.Graphics;

public class GamePanel extends JPanel{
    private MouseInputs mouseInputs;
    public static int dx = 500;
    public static int dy = 500;
    public static Rectangle rect = new Rectangle(300,150);
    
    

    public GamePanel(){
        mouseInputs = new MouseInputs(this);
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs ); 
        
        

        
    }   

    public void changeDX(int value){
        this.dx += value;
        repaint();
    }
    public void changeDY(int value){
        this.dy += value;
        repaint();

    }
    public void setRectPos(int x, int y){
        this.dx = x;
        this.dy = y;
        repaint();
    }
    
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        g.fillRect(dx, dy, (int)rect.getWidth(),(int)rect.getHeight());
        
    }

}
