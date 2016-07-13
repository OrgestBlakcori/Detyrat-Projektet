import java.awt.*;
/** BoxWriter displays a box */
public class BoxWriter
{ private Box box; // the (address of the) box object that is displayed
/** Constructor BoxWriter displays the box
* @param b - the box that is displayed */
public BoxWriter(Box b)
{ box = b; }
/** paint paints the box
* @param g - the graphics pen used to paint the box */
public void paint(Graphics g)
{ int size = box.sizeOf();
g.setColor(Color.white);
g.fillRect(0, 0, size, size);
g.setColor(Color.black);
g.drawRect(0, 0, size, size);
int p=((3)*(size)/8);
int o=((size)/4);
g.fillRect(98, 70, 4, 40);
//g.drawRect(size/2,size/4,0,size/2);
}
}
