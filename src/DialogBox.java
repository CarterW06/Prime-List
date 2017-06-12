import javax.swing.*;
import java.awt.event.*;

public class DialogBox {
	static JFrame jf = new JFrame("PrimePrinter");
	static JPanel jp = new JPanel();
	static JLabel jl = new JLabel("Press the button at the right to print a prime.");
	static JButton jb = new JButton("New Prime");
	static int currentPrime;

	public static void main(String[] args) throws NumberFormatException {
		currentPrime = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your starting value.",
				"PrimePrinter", JOptionPane.PLAIN_MESSAGE));
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		jp.add(jl);
		jp.add(jb);
		jf.add(jp);
		jf.pack();
		jb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				boolean foundPrime = false;
				while (foundPrime == false) {
					if (PrimeTester.isPrime(currentPrime)) {
						foundPrime = true;
						PrimePrinter.print(currentPrime);
					}
					currentPrime++;
				}
			}
		});
	}
}
