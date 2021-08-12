package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;



@Autonomous(name="AutoRight", group="Linear Opmode")

public class Auto extends LinearOpMode {
    RobotHardware robot = new RobotHardware();
    Methods methods = new Methods();


    @Override
    public void runOpMode() throws InterruptedException {
        robot.init(hardwareMap);
        waitForStart();

        robot.claw.setPosition(1);
        sleep(100);


        //drive forward
        robot.leftFrontMotor.setPower(.25);
        robot.leftBackMotor.setPower(.25);
        robot.rightFrontMotor.setPower(-.25);
        robot.rightBackMotor.setPower(-.25);
        sleep(2300);


        //stop
        robot.leftFrontMotor.setPower(0);
        robot.leftBackMotor.setPower(0);
        robot.rightFrontMotor.setPower(0);
        robot.rightBackMotor.setPower(0);
        sleep(400);

        //picking up cube
        robot.claw.setPosition(0);
        //robot.claw2.setPosition(1);
        sleep(400);

        //drive back
        robot.leftFrontMotor.setPower(-.25);
        robot.leftBackMotor.setPower(-.25);
        robot.rightFrontMotor.setPower(.25);
        robot.rightBackMotor.setPower(.25);
        sleep(1200);


        //drive right
        robot.leftFrontMotor.setPower(.5);
        robot.leftBackMotor.setPower(-.5);
        robot.rightFrontMotor.setPower(.5);
        robot.rightBackMotor.setPower(-.5);
        sleep(3500);


        //stop
        robot.leftFrontMotor.setPower(0);
        robot.leftBackMotor.setPower(0);
        robot.rightFrontMotor.setPower(0);
        robot.rightBackMotor.setPower(0);
        sleep(100);

        //claw open
        robot.claw.setPosition(1);

        sleep(1000);

        //drive left
        robot.leftFrontMotor.setPower(-.5);
        robot.leftBackMotor.setPower(.5);
        robot.rightFrontMotor.setPower(-.5);
        robot.rightBackMotor.setPower(.5);
        sleep(1700);

        //wacky turn and realinment
        robot.leftFrontMotor.setPower(.5);
        robot.leftBackMotor.setPower(.5);
        robot.rightFrontMotor.setPower(.5);
        robot.rightBackMotor.setPower(.5);
        sleep(150);





        //one OutOfMemoryError
        //left
        robot.leftFrontMotor.setPower(-.5);
        robot.leftBackMotor.setPower(.5);
        robot.rightFrontMotor.setPower(-.5);
        robot.rightBackMotor.setPower(.5);
        sleep(2400);

        //foward
        robot.leftFrontMotor.setPower(.25);
        robot.leftBackMotor.setPower(.25);
        robot.rightFrontMotor.setPower(-.25);
        robot.rightBackMotor.setPower(-.25);
        sleep(1500);

        //stop
        robot.leftFrontMotor.setPower(0);
        robot.leftBackMotor.setPower(0);
        robot.rightFrontMotor.setPower(0);
        robot.rightBackMotor.setPower(0);
        sleep(200);

        //grab cube
        robot.claw.setPosition(0);
        //robot.claw2.setPosition(1);
        sleep(200);

        //drive backwards
        robot.leftFrontMotor.setPower(-.25);
        robot.leftBackMotor.setPower(-.25);
        robot.rightFrontMotor.setPower(.25);
        robot.rightBackMotor.setPower(.25);
        sleep(900);

        //drive right
        robot.leftFrontMotor.setPower(.5);
        robot.leftBackMotor.setPower(-.5);
        robot.rightFrontMotor.setPower(.5);
        robot.rightBackMotor.setPower(-.5);
        sleep(4000);

        //stop
        robot.leftFrontMotor.setPower(0);
        robot.leftBackMotor.setPower(0);
        robot.rightFrontMotor.setPower(0);
        robot.rightBackMotor.setPower(0);
        sleep(100);

        //drop cube
        robot.claw.setPosition(1);
        //robot.claw2.setPosition(0);
        sleep(1000);



        //left
        robot.leftFrontMotor.setPower(-.5);
        robot.leftBackMotor.setPower(.5);
        robot.rightFrontMotor.setPower(-.5);
        robot.rightBackMotor.setPower(.5);
        sleep(1300);

        //foward
        robot.leftFrontMotor.setPower(.25);
        robot.leftBackMotor.setPower(.25);
        robot.rightFrontMotor.setPower(-.25);
        robot.rightBackMotor.setPower(-.25);
        sleep(400);
    }
}

//forward
//back
//right
// public void stop() {
//TypeNotPresentExceptionleft
//forward
//grab
//back
//left
//stop
// }


