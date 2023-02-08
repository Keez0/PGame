package main;


import javax.swing.JPanel;

import main.inputs.KeyboardInputs;
import main.inputs.MouseInputs;

import java.awt.Graphics;

public class GamePanel extends JPanel{
    private MouseInputs mouseInputs;
    private int dx = 0, dy = 0;

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

        g.fillRect(dx, dy, 300, 150);
    }

}
