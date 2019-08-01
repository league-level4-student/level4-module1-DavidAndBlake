package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	
	// 3. Make a main method to test your method
	public static void main(String[]args) {
		_00_Horoscope zodacs = new _00_Horoscope();
		zodacs.ZodiacDisplay(Zodiac.CANCER);
	}
	
	void ZodiacDisplay(Zodiac differentSigns) {
		switch (differentSigns) {
		case ARIES: {
			JOptionPane.showMessageDialog(null, "You're going to catch fire today.");
			break;
		}
		case TAURUS: {
			JOptionPane.showMessageDialog(null, "You're a literal bull. Sorry.");
			break;
		}
		case GEMINI: {
			JOptionPane.showMessageDialog(null, "Where's your twin? You need to find a "
					+ "cloning machine PRONTO. No Gemini can function without an identical twin.");
			break;
		}
		case CANCER: {
			JOptionPane.showMessageDialog(null, "I am so sorry.");
			break;
		}
		case LEO: {
			JOptionPane.showMessageDialog(null, "Lions are awesome. Is your hair as cool as a lion's mane?");
			break;
		}
		case VIRGO:{
			JOptionPane.showMessageDialog(null, "I don't know anything about Virgos. Sorry.");
			break;
		}
		case LIBRA:{
			JOptionPane.showMessageDialog(null, "Aren't Libras an animal?");
			break;
		}
		case SCORPIO:{
			JOptionPane.showMessageDialog(null, "I'mma sting you!");
			break;
		}
		case SAGITTARIUS:{
			JOptionPane.showMessageDialog(null, "You're a proud and magnificent creature with a bow and arrow. What? You're not? Dang.");
			break;
		}
		case CAPRICORN:{
			JOptionPane.showMessageDialog(null, "What the heck do goats do in the stars?");
			break;
		}
		case AQUARIUS:{
			JOptionPane.showMessageDialog(null, "I like water.");
			break;
		}
		case PISCES:{
			JOptionPane.showMessageDialog(null, "Fishies!");
			break;
		}
		}
	}
}
