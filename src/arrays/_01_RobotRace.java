package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
	//2. create an array of 5 robots.
	Robot[] arr = new Robot[3];
	int radius[] = new int[3];
	int centerX = 900;
	int centerY = 650;
	//3. use a for loop to initialize the robots.
	for(int i = 0; i < arr.length; i ++) {
		arr[i] = new Robot();
		arr[i].penDown();
		radius[i] = i * 125 + 50;
		//4. make each robot start at the bottom of the screen, side by side, facing up
		arr[i].setAngle(90);
		arr[i].setY(centerY + radius[i]);
		arr[i].setX(centerX);
	}
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
	/*boolean isRacing = true;
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
	} */
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
	//7. declare that robot the winner and throw it a party!
	/*int winner2 = winner + 1;
	JOptionPane.showMessageDialog(null, "Congratgulations Robot #" + winner2 + "! You are the winner!");
	arr[winner].setSpeed(100);
	arr[winner].turn(360000000);*/
	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
	boolean isRacing = true;
	int winner = -1;
	while(isRacing) {
	int ran2 = 0;
	int ran4 = 0;
	for(int i = 0; i < arr.length; i ++) {
		Random ran = new Random();
		ran2 = ran.nextInt(25);
		arr[i].setSpeed(ran2 + 15);
		Random ran3 = new Random();
		ran4 = ran3.nextInt(5);
		for(int a = 0; a <= ran4; a ++) {
		arr[i].turn(-1);
		arr[i].move((int) (radius[i] * Math.sin(Math.toRadians(1))));
		
		}
	}
	}
	}
}


