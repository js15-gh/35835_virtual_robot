package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Hello World", group = "Tutorial")
public class HelloWorld extends OpMode {

    int count = 0;

    // runs once when you press INIT
    @Override
    public void init() {
        telemetry.addData("Status", "Ready - press START");
    }

    // runs over and over after you press START
    @Override
    public void loop() {
        count = count + 1;
        telemetry.addData("Status", "Running");
        telemetry.addData("Loop count", count);
    }
}
