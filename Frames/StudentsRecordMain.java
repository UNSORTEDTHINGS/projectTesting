import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class StudentsRecordMain {

	private JFrame frame;
	public static JLayeredPane layeredPane = new JLayeredPane();
	public static JPanel frontPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentsRecordMain window = new StudentsRecordMain();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentsRecordMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		layeredPane.setLayout(new CardLayout(0,0));
				
		frame.getContentPane().add(new LabelFor("STUDENTS RECORD"), BorderLayout.NORTH);
		frame.getContentPane().add(layeredPane, BorderLayout.CENTER);
				
		frontPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));
		layeredPane.add(frontPanel);
		frontPanel.add(new LabelFor("SELECT ONE OF THE OPTIONS BELOW"));
		
		JButton goAddButton = new JButton("REGISTER NEW STUDENT");
		goAddButton.addActionListener(M->jumpTo(new Registration()));
		goAddButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		goAddButton.setAlignmentY(0.0f);
		goAddButton.setAlignmentX(0.5f);
		frontPanel.add(goAddButton);
		
		JButton goListButton = new JButton("VIEW ALL RECORDS");
		goListButton.addActionListener(M->jumpTo(new AllStudents()));
		goListButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		goListButton.setAlignmentX(1.0f);
		frontPanel.add(goListButton);
		
		JButton goSearchButton = new JButton("SEARCH RECORD");
		goSearchButton.addActionListener(M->jumpTo(new Edit()));
		goSearchButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		frontPanel.add(goSearchButton);
	}
	private void jumpTo(JPanel panel) {
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
	}

	}
