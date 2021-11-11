package my_project.model;

import KAGO_framework.control.ViewController;
import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

public class StackSquare extends GraphicalObject {

    private ViewController viewController;
    protected boolean ready;


    public StackSquare(double x, double y){
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    public void draw(DrawTool drawTool){
        drawTool.drawRectangle(x,y,30,20);
    }

    public void update(double dt) {
        /*while(!bestimmte y erreicht){
            y -= 100*dt;
            }
            Attribut, ob das Objekt an der richtigen Stelle ist auf true setzen, davor auf false (ready)
        }
         */
    }
}
