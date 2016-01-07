package achi;
import robocode.*;
import java.awt.Color;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * AchiFirstRobot - a robot by Achi
 */
public class InfinityCircle extends Robot
{
    /**
     * run: AchiFirstRobot's default behavior
     */
    public void run() {
        // Initialization of the robot should be put here
        System.out.println("Beginning of my run method");
        setColors(Color.red,Color.blue,Color.green); // body,gun,radar

        // Robot main loop
        while ( true ){
            System.out.println("loop again");
            turnRight(10);
            ahead(10);
        }
    }

    /**
     * onScannedRobot: What to do when you see another robot
     */
    public void onScannedRobot(ScannedRobotEvent e) {
        // Replace the next line with any behavior you would like
        fire(1);
    }

    /**
     * onHitByBullet: What to do when you're hit by a bullet
     */
    public void onHitByBullet(HitByBulletEvent e) {
        // Replace the next line with any behavior you would like
        back(10);
    }

    /**
     * onHitWall: What to do when you hit a wall
     */
    public void onHitWall(HitWallEvent e) {
        // Replace the next line with any behavior you would like
        back(20);
    }
}
