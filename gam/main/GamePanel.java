package main;


import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Dimension;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import main.inputs.KeyboardInputs;
import main.inputs.MouseInputs;

import java.awt.Graphics;

public class GamePanel extends JPanel{
    private MouseInputs mouseInputs;
    public static int dx = 500;
    public static int dy = 500;
    public static Rectangle rect = new Rectangle(300,150);
    public static GameObject obj1 = new GameObject(rect, true, 500, 500);
    JTextField textField = new JTextField();
    
    
    
    

    public GamePanel(){
        mouseInputs = new MouseInputs(this);
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs ); 
        
        
        textField.setSize(new Dimension(250,50));
        
        
        
        
        

        
    }   

    

    public void changeDX(int value){
        this.dx += value;
        repaint();
    }
    public void changeDY(int value){
        this.dy += value;
        repaint();

    }
    public void setRectPos(GameObject obj, int x, int y){
        obj.setX(x);
        obj.setY(y);
        /* 
        if(obj1.getFreeFall()){
            if(obj1.getY()<1000-obj1.getRect().getHeight()){
                obj1.setY(obj1.getY()+1);
            }
        }
        */
        
        
        repaint();
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        setRectPos(obj1, obj1.getX(), obj1.getY());
        g.fillRect(obj1.getX(), obj1.getY(), (int)obj1.getRect().getWidth(),(int)obj1.getRect().getHeight());

         
    }


}
