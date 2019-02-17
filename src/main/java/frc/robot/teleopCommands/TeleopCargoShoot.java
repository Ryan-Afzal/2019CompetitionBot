/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.teleopcommands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.subsystems.CargoArm;

public class TeleopCargoShoot extends Command {
  public TeleopCargoShoot() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.cargoArm);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    if (Robot.oi.isOperatorButtonDown(RobotMap.SHOOT_OUT_BUTTON)){
      Robot.cargoArm.shootOut();
    }
    if (Robot.oi.isOperatorButtonDown(RobotMap.SHOOT_IN_BUTTON)){
      Robot.cargoArm.shootIn();
    }
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return (Robot.oi.isOperatorButtonDown(RobotMap.SHOOT_OUT_BUTTON) == false);
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.cargoArm.stopShoot();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
