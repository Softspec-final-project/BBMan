package game;

import model.Block;
import runHere.Main;

public class MetalBlock extends Block {
    private int x;
    private int y;
    private Main display;

    public MetalBlock(int x, int y, Main display) {
        super();
        this.x = x;
        this.y = y;
        this.display = display;
    }

    @Override
    public void render() {
        super.render();
        display.fill(120,100,240);
        display.rect(this.x,this.y,BLOCK_WIDTH,BLOCK_HIGHT);
    }

}
