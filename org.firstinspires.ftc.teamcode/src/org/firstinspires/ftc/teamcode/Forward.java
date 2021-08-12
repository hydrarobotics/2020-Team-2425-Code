package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name="Forward", group="Pushbot")

public class Forward extends LinearOpMode {
    RobotHardware robot = new RobotHardware();
    Methods methods = new Methods();


    @Override
    public void runOpMode() throws InterruptedException {
        robot.init(hardwareMap);
        waitForStart();

        robot.leftFrontMotor.setPower(.25);
        robot.leftBackMotor.setPower(.25);
        robot.rightFrontMotor.setPower(-.25);
        robot.rightBackMotor.setPower(-.25);
        sleep(2300);

        robot.leftFrontMotor.setPower(0);
        robot.leftBackMotor.setPower(0);
        robot.rightFrontMotor.setPower(0);
        robot.rightBackMotor.setPower(0);
        sleep(200);


    }}
