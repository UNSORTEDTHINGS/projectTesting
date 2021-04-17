package panels;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JPanel;

import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;

@SuppressWarnings("serial")
public class OptionsPanel extends JFrame {

	private JButton goAddButton,goListButton,goSearchButton;
	private static JLayeredPane layeredPane ;
	private static JPanel frontPanel;
	
	public OptionsPanel() {
		layeredPane = new JLayeredPane();
		frontPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));
		layeredPane.setLayout(new CardLayout());
		goAddButton = new JButton("REGISTER NEW STUDENT");
		goListButton = new JButton("VIEW ALL RECORDS");
		goSearchButton = new JButton("SEARCH RECORD");
		selectionsWindowComponents();
	}

	private	void selectionsWindowComponents(){
		getContentPane().add(new LabelFor("STUDENTS RECORD"), BorderLayout.NORTH);
		getContentPane().add(layeredPane, BorderLayout.CENTER);
		layeredPane.add(frontPanel);
		frontPanel.add(new LabelFor("SELECT ONE OF THE OPTIONS BELOW"));
		buttonsAddAndSetProperties(goAddButton,goListButton,goSearchButton);
	}
	
	private void buttonsAddAndSetProperties(JButton...buttons) {
		//add to panel and set properties
		for(JButton b:buttons) {
			frontPanel.add(b);
			b.setFont(new Font("Tahoma", Font.PLAIN, 30));
			b.setFocusable(false);
			}
		//add listener
		goAddButton.addActionListener(M->jumpTo(new NewStudentPanel()));
		goListButton.addActionListener(M->jumpTo(new AllRecodPanel()));
		goSearchButton.addActionListener(M->jumpTo(new EditRecordPanel()));
	}
	private void jumpTo(JPanel panel) {
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
	}
	public static void callBack() {
		layeredPane.removeAll();
		layeredPane.add(frontPanel);
		layeredPane.repaint();
		layeredPane.revalidate();
		
	}


}
