/* ==================================================
 * Authors: Fawaaz Siddiqui, Lemi Miyu
 *
 * --------------------------------------------------
 * Description: 
 *
 * ================================================== */


import edu.wpi.first.wpilibj.Joystick;


public class Driver {

    // DECLARE HARDWARE
    public Joystick throttle;
    public Joystick steer;
    public Joystick rotation;


    // CONSTANTS
    public static final int THROTTLE_CHANNEL = 0;
    public static final int STEER_CHANNEL = 0;
    public static final int ROTATION_CHANNEL = 1; 


    public Driver(Robot robot)
    {
        throttle = new Joystick(THROTTLE_CHANNEL); 
        steer = new Joystick(STEER_CHANNEL); 
        rotation = new Joystick(ROTATION_CHANNEL);
    }
    

    public double getThrottle()
    {
        return throttle.getY();
    }

    public double getSteer()
    {
        return steer.getX();
    }

    public double getRotation()
    {
        return rotation.getZ();
    }


}
