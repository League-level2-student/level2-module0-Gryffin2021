/*****
 * 
 * Run the FndHdnBtn.jar to play the finished game
 * 
 *****/

package arrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
	
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_FindTheHiddenButton implements ActionListener{
	JFrame window;
	JPanel panel;
	
	//1. create an array of JButtons. Don't initialize it yet.
	JButton arr[];
	//2 create an int variable called hiddenButton
	int hiddenButton = 0;
	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}
	
	public void start() {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int dif = 0;
		//3.  Ask the user to enter a positive number and convert it to an int
		int task = JOptionPane.showOptionDialog(null, "Please Select a Dificulty!", "/Select a Difficulty/", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Impossible", "Hard", "Medium", "Easy"}, null);
		if(task == 0) {
			dif = 125;
		}
		if(task == 1) {
			dif = 250;
		}
		if(task == 2) {
			dif = 500;
		}
		if(task == 3) {
			dif = 1000;
		}
		String number = JOptionPane.showInputDialog("Enter a number! (This is the difficulty modifier)");
		
		int num = Integer.parseInt(number);
		//4. Initialize the array of JButtons to be the size of the int created in step 3
		arr = new JButton[num];
		//5. Make a for loop to iterate through the JButton array
			//6. initialize each JButton in the array
			//7. add the ActionListener to each JButton
			//8. add each JButton to the panel
		for(int i = 0; i < num; i++) {
			arr[i] = new JButton();
			arr[i].addActionListener(this);
			panel.add(arr[i]);
		}
		//9 add the panel to the window
		window.add(panel);
		//10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//11. set the JFrame to visible.
		window.setVisible(true);
		//12. Give the user the instructions for the game.
		JOptionPane.showMessageDialog(null, "In this game, you are going to try to find and click the hidden button called me.");
		//13. initialize the hiddenButton variable to a random number less than the int created in step 3
		Random ran = new Random();
		int r = ran.nextInt(num);
		hiddenButton = r;
		//14. Set the text of the JButton located at hiddenButton to  "ME"
		arr[hiddenButton].setText("Me");
		//15. Use Thread.sleep(1000); to pause the program.
		//    Surround it with a try/catch - use Eclipse helper for this
		try {
			Thread.sleep(dif);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//16. Set the text of the JButton located at hiddenButton to be blank.
		arr[hiddenButton].setText(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton)e.getSource();
		
		//17. if the hiddenButton is clicked, tell the user that they win.
		if(e.getSource() == arr[hiddenButton]){
			JOptionPane.showMessageDialog(null, "You Win!");
		//18. else tell them to try again
		}else {
			JOptionPane.showMessageDialog(null, "Try again...");
		}
	}
}
