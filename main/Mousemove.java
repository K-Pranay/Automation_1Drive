import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

//this one to remove that notification
public class Mousemove {
  public static void main(String[] argv) throws Exception {
    Robot robot = new Robot();
    robot.mouseMove(1874,941);


    //below extra
        //robot.delay (500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
  }
}
