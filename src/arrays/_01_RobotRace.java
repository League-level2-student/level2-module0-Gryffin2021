package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
	//2. create an array of 5 robots.
	Robot[] arr = new Robot[15];
	//3. use a for loop to initialize the robots.
	for(int i = 0; i < arr.length; i ++) {
		arr[i] = new Robot();
		//4. make each robot start at the bottom of the screen, side by side, facing up
		arr[i].setY(650);
		arr[i].setX(75 + i * 125);
	}
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
	boolean isRacing = true;
	int winner = -1;
	while(isRacing) {
	int ran2 = 0;
	for(int i = 0; i < arr.length; i ++) {
		Random ran = new Random();
		ran2 = ran.nextInt(50);
		arr[i].setSpeed(ran2 - 25);
		arr[i].move(ran2);
		if(arr[i].getY() < 75) {
			isRacing = false;
			winner = i;
		}
	}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
	}
	//7. declare that robot the winner and throw it a party!
	int winner2 = winner + 1;
	JOptionPane.showMessageDialog(null, "Congratgulations Robot #" + winner2 + "! You are the winner!");
	arr[winner].setSpeed(100);
	arr[winner].turn(360000000);
	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
	}
}

