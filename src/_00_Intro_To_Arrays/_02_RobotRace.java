package _00_Intro_To_Arrays;


import org.jointheleague.graphical.robot.Robot;

import java.util.Random;

public class _02_RobotRace {
    // 1. make a main method
    public static void main(String[] args) {
        // 2. create an array of 5 robots.
        Robot[] robot = new Robot[10];
        // 3. use a for loop to initialize the robots.
        for (int i = 0; i < robot.length; i++) {
            robot[i] = new Robot();
            robot[i].setSpeed(25);
        }
        // 4. make each robot start at the bottom of the screen, side by side, facing up
        for(int i = 0; i<robot.length; i++){
            //robot[i].moveTo((500-robot.length*50)+(i*100), 525);
            robot[i].moveTo(500, 525);
            robot[i].turn(90);
        }
        boolean done = false;
        while(!done) {

            // 5. use another for loop to iterate through the array and make each robot move
            // a random amount less than 50.
            Random ran = new Random();

            for (Robot value : robot) {
                int moveValue = ran.nextInt(50);
                //value.move(moveValue);
                moveAngle(value, moveValue/-4, moveValue);
            }
            //end of step 5
            //start of step 6
            //iterate through every single robot and check y value

            for (int i = 0; i < robot.length; i++) {
                int xValue = robot[i].getX();
                int yValue = robot[i].getY();
//                if (yValue<50){
//                    done = true;
//                    //step 7
//                    System.out.println("Robot "+(i+1)+" just won! Woohoo!");
//                    break;
//                }
                if (xValue<500 && yValue>525){
                    done = true;
                    //step 7
                    System.out.println("Robot "+(i+1)+" just won! Woohoo!");
                    break;
                }
            }
        }
        // 6. use a while loop to repeat step 5 until a robot has reached the top of the
        // screen.

        // 7. declare that robot the winner and throw it a party!

        // 8. try different races with different amounts of robots.

        // 9. make the robots race around a circular track.
    }
    static void moveAngle(Robot robot, int deg, int dist){
        robot.turn(deg);
        robot.move(dist);
    }
}
