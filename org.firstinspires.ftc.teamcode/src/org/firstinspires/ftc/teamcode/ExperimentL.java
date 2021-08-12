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

@Autonomous(name="L Foundation", group="Pushbot")

public class ExperimentL extends LinearOpMode {

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
        robot.leftFrontMotor.setPower(.5);
        robot.leftBackMotor.setPower(.5);
        robot.rightFrontMotor.setPower(-.5);
        robot.rightBackMotor.setPower(-.5);
        sleep(1300);


        //stop
        robot.leftFrontMotor.setPower(0);
        robot.leftBackMotor.setPower(0);
        robot.rightFrontMotor.setPower(0);
        robot.rightBackMotor.setPower(0);
        sleep(300);

        //picking up cube
        robot.claw.setPosition(0);
        //robot.claw2.setPosition(1);
        sleep(400);

        ////drive back
        robot.leftFrontMotor.setPower(-.5);
        robot.leftBackMotor.setPower(-.5);
        robot.rightFrontMotor.setPower(.5);
        robot.rightBackMotor.setPower(.5);
        sleep(300);


        //drive left
        robot.leftFrontMotor.setPower(-1);
        robot.leftBackMotor.setPower(1);
        robot.rightFrontMotor.setPower(-1);
        robot.rightBackMotor.setPower(1);
        sleep(2100);


        //stop
        robot.leftFrontMotor.setPower(0);
        robot.leftBackMotor.setPower(0);
        robot.rightFrontMotor.setPower(0);
        robot.rightBackMotor.setPower(0);
        sleep(300);

        //drive forward
        robot.leftFrontMotor.setPower(.5);
        robot.leftBackMotor.setPower(.5);
        robot.rightFrontMotor.setPower(-.5);
        robot.rightBackMotor.setPower(-.5);
        sleep(50);

        //claw open
        robot.claw.setPosition(1);
        sleep(1000);

        //reverse
        robot.leftFrontMotor.setPower(-.5);
        robot.leftBackMotor.setPower(-.5);
        robot.rightFrontMotor.setPower(.5);
        robot.rightBackMotor.setPower(.5);
        sleep(50);

        //stop
        robot.leftFrontMotor.setPower(0);
        robot.leftBackMotor.setPower(0);
        robot.rightFrontMotor.setPower(0);
        robot.rightBackMotor.setPower(0);
        sleep(150);

        //drive right
        robot.leftFrontMotor.setPower(1);
        robot.leftBackMotor.setPower(-1);
        robot.rightFrontMotor.setPower(1);
        robot.rightBackMotor.setPower(-1);
        sleep(700);

        //wacky turn and realinment
        robot.leftFrontMotor.setPower(-.7);
        robot.leftBackMotor.setPower(-.7);
        robot.rightFrontMotor.setPower(-.7);
        robot.rightBackMotor.setPower(-.7);
        sleep(150);


        //one OutOfMemoryError (right)

        robot.leftFrontMotor.setPower(1);
        robot.leftBackMotor.setPower(-1);
        robot.rightFrontMotor.setPower(1);
        robot.rightBackMotor.setPower(-1);
        sleep(1650);

        // foward
        robot.leftFrontMotor.setPower(.5);
        robot.leftBackMotor.setPower(.5);
        robot.rightFrontMotor.setPower(-.5);
        robot.rightBackMotor.setPower(-.5);
        sleep(800);

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
        robot.leftFrontMotor.setPower(-.5);
        robot.leftBackMotor.setPower(-.5);
        robot.rightFrontMotor.setPower(.5);
        robot.rightBackMotor.setPower(.5);
        sleep(500);

        //(left)
        robot.leftFrontMotor.setPower(-1);
        robot.leftBackMotor.setPower(1);
        robot.rightFrontMotor.setPower(-1);
        robot.rightBackMotor.setPower(1);
        sleep(2200);

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

        //(left)
        robot.leftFrontMotor.setPower(-1);
        robot.leftBackMotor.setPower(1);
        robot.rightFrontMotor.setPower(-1);
        robot.rightBackMotor.setPower(1);
        sleep(1850);

        //stop
        robot.leftFrontMotor.setPower(0);
        robot.leftBackMotor.setPower(0);
        robot.rightFrontMotor.setPower(0);
        robot.rightBackMotor.setPower(0);
        sleep(100);



        //lift up
        robot.lift.setPower(-1);
        sleep(250);

        //stop lift
        robot.lift.setPower(0);
        sleep(450);

        //open claw
        robot.claw.setPosition(1);
        sleep(400);

        //foward
        robot.leftFrontMotor.setPower(.25);
        robot.leftBackMotor.setPower(.25);
        robot.rightFrontMotor.setPower(-.25);
        robot.rightBackMotor.setPower(-.25);
        sleep(1250);

        //lift down
        robot.lift.setPower(1);
        sleep(250);

        //stop lift
        robot.lift.setPower(0);
        sleep(450);

        //backup
        robot.leftFrontMotor.setPower(-.5);
        robot.leftBackMotor.setPower(-.5);
        robot.rightFrontMotor.setPower(.5);
        robot.rightBackMotor.setPower(.5);
        sleep(2000);

        //lift up
        robot.lift.setPower(-1);
        sleep(250);

        //stop lift
        robot.lift.setPower(0);
        sleep(450);


        //right
        robot.leftFrontMotor.setPower(1);
        robot.leftBackMotor.setPower(-1);
        robot.rightFrontMotor.setPower(1);
        robot.rightBackMotor.setPower(-1);
        sleep(800);

        //lift down
        robot.lift.setPower(1);
        sleep(250);

        //stop lift
        robot.lift.setPower(0);
        sleep(450);

        //wacky turn and realinment
        robot.leftFrontMotor.setPower(-.7);
        robot.leftBackMotor.setPower(-.7);
        robot.rightFrontMotor.setPower(-.7);
        robot.rightBackMotor.setPower(-.7);
        sleep(100);

        //right
        robot.leftFrontMotor.setPower(1);
        robot.leftBackMotor.setPower(-1);
        robot.rightFrontMotor.setPower(1);
        robot.rightBackMotor.setPower(-1);
        sleep(1500);

    }
}

