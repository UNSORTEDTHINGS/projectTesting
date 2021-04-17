import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

import panels.OptionsPanel;

public class ProgramRunner {

	public static JPanel frontPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		OptionsPanel window = new OptionsPanel();
		window.setPreferredSize(new Dimension(450, 300));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.pack();
	
	}	}
