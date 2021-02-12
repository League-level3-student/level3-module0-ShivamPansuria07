package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {

// 2. create an array of 5 robots.
		Robot[] robots = new Robot[5];
		// 3. use a for loop to initialize the robots.
		for (int j = 0; j < 5; j++) {
			robots[j] = new Robot();
		}
		
		// 4. make each robot start at the bottom of the screen, side by side, facing up
for (int i = 0; i < robots.length; i++) {
			
			robots[0].moveTo(670, 550);
			robots[1].moveTo(100, 550);
			robots[2].moveTo(300, 550);
			robots[3].moveTo(500, 550);
			robots[4].moveTo(800, 550);
			
			
			
		
			

		}

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
for (int i = 0; i < robots.length; i++) {
	Robot r = robots[i];
	Random rand = new Random();
	int random = rand.nextInt(51);
	r.move(random);
}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
for (int i = 0; i < robots.length; i++) {
while(robots[i].getX()==0) {
	JOptionPane.showMessageDialog(null, "Congrats Robot:" + robots[i]);
}
}
		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
	}
}
