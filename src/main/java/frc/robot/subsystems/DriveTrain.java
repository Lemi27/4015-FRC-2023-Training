/* ==================================================
 * Authors: Fawaaz Siddiqui, Lemi Miyu
 *
 * --------------------------------------------------
 * Description: Contains the basic methods to control 
 * a mecanum drivetrain
 *
 * ================================================== */

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.motorcontrol.Victor;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import frc.robot.commands.Driver;


public class DriveTrain extends SubsystemBase
{
  // HARDWARE //
  private MecanumDrive m_robotDrive;

  // declare motor controllers, solenoids, and other hardware here
  private Spark frontRight;
  private Spark backRight;
  private Spark fronLeft;
  private Victor backLeft;

  // CONSTANTS //
  public static final int FRONT_RIGHT_MOTOR = 0;
  public static final int BACK_RIGHT_MOTOR = 0;
  public static final int FRONT_LEFT_MOTOR = 0;
  public static final int BACK_LEFT_MOTOR = 0; // channels to be finalized later


  // CONSTRUCTOR //

  public DriveTrain()
  {
    // instantiate hardware
    frontRight = new Spark(FRONT_RIGHT_MOTOR);
    backRight = new Spark(BACK_RIGHT_MOTOR);
    frontLeft = new Spark(FRONT_LEFT_MOTOR)
    backLeft = new Victor(BACK_LEFT_MOTOR); 

    // invert right side motors; may change according to robot
    frontRight.setInverted(true);
    backRight.setInverted(true);

    m_robotDrive = new MecanumDrive(frontLeft, backLeft, frontRight, backRight);
  }

   // METHODS //

  public void moveMotors(double speed, double turn, double rotate)
  {
    m_robotDrive.driveCartesian(turn, speed, rotate);
  }

  public void stopMotors()
  {
      m_robotDrive.stopMotor();
  }



}
