package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];

		// use a switch statement to do something cool for each option
		switch (choice) {
		case "Sunday": {
			JOptionPane.showMessageDialog(null, "I got a Sunburn.");
		}
			break;
		case "Monday": {
			JOptionPane.showMessageDialog(null, "Wah gwaan Mon.");
		}
			break;
		case "Tuesday": {
			JOptionPane.showMessageDialog(null, "I need a box of Tuels.");
		}
			break;
		case "Wednesday": {
			JOptionPane.showMessageDialog(null, "Best day to get wed.");
		}
			break;
		case "Thursday": {
			JOptionPane.showMessageDialog(null, "Is anyone Thursdey?");
		}
			break;
		case "Friday": {
			JOptionPane.showMessageDialog(null, "I think the word you're looking for is Fried man.");
		}
			break;
		case "Saturday": {
			JOptionPane.showMessageDialog(null, "Sorry you Sat that day out.");
		}
			break;
		}
	}
}
