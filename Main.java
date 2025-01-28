package Main;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
	static int tick = 0;
	public static void main(String args[]) {
		JFrame fr = new JFrame();
		JButton button = new JButton("Click me!");
		button.addActionListener(e -> {
			
			tick++;
			fr.setTitle("Clickosour : " + tick);
		});
		fr.add(button);
		fr.setLocationRelativeTo(null);
		fr.setSize(320, 200);
		fr.setResizable(false);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setVisible(true);

	}
}