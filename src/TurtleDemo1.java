import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;
import java.awt.Color;
import java.util.Scanner;

public class TurtleDemo1 {

    public static void main(String[] args) {
        
        
        Scanner s = new Scanner(System.in);
        int x1,y1,x2,y2;
        System.out.print("Enter x1 value: ");
        x1=s.nextInt();
        System.out.print("Enter y1 value: ");
        y1=s.nextInt();
        System.out.print("Enter x2 value: ");
        x2=s.nextInt();
        System.out.print("Enter y2 value: ");
        y2=s.nextInt();
        
        //pops up sketch window
        Pen p = new StandardPen(new SketchPadWindow(640,480));
        //draw x & y axis
        p.up();
        p.move(-320,0);
        p.down();
        p.setDirection(0); //right
        p.move(640);
        p.up();
        p.move(0,-240);
        p.down();
        p.setDirection(90);
        p.move(480);
        //draw ticks along x axis
        for (int i = -320; i < 320; i+=40) {
            drawTick(p,i,0,0);
        }
        //droaw tick along y
        for (int i = -240; i < 240; i+=40) {
            drawTick(p, 0, i, 1);
        }
        
        p.move(x1,y1);
        p.down();
        p.drawString("(" + x1 + "," + y1 + ")");
        p.move(x2, y2);
        p.drawString("(" + x2 + "," + y2 + ")");
        //draw 2 dots at either end
        drawDot(p,x1,y1);
        drawDot(p,x2,y2);

    }
    
    //static = not attached to an object
    public static void drawTick(Pen p, int xloc, int yloc, int dir){
       //dir 0 = x dir 1 = y
       p.up();
       p.move(xloc,yloc);
       p.down();
       if (dir==0)p.setDirection(90);
       else p.setDirection(0);
       p.move(10);
       p.up();
       p.move(5);
       if(dir==0)p.drawString("" + xloc);
       else p.drawString("" + yloc);
    }
    
    public static void drawDot(Pen p, int xloc, int yloc){
        p.up();
        p.move(xloc, yloc);
        p.down();
        p.setWidth(10);
        p.setColor(Color.red);
        p.move(1);
        p.setWidth(1);
        p.setColor(Color.blue);
        
    }
}
