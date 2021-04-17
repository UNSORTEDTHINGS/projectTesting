import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

import panels.SelectionWindow;

public class ProgramRunner {

	public static JPanel frontPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		SelectionWindow window = new SelectionWindow();
		window.frame.setPreferredSize(new Dimension(450, 300));
		window.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.frame.setVisible(true);
		window.frame.pack();



	}	}
