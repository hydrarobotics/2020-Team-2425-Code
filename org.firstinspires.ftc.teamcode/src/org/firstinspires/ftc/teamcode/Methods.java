package org.firstinspires.ftc.teamcode;

public class Methods {

    RobotHardware robot = new RobotHardware();


    public Methods() {
        //DriverControl.init();
    }

    public void start() {

    }

    public void straight(int time) throws InterruptedException{
        //DriverControl.init();
        straight();
        wait(time);

    }

    public void straight() {
        all(1);
    }

    public void strafe(String direction, int time) throws InterruptedException{
        strafe(direction);

        wait(time);
    }

    public void strafe(String direction) {
        if (direction.equalsIgnoreCase("left")) {
            front(-1);
            back(1);
        } else if (direction.equalsIgnoreCase("right")) {
            front(1);
            back(1);
        }
    }

    public void stop() {
        all(0);
    }

    public void leftSide(double power) {
        robot.leftBackMotor.setPower(power);
        robot.leftFrontMotor.setPower(power);
    }

    public void rightSide(double power) {
        robot.rightBackMotor.setPower(power);
        robot.rightFrontMotor.setPower(power);
    }

    public void front(double power) {
        robot.leftFrontMotor.setPower(power);
        robot.rightFrontMotor.setPower(power);
    }

    public void back(double power) {
        robot.leftBackMotor.setPower(power);
        robot.rightBackMotor.setPower(power);
    }

    public void all(double power) {
        robot.leftBackMotor.setPower(power);
        robot.leftFrontMotor.setPower(power);
        robot.rightBackMotor.setPower(power);
        robot.rightFrontMotor.setPower(power);
    }
}

