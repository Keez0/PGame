package main.inputs;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import main.GameObject;
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
        GameObject[] referenceArray = GamePanel.gameObjectArray;
        for(GameObject obj:referenceArray){
            int w = (int)obj.rect.getWidth();
            int h = (int)obj.rect.getHeight();
            int x = obj.getX();
            int y = obj.getY();
            int mouseX = e.getX();
            int mouseY = e.getY();
            if(mouseX>x&&mouseX<x+w&&mouseY>y&&mouseY<y+h){
            
                obj.setFreeFall(false);
                if(prevX!= mouseX || prevY!= mouseY){
                
                    gamePanel.setRectPos(obj,obj.getX()-(prevX-mouseX),obj.getY()-(prevY-mouseY));
                    prevX = mouseX;
                    prevY = mouseY;
            }
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
        GameObject[] referenceArray = GamePanel.gameObjectArray;
        for(GameObject obj:referenceArray){
            int w = (int)obj.rect.getWidth();
            int h = (int)obj.rect.getHeight();
            int x = obj.getX();
            int y = obj.getY();
            int mouseX = e.getX();
            int mouseY = e.getY();
            if(mouseX>x&&mouseX<x+w&&mouseY>y&&mouseY<y+h){
                prevX = e.getX();
                prevY = e.getY();
        }
    }
        


        
        
        
        
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        GameObject[] referenceArray = GamePanel.gameObjectArray;
        for(GameObject obj:referenceArray){
            obj.setFreeFall(true);
        }
        
        
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
