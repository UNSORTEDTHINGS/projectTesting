import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class AllStudents extends JPanel {
	
	private JTextArea textArea ;
	private JButton backButton ;

	/**
	 * Constructor Initialize the contents.
	 * 
	 */
	public AllStudents() {
		this.setLayout(new BorderLayout(0, 0));
		this.textArea = new JTextArea();
		this.backButton = new JButton("GO BACK TO MAIN WINDOW");
		addingComponents();


	}
	private void addingComponents() {
		this.add(new LabelFor("ALL STUDENTS RECORDS"), BorderLayout.NORTH);
		this.add(backButton, BorderLayout.SOUTH);
		this.add(new JScrollPane(allResult(textArea)), BorderLayout.CENTER);
		this.backButton.addActionListener(a->{goBack();});
		this.backButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
	}
	
	
	private JTextArea allResult(JTextArea textArea) {
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
		return textArea;

	}
	private void goBack() {
		StudentsRecordMain.layeredPane.removeAll();
		StudentsRecordMain.layeredPane.add(StudentsRecordMain.frontPanel);
		StudentsRecordMain.layeredPane.repaint();
		StudentsRecordMain.layeredPane.revalidate();
		
	}

}
