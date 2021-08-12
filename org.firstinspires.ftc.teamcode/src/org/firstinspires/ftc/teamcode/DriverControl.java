package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.Range;

/**
 * This file provides basic Telop driving for a Pushbot robot.
 * The code is structured as an Iterative OpMode
 *
 * This OpMode uses the common Pushbot hardware class to define the devices on the robot.
 * All device access is managed through the HardwarePushbot class.
 *
 * This particular OpMode executes a basic Tank Drive Teleop for a PushBot
 * It raises and lowers the claw using the Gampad Y and A buttons respectively.
 * It also opens and closes the claws slowly using the left and right Bumper buttons.
 *
 * Use Android Studios to Copy this Class, and Paste it into your team's code folder with a new name.
 * Remove or comment out the @Disabled line to add this opmode to the Driver Station OpMode list
 */

@TeleOp(name="4469DC", group="teleop")

public class DriverControl extends OpMode{

    /* Declare OpMode members. */
    RobotHardware robot       = new RobotHardware();


    /*
     * Code to run ONCE when the driver hits INIT
     */
    @Override
    public void init() {
        /* Initialize the hardware variables.
         * The init() method of the hardware class does all the work here
         */
        robot.init(hardwareMap);

        // Send telemetry message to signify robot waiting;
        telemetry.addData("Status", "Initialized");
    }

    /*
     * Code to run REPEATEDLY after the driver hits INIT, but before they hit PLAY
     */
    @Override
    public void init_loop() {
    }

    /*
     * Code to run ONCE when the driver hits PLAY
     */
    @Override
    public void start() {
    }

    /*
     * Code to run REPEATEDLY after the driver hits PLAY but before they hit STOP
     */
    @Override
    public void loop() {
        double G1rightStickY = Math.pow(gamepad1.right_stick_y, 3);
        double G1leftStickY = Math.pow(gamepad1.left_stick_y, 3);
        boolean G1rightBumper = gamepad1.right_bumper;   //strafe right
        boolean G1leftBumper = gamepad1.left_bumper;    //strafe left
        //Methods methods = new Methods();
        double G2rightStickY=-gamepad2.right_stick_y;
        double G2leftStickY=-gamepad2.left_stick_y;
        boolean G2rightBumper=gamepad2.right_bumper;
        boolean G2leftBumper=gamepad2.left_bumper;






        //Right Strafe
        if (G1leftBumper)
        {
            robot.leftFrontMotor.setPower(-1);
            robot.rightFrontMotor.setPower(-1);
            robot.leftBackMotor.setPower(1);
            robot.rightBackMotor.setPower(1);
        }
        //Left Strafe
        else if (G1rightBumper)
        {
            robot.leftFrontMotor.setPower(1);
            robot.rightFrontMotor.setPower(1);
            robot.leftBackMotor.setPower(-1);
            robot.rightBackMotor.setPower(-1);
        }

        //Forward and Backward
        else
        {
            robot.leftFrontMotor.setPower(-G1leftStickY);
            robot.leftBackMotor.setPower(-G1leftStickY);
            robot.rightFrontMotor.setPower(G1rightStickY);
            robot.rightBackMotor.setPower(G1rightStickY);
        }

        if(gamepad2.a){
            robot.lift.setPower(1);

        } else if(gamepad2.y){
            robot.lift.setPower(-1);

        }else {
            robot.lift.setPower(0);
        }


        if (gamepad2.left_bumper){
            robot.claw.setPosition(1);


        }

        if (gamepad2.right_bumper){
            robot.claw.setPosition(0);

        }





        // Use gamepad buttons to move the arm up (Y) and down (A)
        //if (gamepad2.y)
        //    robot.lift.setPower(robot.ARM_UP_POWER);
        //else if (gamepad2.a)
        //    robot.lift.setPower(robot.ARM_DOWN_POWER);
        //else
        //    robot.lift.setPower(0.0);

        // Send telemetry message to signify robot running;
        //telemetry.addData("claw",  "Offset = %.2f", clawOffset);
        //telemetry.addData("left",  "%.2f", left);
        //telemetry.addData("right", "%.2f", right);
    }

    /*
     * Code to run ONCE after the driver hits STOP
     */
    @Override
    public void stop() {
    }
}

