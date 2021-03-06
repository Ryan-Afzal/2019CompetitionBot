/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class CameraController extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private Servo cameraZ = new Servo(RobotMap.CAMERA_Z);
  private Servo cameraX = new Servo(RobotMap.CAMERA_X);

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public void setX(double x) {
    cameraX.set(x);
  }

  public void setZ(double z) {
    cameraZ.set(z);
  }
}