import javax.swing.JOptionPane;
import javax.xml.bind.ParseConversionEvent;

public class PiDAay {
	public static void main(String[] args) {
		String Pi = "3.141592653589793238462643383279502884197169399375105820974944592307816";
		System.out.print("Pi is ");
		for (int i = 0; i < 4; i++) {
			System.out.print(Pi.charAt(i));
		}

		for (int i = 4; i < Pi.length(); i++) {

			String guess = JOptionPane.showInputDialog("What is the next digit of pi?");
			if (guess.equals(Character.toString(Pi.charAt(i)))) {
				JOptionPane.showMessageDialog(null, "You got it, but do you know the next digit?");
				System.out.print(Pi.charAt(i));
			} else {
				JOptionPane.showInternalMessageDialog(null, "YOU NO GET PIE!!!");
				System.exit(0);
			}
			
		}
	}
}