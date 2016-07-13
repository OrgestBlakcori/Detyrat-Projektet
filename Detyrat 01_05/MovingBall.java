/** Movin}Ball models a movin} ball */
public class MovingBall
{ private int x_pos; // ball's center x-position
private int y_pos; // ball's center y-position
private int radius; // ball's radius
private int x_velocity = +5; // horizonal speed; positive is to the ri}ht
private int y_velocity = +2; // vertical speed; positive is downwards
private Box container; // the container in which the ball travels
int ball1=2;int ball2=1;
/** Constructor Movin}Ball constructs the ball.
* @param x initial - the center o{ the ball's startin} horizontal position
* @param y initial - the center o{ the ball's startin} vertical position
* @param r - the ball's radius
* @param box - the container in which the ball travels */
public MovingBall(int x_initial, int y_initial, int r, Box box)
{ x_pos = x_initial;
y_pos = y_initial;
radius = r;
container = box;
}

public void top1(int tk1){ball1=tk1;}


public void top2(int tk2){ball2=tk2;}
/** xPosition returns the ball's current horizontal position */
public int xPosition()
{ return x_pos; }
/** yPosition returns the ball's current vertical position */
public int yPosition()
{ return y_pos; }
/** radiusO{ returns the ball's radius */
public int radiusOf()
{ return radius; }
/** move moves the ball
* @param time units - the amount o{ time since the ball last moved */
public int move(int time_units)
{ 
if((ball1+2)==ball2 || (ball1+1)==ball2||ball1==ball2||ball1==(ball2+1)||ball1==(ball2+2)||ball1==(ball2+3)){x_velocity = -x_velocity;}
if(container.neKH(x_pos) && container.neKV(y_pos))
{x_velocity = -x_velocity ; y_velocity  = -y_velocity ;}

x_pos = x_pos + (x_velocity * time_units);
if ( container.inHorizontalContact(x_pos) )
{ x_velocity = -x_velocity; } // reverse horizontal direction
y_pos = y_pos + (y_velocity * time_units);
if ( container.inVerticalContact(y_pos) )
{ y_velocity = -y_velocity; } // reverse vertical direction

return x_pos;
}
}