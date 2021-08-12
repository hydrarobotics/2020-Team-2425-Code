package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * This file illustrates the concept of driving a path based on time.
 * It uses the common Pushbot hardware class to define the drive on the robot.
 * The code is structured as a LinearOpMode
 *
 * The code assumes that you do NOT have encoders on the wheels,
 *   otherwise you would use: PushbotAutoDriveByEncoder;
 *
 *   The desired path in this example is:
 *   - Drive forward for 3 seconds
 *   - Spin right for 1.3 seconds
 *   - Drive Backwards for 1 Second
 *   - Stop and close the claw.
 *
 *  The code is written in a simple form with no optimizations.
 *  However, there are several ways that this type of sequence could be streamlined,
 *
 * Use Android Studios to Copy this Class, and Paste it into your team's code folder with a new name.
 * Remove or comment out the @Disabled line to add this opmode to the Driver Station OpMode list
 */

@Autonomous(name="AutoLeft", group="Pushbot")

public class BlueAuto extends LinearOpMode {

    /* Declare OpMode members. */
    RobotHardware robot = new RobotHardware();

    private ElapsedTime     runtime = new ElapsedTime();


    static final double     FORWARD_SPEED = 0.1;
    static final double     TURN_SPEED    = 0.5;

    @Override
    public void runOpMode() {

        /*
         * Initialize the drive system variables.
         * The init() method of the hardware class does all the work here
         */
        robot.init(hardwareMap);
        robot.claw.setPosition(50);

        // Send telemetry message to signify robot waiting;
        telemetry.addData("Status", "Ready to run");    //
        telemetry.update();

        // Wait for the game to start (driver presses PLAY)
        waitForStart();

        // Step through each leg of the path, ensuring that the Auto mode has not been stopped along the way

        // Step 1:  Drive forward for 3 seconds


        //Its fucked up after this bit
        robot.claw.setPosition(1);
        sleep(100);


        //drive forward
        robot.leftFrontMotor.setPower(.25);
        robot.leftBackMotor.setPower(.25);
        robot.rightFrontMotor.setPower(-.25);
        robot.rightBackMotor.setPower(-.25);
        sleep(2100);


        //stop
        robot.leftFrontMotor.setPower(0);
        robot.leftBackMotor.setPower(0);
        robot.rightFrontMotor.setPower(0);
        robot.rightBackMotor.setPower(0);
        sleep(300);

        //picking up cube
        robot.claw.setPosition(0);
        //robot.claw2.setPosition(1);
        sleep(300);

        ////drive back
        robot.leftFrontMotor.setPower(-.25);
        robot.leftBackMotor.setPower(-.25);
        robot.rightFrontMotor.setPower(.25);
        robot.rightBackMotor.setPower(.25);
        sleep(400);


        //drive left
        robot.leftFrontMotor.setPower(-.5);
        robot.leftBackMotor.setPower(.5);
        robot.rightFrontMotor.setPower(-.5);
        robot.rightBackMotor.setPower(.5);
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

        //drive right
        robot.leftFrontMotor.setPower(.5);
        robot.leftBackMotor.setPower(-.5);
        robot.rightFrontMotor.setPower(.5);
        robot.rightBackMotor.setPower(-.5);
        sleep(1500);


        robot.leftFrontMotor.setPower(.5);
        robot.leftBackMotor.setPower(-.5);
        robot.rightFrontMotor.setPower(.5);
        robot.rightBackMotor.setPower(-.5);
        sleep(100);

        //one OutOfMemoryError

        robot.leftFrontMotor.setPower(.5);
        robot.leftBackMotor.setPower(-.5);
        robot.rightFrontMotor.setPower(.5);
        robot.rightBackMotor.setPower(-.5);
        sleep(2000);

        //think foward
        robot.leftFrontMotor.setPower(.25);
        robot.leftBackMotor.setPower(.25);
        robot.rightFrontMotor.setPower(-.25);
        robot.rightBackMotor.setPower(-.25);
        sleep(900);

        //stop
        robot.leftFrontMotor.setPower(0);
        robot.leftBackMotor.setPower(0);
        robot.rightFrontMotor.setPower(0);
        robot.rightBackMotor.setPower(0);
        sleep(200);

        //grab cube
        robot.claw.setPosition(0);
        //robot.claw2.setPosition(1);
        sleep(300);

        //reverse
        robot.leftFrontMotor.setPower(-.25);
        robot.leftBackMotor.setPower(-.25);
        robot.rightFrontMotor.setPower(.25);
        robot.rightBackMotor.setPower(.25);
        sleep(900);

        //(left)
        robot.leftFrontMotor.setPower(-.5);
        robot.leftBackMotor.setPower(.5);
        robot.rightFrontMotor.setPower(-.5);
        robot.rightBackMotor.setPower(.5);
        sleep(4000);

        //(stop)
        robot.leftFrontMotor.setPower(0);
        robot.leftBackMotor.setPower(0);
        robot.rightFrontMotor.setPower(0);
        robot.rightBackMotor.setPower(0);
        sleep(100);

        //(open claw)
        robot.claw.setPosition(1);
        //robot.claw2.setPosition(0);
        sleep(1000);

        //(right)
        robot.leftFrontMotor.setPower(.5);
        robot.leftBackMotor.setPower(-.5);
        robot.rightFrontMotor.setPower(.5);
        robot.rightBackMotor.setPower(-.5);
        sleep(1500);

        //(foward)
        robot.leftFrontMotor.setPower(.25);
        robot.leftBackMotor.setPower(.25);
        robot.rightFrontMotor.setPower(-.25);
        robot.rightBackMotor.setPower(-.25);
        sleep(500);


    }
}

