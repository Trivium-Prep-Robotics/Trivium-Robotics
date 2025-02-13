package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.IMU;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.ServoImplEx;

public class Parts {

    // declaring parts
    public static DcMotor FR, FL, BR, BL;
    public static DcMotor arm;
    public static DcMotor slide;
    public static Servo claw, wrist;

    public static IMU imu;
    IMU.Parameters myIMUparameters;

    // TODO: any variables you use through out your code
    // variables you should have fs
    public static double ticksPerRev = 5281.1;

    public static double armPower;
    public static double extendPower;

    public static double driveMaxSpd;
    public static double driveSlwSpd;

    public static double openClaw;
    public static double closeClaw;

    public static double sample;
    public static double specimen;

    // VERY KNIGHTMARES SPECIFIC

    public static double pivTPR = 5 * ticksPerRev;
    public static double slideTPR = 2 * ticksPerRev;
    public static int armLow = (int)(Parts.pivTPR * 0.00);
    public static int armHigh = (int)(Parts.pivTPR * 0.25);
    public static int slideHigh = (int)(Parts.slideTPR * 0.00);
    public static int slideLow = -56000;

    public static int setArm = 0;
    public static int setSlide = 0;

    public static double slideTicksZero = 0;
    public static double slidePose = 0;

    public static boolean inEncoderS = false;
    public static boolean inEncoderA = false;
    public static boolean lims = false;


    public static double armToExtend = 0.1;

    public Parts(HardwareMap hardwareMap) {

        // TODO: assign drive train motors with config names
        FR = hardwareMap.get(DcMotor.class, "rightFront");
        FL = hardwareMap.get(DcMotor.class, "leftFront");
        BR = hardwareMap.get(DcMotor.class, "rightBack");
        BL = hardwareMap.get(DcMotor.class, "leftBack");

        // TODO: reverse a side
        FL.setDirection(DcMotorSimple.Direction.REVERSE);
        BL.setDirection(DcMotorSimple.Direction.REVERSE);

        // TODO: set zero power behavior
        FR.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        FL.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        BR.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        FL.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        // TODO: assign other motors
        arm = hardwareMap.get(DcMotor.class, "arm");

        slide = hardwareMap.get(DcMotor.class, "slide");

        arm.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        slide.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        // TODO: assign servos
        claw = hardwareMap.get(Servo.class, "claw");
        wrist = hardwareMap.get(ServoImplEx.class, "wrist"); // allows for more commands

        // TODO: set up your IMU
        imu = hardwareMap.get(IMU.class, "imu"); // Initializing IMU in Drivers Hub
        // Reconfiguring IMU orientation
        myIMUparameters = new IMU.Parameters(
                new RevHubOrientationOnRobot(
                        RevHubOrientationOnRobot.LogoFacingDirection.UP,
                        RevHubOrientationOnRobot.UsbFacingDirection.RIGHT
                )
        );
        imu.initialize(myIMUparameters);
        imu.resetYaw();
    }
}
