package drawer;

import command.Command;
import java.awt.Point;

public class DrawCommand implements Command{
    protected Drawble drawble;
    private Point position;
    public DrawCommand(Drawble drawble, Point position){
        this.drawble = drawble;
        this.position = position;
    }
    public void execute(){
        drawble.drow(position.x,position.y);
    }
}