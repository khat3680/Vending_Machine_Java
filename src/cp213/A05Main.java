package cp213;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * Main class for the Vending Machine.
 *
 * @author Anshul Khatri
 * @version 2021-03-19
 */
public class A05Main {

	public static void main(String[] args) {
		VendModel model = new VendModel();
		VendView view = new VendView(model);
		final JFrame frame = new JFrame();
		frame.setContentPane(view);
		frame.setMinimumSize(new Dimension(1, 500));
		frame.pack();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
