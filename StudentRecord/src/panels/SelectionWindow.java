package panels;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JPanel;

import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class SelectionWindow {

	public JFrame frame;
	public static JLayeredPane layeredPane = new JLayeredPane();
	public static JPanel frontPanel;
	private JButton goAddButton,goListButton,goSearchButton;

	
	public SelectionWindow() {
		frame = new JFrame();
		frontPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));
		layeredPane.setLayout(new CardLayout(0,0));
		goAddButton = new JButton("REGISTER NEW STUDENT");
		goListButton = new JButton("VIEW ALL RECORDS");
		goSearchButton = new JButton("SEARCH RECORD");
		addCurrentsCoponents();
	}

		
	private	void addCurrentsCoponents(){
		componentsProperties();
		frame.getContentPane().add(new LabelFor("STUDENTS RECORD"), BorderLayout.NORTH);
		frame.getContentPane().add(layeredPane, BorderLayout.CENTER);
		layeredPane.add(frontPanel);
		frontPanel.add(new LabelFor("SELECT ONE OF THE OPTIONS BELOW"));		
		frontPanel.add(goAddButton);
		frontPanel.add(goListButton);
		frontPanel.add(goSearchButton);
		//add listeners		
		goAddButton.addActionListener(M->jumpTo(new NewStudentPanel()));
		goListButton.addActionListener(M->jumpTo(new AllRecodPanel()));
		goSearchButton.addActionListener(M->jumpTo(new EditRecordPanel()));
				
		
	}
	private void componentsProperties() {
		goAddButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		goAddButton.setAlignmentY(0.0f);
		goAddButton.setAlignmentX(0.5f);
		goListButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		goListButton.setAlignmentX(1.0f);
		goSearchButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
	}
	private void jumpTo(JPanel panel) {
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
	}
	

	}
