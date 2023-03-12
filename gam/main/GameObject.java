package main;
import javafx.scene.shape.Rectangle;



public class GameObject {
    private Rectangle rect;
    private boolean freeFall;
    private int x;
    private int y;



    public GameObject(Rectangle rect, boolean freeFall,int x, int y){
        this.rect = rect;
        this.freeFall = freeFall;
        this.x = x;
        this.y = y;

    }



    public Rectangle getRect(){
        return this.rect;
    }
    public boolean getFreeFall(){
        return this.freeFall;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void setFreeFall(boolean freeFall) {
        this.freeFall = freeFall;
    }
    public void setRect(Rectangle rect) {
        this.rect = rect;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    


}
