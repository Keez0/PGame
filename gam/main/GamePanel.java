package main;


import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.synth.SynthScrollBarUI;

import java.awt.Dimension;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import main.inputs.KeyboardInputs;
import main.inputs.MouseInputs;

import java.awt.Graphics;
import java.util.concurrent.SynchronousQueue;

public class GamePanel extends JPanel{
    private MouseInputs mouseInputs;
    public static int dx = 500;
    public static int dy = 500;
    public static Rectangle rect = new Rectangle(300,150);
    public static Rectangle rect2 = new Rectangle(400,400);

    public static GameObject obj1 = new GameObject(rect, true, 0, 0);
    public static GameObject obj2 = new GameObject(rect2, true, 600, 600);
    public static GameObject[] gameObjectArray = {obj1,obj2};
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
        

        for(GameObject object:gameObjectArray){
            if(object.getFreeFall()){
                if(object.getY()<1000-object.getRect().getHeight()){
                    object.setY(object.getY()+1);
                }
            }
        }
        
        
        
        
        repaint();
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        setRectPos(obj1, obj1.getX(), obj1.getY());
        g.fillRect(obj1.getX(), obj1.getY(), (int)obj1.getRect().getWidth(),(int)obj1.getRect().getHeight());
        g.fillRect(obj2.getX(), obj2.getY(), (int)obj2.getRect().getWidth(), (int)obj2.getRect().getHeight());
         
    }


}
