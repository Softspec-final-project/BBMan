package game;

import model.Sprite;
import runHere.Main;

import java.util.Observable;
import java.util.Observer;

public class Villain implements Sprite, Observer {
    private int x;
    private int y;
    private Main display;
    private int direction;
    private boolean isAlive;

    public Villain(int x, int y, Main display) {
        this.x = x;
        this.y = y;
        this.display = display;
        this.direction = 1;
        this.isAlive = true;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void move(int m, int x, int y) {
        //TODO: move randomly

    }

    @Override
    public boolean isAlive() {
        return this.isAlive;
    }

    @Override
    public void update(Observable o, Object arg) {
        //TODO kill villain in dead area
//        if(){
//            this.isAlive = false;
//        }
    }

    @Override
    public void render() {
        if(this.direction == 1) {
            display.image(display.VillainF, this.x, this.y);
        } else if(this.direction == 2) {
            display.image(display.VillainB, this.x, this.y);
        } else if(this.direction == 3) {
            display.image(display.VillainL, this.x, this.y);
        } else if(this.direction == 4) {
            display.image(display.VillainR, this.x, this.y);
        }
    }
}
