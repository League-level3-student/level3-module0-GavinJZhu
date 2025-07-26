package _02_Firework_Display;

import java.awt.*;
import java.util.Random;

import static _02_Firework_Display.FireworkDisplay.HEIGHT;
import static _02_Firework_Display.FireworkDisplay.WIDTH;

/*
 *
 * You can think of a fire work as an array of sparks. Run the demo jar to see the finished product
 * then complete the steps.
 *
 */

public class Firework {
    public static final int GRAVITY = 1;

    // 1. Create an array of Spark objects called sparks. Don't initialize it.
    Spark[] sparks;
    public boolean dead = false;

    public Firework() {
        // 2. Initialize the Spark array to contain 100 Sparks. 
        sparks = new Spark[100];

        // 3. Iterate through the sparks and initialize each one to a new Spark.
        //    Make each spark start at the middle bottom of the screen.
        for (int i = 0; i < sparks.length; i++) {
            sparks[i] = new Spark(WIDTH / 2, HEIGHT);
        }
    }

    public void launch() {
        // 4. Iterate through the sparks and reset their x and y location
        //    to their original starting point.
        for (int i = 0; i < sparks.length; i++) {
            sparks[i].x = WIDTH/2;
            sparks[i].y = HEIGHT;
        }
    }

    public void updateSparks() {
        // 8. Uncomment this code. See if you can understand what it is doing.

        for (int i = 0; i < sparks.length; i++) {
            //update sparks location to match with speed
            Spark s = sparks[i];
            s.x += s.xVelocity;
            s.y += s.yVelocity;
            //increases velocity of each spark
            s.yVelocity += GRAVITY;

            //lets each spark take off
            if (s.yVelocity >= 0 && !s.fire) {
                Random r = new Random();
                s.xVelocity = r.nextInt(40) - 20;
                s.yVelocity += -r.nextInt(10) - 5;
                s.size = r.nextInt(7) + 2;
                s.fire = true;
            }
            //sets sparks to dead when it has hit the bottom of the screen
            if (s.y >= FireworkDisplay.HEIGHT) {
                s.dead = true;
            }
        }

        //checks for when all sparks are dead, then declares the entire program dead
        for (int i = 0; i < sparks.length; i++) {
            if (!sparks[i].dead) {
                dead = false;
                break;
            }
            dead = true;
        }
    }

    public void drawSparks(Graphics g) {
        // 5. Iterate through each spark
        for (Spark spark : sparks) {
            // 6. Set the color to the spark's color with g.setColor()
            g.setColor(Color.yellow);
            // 7. Fill in an oval using the spark's x, y, and size with g.fillOval()
            g.fillOval(spark.x, spark.y, 10, 10);
        }
    }
}
