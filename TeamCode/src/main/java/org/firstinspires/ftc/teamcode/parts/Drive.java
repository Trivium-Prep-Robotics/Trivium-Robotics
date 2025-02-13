package org.firstinspires.ftc.teamcode.parts;

import com.qualcomm.robotcore.hardware.Gamepad;

public interface Drive {
    public void fastSlowSpd(double fast, double slow); // setting the fast and slow speeds for drive
    public void moveRobot(double x, double y, double yaw); // move robot command
    public void feildCentric(Gamepad gamepad); // field centric drive, condition is the gamepad used
}

