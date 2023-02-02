import edu.wpi.first.wpilibj.Joystick;


public class Driver {

    // DECLARE HARDWARE
    public Joystick throttle;
    public Joystick steer;


    public Driver(Robot robot)
    {
        throttle = new Joystick(0); // to be set later
        steer = new Joystick(1); 
    }
    
}
