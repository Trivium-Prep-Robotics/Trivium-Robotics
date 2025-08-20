package org.firstinspires.ftc.teamcode.auto;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.util.Parts;
import org.firstinspires.ftc.teamcode.util.Robot;

/**
 * This is the general structure for an autonomous
 */

@Autonomous (name = "Parking", group = "Auto")
//@Disabled
public class AutoTemplate extends LinearOpMode {
    public void runOpMode() throws InterruptedException {
        Parts config = new Parts(hardwareMap); // configure robot
        Robot robot = new Robot(); // configure robot

        waitForStart();
        // this is a example of a park auto for Into The Deep season, not sure if it supports Decode season as well
        /*
        FR.setPower(0); // front right wheel isn't on
        FL.setPower(1); // front left wheel is on
        BR.setPower(1); // back right wheel is on
        BL.setPower(0);// back left wheel isn't on

        sleep(2500); // waits for 25 seconds

        // turns the wheels off
        FR.setPower(0);
        FL.setPower(0);
        BR.setPower(0);
        BL.setPower(0);
        */
    }
}
