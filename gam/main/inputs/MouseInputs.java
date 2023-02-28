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
        int x = GamePanel.dx;
        int y = GamePanel.dy;
        int mouseX = e.getX();
        int mouseY = e.getY();
        if(mouseX>x&&mouseX<x+w&&mouseY>y&&mouseY<y+h){
            //gamePanel.setRectPos(mouseX-(w+x-mouseX),mouseY-(h+y-mouseY));
            if(prevX!= mouseX || prevY!= mouseY){
                GamePanel.dx -= (prevX-mouseX);
                GamePanel.dy -= (prevY-mouseY);
                gamePanel.setRectPos(GamePanel.dx,GamePanel.dy);
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
        prevX = e.getX();
        prevY = e.getY();


        
        
        
        
        
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
