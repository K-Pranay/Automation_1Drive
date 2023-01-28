//mytry
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class ScreenCapture
{
  public static void main(String[] argv) throws Exception {
    Robot robot = new Robot();


        // robot.delay (3000);//this time to manual opening prtscreen
        //now updated
        robot.keyPress(KeyEvent.VK_PRINTSCREEN);
        robot.keyRelease(KeyEvent.VK_PRINTSCREEN);
        robot.delay (1000);//has to be given to wait for prtscreen to open
        robot.mouseMove(0,0);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        // robot.mouseRelease(InputEvent.BUTTON1_MASK);
        // robot.mousePress(InputEvent.BUTTON1_MASK);
        // robot.delay (500); //for seeing it
        // robot.mouseMove(1920,1080);
        
        for(int i = 0 ; i <500 ; i++){
          robot.delay(1);
          robot.mouseMove((int)((1920/500.0)*i),(int)((1080/500.0)*i));
          System.out.println("x = " + (int)((1920/500.0)*i) + " y = " + (int)((1080/500.0)*i));
        }
        robot.mouseMove(1920,1080);
        robot.delay (500);//for visual appeal
        robot.mouseRelease(InputEvent.BUTTON1_MASK);

        // Understood and working now

        robot.delay (500); //just time for next application 
  }
}
