/* ==================================================
 * Authors: Fawaaz Siddiqui, Lemi Miyu
 *
 * --------------------------------------------------
 * Description:
 *
 * ================================================== */

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.motorcontrol.Victor;
import edu.wpi.first.wpilibj.drive.MecanumDrive;


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



  // CONSTRUCTOR //

  public DriveTrain()
  {
    // instantiate hardware
    frontRight = new Spark(0);
    backRight = new Spark(1);
    fronLeft = new Spark(2);
    backLeft = new Victor(3); // channels to be determined later

    // invert right side motors; may change according to robot
    frontRight.setInverted(true);
    backRight.setInverted(true);

    m_robotDrive = new MecanumDrive(frontLeft, backLeft, frontRight, backRight);
  }

  // METHODS //


}
