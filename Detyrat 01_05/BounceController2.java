/** BounceController controls two moving balls.  */
public class BounceController2
{ private MovingBall ball1;  // model object
  private MovingBall ball2;  // model object
  private AnimationWriter2 writer; // output-view object
 int test1=0;int test2=0;
  /** Constructor BounceController initializes the controller
    * @param b1 - a ball
    * @param b2 - another ball
    * @param w - the output-view object  */
  public BounceController2(MovingBall b1, MovingBall b2, AnimationWriter2 w)
  { ball1 = b1;
    ball2 = b2;
    writer = w;
  }

  /** runAnimation  runs the animation by means of an internal clock */
  public void runAnimation()
  { int time_unit = 1; // njesia e kohes per secilin hap te animacionit
    int painting_delay = 20; 

while ( true )
          { delay(painting_delay);  // delay 20 milliseconds --- one clock ``tick''
            test1 = ball1.move(time_unit);
            test2 = ball2.move(time_unit);
            writer.repaint();  // redisplay box and ball
             
         ball1.top1(test1);
         
         ball2.top2(test2);

          }
  }

  /** delay pauses execution for  how_long  milliseconds */
  private void delay(int how_long)
  { try { Thread.sleep(how_long); }
    catch (InterruptedException e) { }
  }
}
