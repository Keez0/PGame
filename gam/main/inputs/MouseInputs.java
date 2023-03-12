package main.inputs;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import main.GamePanel;

public class MouseInputs implements MouseListener, MouseMotionListener{
    int prevX = 0;
    int prevY = 0;
    private GamePanel gamePanel;
    public MouseInputs(GamePanel gamePanel){
        this.gamePanel = gamePanel;
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
        
        int w = (int)GamePanel.rect.getWidth();
        int h = (int)GamePanel.rect.getHeight();
        int x = GamePanel.obj1.getX();
        int y = GamePanel.obj1.getY();
        int mouseX = e.getX();
        int mouseY = e.getY();
        if(mouseX>x&&mouseX<x+w&&mouseY>y&&mouseY<y+h){
            
            GamePanel.obj1.setFreeFall(false);
            if(prevX!= mouseX || prevY!= mouseY){
                
                gamePanel.setRectPos(GamePanel.obj1,GamePanel.obj1.getX()-(prevX-mouseX),GamePanel.obj1.getY()-(prevY-mouseY));
                prevX = mouseX;
                prevY = mouseY;
            }
        }
        
        
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("moved mouse");
        
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("mouse clicked");
        
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("mousePressed");
        int w = (int)GamePanel.rect.getWidth();
        int h = (int)GamePanel.rect.getHeight();
        int x = GamePanel.dx;
        int y = GamePanel.dy;
        int mouseX = e.getX();
        int mouseY = e.getY();
        if(mouseX>x&&mouseX<x+w&&mouseY>y&&mouseY<y+h){
            prevX = e.getX();
            prevY = e.getY();
        }
        


        
        
        
        
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    
}
