/* ==================================================
 * Authors:
 *
 * --------------------------------------------------
 * Description:
 *
 * ================================================== */

package frc.robot.commands;

import frc.robot.Robot;
import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class ExampleCommand extends CommandBase
{
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})

  // VARIABLES //

  private ExampleSubsystem robot;

  // CONSTANTS //



  // CONSTRUCTOR //

  public ExampleCommand(ExampleSubsystem m_exampleSubsystem)
  {
    this.robot = m_exampleSubsystem;

    // subsystems that this command requires
    //addRequirements(robot.exampleSubsystem);
  }

  // METHODS //

  // Called when the command is initially scheduled.
  @Override
  public void initialize()
  {

  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute()
  {

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted)
  {

  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished()
  {
    return false;
  }
}
