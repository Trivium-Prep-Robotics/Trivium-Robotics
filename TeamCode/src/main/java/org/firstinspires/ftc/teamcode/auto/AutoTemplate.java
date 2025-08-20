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
        FR.setPower(0);
        FL.setPower(1);
        BR.setPower(1);
        BL.setPower(0);

        sleep(2500);


        FR.setPower(0);
        FL.setPower(0);
        BR.setPower(0);
        BL.setPower(0);
        */
    }
}
